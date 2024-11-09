package KnightsArena;
/**This program is the user's character to use in the arena.
 * @author Alvin Vasquez
 * created: June 29, 2024
 * @version CoffeeKnight.java
 * */
public class CoffeeKnight extends Combat{

    /**@param name assigned as the Coffee knight for the user.*/
    private String name = "Coffee Knight";

    /**Constructor for assigning 80 points of health to the Coffee Knight*/
    CoffeeKnight(){
        super(600);
    }


    /**Displaying the name and health of the coffee with toString method*/
    @Override
    public String toString() {
        return "Name: " +name+ "\nHealth: "+getHealth();
    }
}
