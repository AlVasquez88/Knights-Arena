package KnightsArena;
/**This program is level 4 for the user to fight against the Golden Knight
 * @author Alvin Vasquez
 * created: June 29, 2024
 * @version GoldenKnight.java
 * */
public class GoldenKnight extends Combat{

    /**@param name assigned as Golden Knight*/
    private String name = "Golden Knight";

    /**Constructor for assigning 100 health points for the Golden Knight*/
    GoldenKnight(){
        super(100);
    }

    /**Displaying level 4 character name and health*/
    @Override
    public String toString(){
        return "Level 4: "+name+"\nHealth: "+getHealth();
    }
}
