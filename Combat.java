package KnightsArena;

import java.util.Random;

public class Combat {
    /**@param atkGenerator helps determine how strong the attack is going to land.*/
    Random atkGenerator;
    /**@param atkPow is the attack power of all the knights*/
    private int atkPow;
    /**@param health used for dealing damage to all of the knights and the player's coffee knight.*/
    private int health;
    /**Constructor for Combat*/
    Combat(int health){
        this.atkGenerator = new Random();
        this.health = health;
    }
    /**Generates the attack power with the Strike method*/
    public int strike(){
        atkPow = atkGenerator.nextInt(60)+1;
        return atkPow;
    }

    /**Method that takes damage from the player and the opponents.*/
    public void takeDamage(int damage){
        health -= damage;
        if (health < 0) health = 0;//health becomes 0 if the attack damage is greater than the current health.
    }
    public int getHealth(){
        return health;
    }


}
