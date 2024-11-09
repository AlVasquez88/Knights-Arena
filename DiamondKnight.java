package KnightsArena;
/**This program is the final boss level for user to fight against the Diamond Knight
 * @author Alvin Vasquez
 * created: June 29, 2024
 * @version DiamondKnight.java
 * */
public class DiamondKnight extends Combat{
   /**@param name assigned as the Diamond Knight*/
    private String name = "Diamond Knight";

    /**Constructor for assigning health to 200 points for the Diamond Knight*/
    DiamondKnight(){
       super(200);
    }

    /**Boss Character display of the Diamond Knight*/
    @Override
    public String toString(){
        return "Final Boss: "+name+"\nHealth: "+getHealth();
    }
}
