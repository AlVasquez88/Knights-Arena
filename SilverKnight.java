package KnightsArena;
/**This program is level 3 for the user to fight against the Silver Knight.
 * @author Alvin Vasquez
 * created: June 29, 2024
 * @version SilverKnight.java
 * */
public class SilverKnight extends Combat{

    /**@param name assigned as Silver Knight*/
    private String name = "Silver Knight";

    /**Constructor for assigning 80 points of health to the Silver Knight*/
    SilverKnight(){
        super(80);
    }

    /**Displaying the name and health of the level 3 character*/
    @Override
    public String toString() {
        return "Level 3: "+name+"\nHealth: "+getHealth();
    }
}
