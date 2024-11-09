package KnightsArena;
/**This program is level 2 for the user to fight against the Steel Knight.
 * @author Alvin Vasquez
 * created: June 29, 2024
 * @version SteelKnight.java
 * */
public class SteelKnight extends Combat{

    /**@param name assigned as Steel Knight*/
    private String name = "Steel Knight";

    /**Constructor for assigning 60 points of health to the steel knight*/
    SteelKnight(){
        super(60);
    }



    /**Displaying the name and health of the level 2 character*/
    @Override
    public String toString() {
        return "Level 2: "+name+"\nHealth: "+getHealth();
    }
}
