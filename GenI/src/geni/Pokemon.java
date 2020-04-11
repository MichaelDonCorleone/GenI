/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;

import geni.data.*;
import static java.lang.Math.sqrt;


/**
 *
 * @author Michael Corleone
 */
public class Pokemon {
    private final static int maxEV = 510;
    private static int pokemonCount=0;
    private final int ID;
    private final int originalTrainerID;
    private int trainerID;
    private final int pokedexID;
    private int level;
    private int exp;
    private final int[] IV;
    private int EV[];
    private int[] actualStats;
    private int gender; // 0 for male, 1 for female, 2 for genderless
    
    //Constructor
    public Pokemon(int originalTrainerID, int trainerID, int pokemonID, int pokedexID, int level,int exp, int gender) {
        this.ID = pokemonCount++;
        this.originalTrainerID = originalTrainerID;
        this.trainerID = trainerID;
        this.pokedexID = pokedexID;
        this.level = level;
        if(exp == 0) {
            this.exp = level^3;
        } else {
            this.exp = exp;
        }
        this.IV = new int[]{0,(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32)};
        //Individual boosted genetic attributes generated when the pokemon are created
        //Total IV, HP,Attack,Defense,Sp. Atk,Sp. Def,Speed
        this.IV[0] = this.IV[1] + this.IV[2] + this.IV[3] + this.IV[4] + this.IV[5] + this.IV[6];
        this.EV = new int[] {0, 0, 0, 0, 0, 0, 0};
        this.gender = gender;
        this.actualStats = new int[]{
                                        (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[1]+this.IV[1])*2+sqrt(this.EV[1]))/4)*this.level/100)+this.level+10),
                                        (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[2]+this.IV[2])*2+sqrt(this.EV[2]))/4)*this.level/100)+5),
                                        (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[3]+this.IV[3])*2+sqrt(this.EV[3]))/4)*this.level/100)+5),
                                        (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[4]+this.IV[4])*2+sqrt(this.EV[4]))/4)*this.level/100)+5),
                                        (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[5]+this.IV[5])*2+sqrt(this.EV[5]))/4)*this.level/100)+5),
                                        (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[6]+this.IV[6])*2+sqrt(this.EV[6]))/4)*this.level/100)+5)                                        
                                    };
    }
    
    // fetch data functions
    
    public int getID() {
        return this.ID;
    }
    
    public int getOriginalTrainerID() {
        return this.originalTrainerID;
    }
    
    public int getTrainerID() {
        return this.trainerID;
    }
    
    public int pokedexID() {
        return this.pokedexID;
    }
    
    public int[] getIV() {
        return this.IV;
    }
    
    public int[] getEV() {
        return EV;
    }   
    
    public int getGender() {
        return gender;
    }
    
    public int getLevel() {
        return this.level;
    }
    //set data functions
    
    //used for trading/gifting pokemon
    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public void setExperience(int exp) {
        this.exp = exp;
    }
    
    public void setEV(int index, int amount) {
        this.EV[index] = amount;
    }
    
    public void setGender(int gender) {
        this.gender = gender;
    }
    
    //use it after a pokemon levels up
    public void calculateActualStats() {
        this.actualStats[0] = (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[1]+this.IV[1])*2+sqrt(this.EV[1]))/4)*this.level/100)+this.level+10);
        this.actualStats[1] =  (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[2]+this.IV[2])*2+sqrt(this.EV[2]))/4)*this.level/100)+5);
        this.actualStats[2] = (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[3]+this.IV[3])*2+sqrt(this.EV[3]))/4)*this.level/100)+5);
        this.actualStats[3] =(int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[4]+this.IV[4])*2+sqrt(this.EV[4]))/4)*this.level/100)+5);
        this.actualStats[4] = (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[5]+this.IV[5])*2+sqrt(this.EV[5]))/4)*this.level/100)+5);
        this.actualStats[4] = (int) Math.round(((((pokedex.values()[this.pokedexID-1].getBattleData()[6]+this.IV[6])*2+sqrt(this.EV[6]))/4)*this.level/100)+5);                                            
    }
    
    public void selectGender(int pokedexID) {
        //to be implemented in the future.
    }
    
}