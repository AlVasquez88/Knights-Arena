package KnightsArena;
/**This program is level 1 for the user to fight against in the arena.
 * @author Alvin Vasquez
 * created: June 29, 2024
 * @version IronKinght.java
 * */

public class IronKnight extends Combat{

    /**@param name assigned as Iron Knight to fight against in the arena.*/
    private String name = "Iron Knight";

    /**Constructor for assigning 40 points of health to the Iron Knight*/
    IronKnight(){
        super(40);
    }

    /**Displaying health and name of the level 1 character*/
    @Override
    public String toString() {
        return "Level 1: "+name+"\nHealth: "+getHealth();
    }
}
