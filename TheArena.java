package KnightsArena;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**This program uses the graphical user interface to display the coffee knight
 *  fight against other knights in the arena.
 *  @author Alvin Vasquez 000857238
 *  @version TheArena.java
 *  @created June 28, 2024*/
public class TheArena extends Application {
    /**Establishing constants for all the knight classes*/
    private CoffeeKnight player;
    private IronKnight lvl1;
    private SteelKnight lvl2;
    private SilverKnight lvl3;
    private GoldenKnight lvl4;
    private DiamondKnight boss;

    /**For combat class*/
    private Combat opponent;

    /**GUI variables*/
    Label playerLabel;
    Label opponentLabel;
    Button attackButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        /**@param player is assigned as the Coffee Knight for the player
         * @param lvl1 assigned as level 1 for the Iron Knight.
         * @param lvl2 assigned as level 2 for the Steel Knight.
         * @param lvl3 assigned as level 3 for the Silver Knight.
         * @param lvl4 assigned as level 4 for the Golden Knight.
         * @param boss assigned as the Final Boss level for the Diamond Knight.*/
        player = new CoffeeKnight();
        lvl1 = new IronKnight();
        lvl2 = new SteelKnight();
        lvl3 = new SilverKnight();
        lvl4 = new GoldenKnight();
        boss = new DiamondKnight();
        opponent = lvl1;// default start level

        /**@param playerLabel display for the player's Coffee Knight.
         * @param opponentLabel display for the level 1 character.*/
        playerLabel = new Label(player.toString());
        opponentLabel = new Label(opponent.toString());

        /**Initial color for the coffee knight and the iron knight*/
        playerLabel.setTextFill(Color.BROWN);
        opponentLabel.setTextFill(Color.GREY);

        /**font and size display*/
        playerLabel.setFont(new Font("Sans-Seriff",20));
        opponentLabel.setFont(new Font("Sans-seriff",20));

        /**@param attackButton assigned as the Attack button in Button method.*/
        attackButton = new Button("Attack");
        attackButton.setOnAction(this::performAttack);

        /**@param pane is the GUI setup for the labels on both the player and opponent
         * along with the attack button.*/
        Pane pane = new Pane();
        playerLabel.setLayoutX(50);
        playerLabel.setLayoutY(50);
        opponentLabel.setLayoutX(350);
        opponentLabel.setLayoutY(50);
        attackButton.setLayoutX(250);
        attackButton.setLayoutY(150);



        /**The root of the GUI*/
        pane.getChildren().addAll(playerLabel, opponentLabel, attackButton);

        /**configure the attack button*/
        attackButton.setPrefWidth(500);
        attackButton.relocate(50,160);

        /**@param scene sets up the size of the GUI*/
        Scene scene = new Scene(pane, 600, 200);
        primaryStage.setTitle("-:Java Knights:-");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    /**performAttack method for the player and the opponent to attack*/
    private void performAttack(ActionEvent event){
        int playerDamage = player.strike();
        int opponentDamage = opponent.strike();


        opponent.takeDamage(playerDamage);
        player.takeDamage(opponentDamage);

        updateLabels();

        if (player.getHealth() <= 0) {
            playerLabel.setText("Game Over!\nCoffee Knight has been defeated!");
            attackButton.setDisable(true);
        } else if (opponent.getHealth() <= 0) {
            if (opponent instanceof DiamondKnight){
                opponentLabel.setText("Congratulations!\nThe Coffee Knight\nis the new Champion!");
                attackButton.setDisable(true);
            } else{
                advanceLevel();
            }
        }
    }

    private void updateLabels() {
        playerLabel.setText(player.toString());
        opponentLabel.setText(opponent.toString());
    }

    private void advanceLevel(){
        if (opponent instanceof IronKnight){
            opponent = lvl2;
            opponentLabel.setTextFill(Color.CADETBLUE);
        } else if (opponent instanceof SteelKnight){
            opponent = lvl3;
            opponentLabel.setTextFill(Color.SILVER);
        } else if (opponent instanceof SilverKnight){
            opponent = lvl4;
            opponentLabel.setTextFill(Color.GOLD);
        } else if (opponent instanceof GoldenKnight){
            opponent = boss;
            opponentLabel.setTextFill(Color.AQUAMARINE);
        }
        updateLabels();
    }







}
