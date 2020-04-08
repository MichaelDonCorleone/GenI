/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;

import geni.data.*;

/**
 *
 * @author Michael Corleone
 */
public class Pokemon {
    private static int pokemonCount=0;
    private final int ID;
    private final int originalTrainerID;
    private int trainerID;
    private final pokedex pokemonData;
    private final int[] IV;
    
    //Constructor
    public Pokemon(int originalTrainerID, int trainerID, pokedex pokemonData) {
        this.ID = pokemonCount++;
        this.originalTrainerID = originalTrainerID;
        this.trainerID = trainerID;
        this.pokemonData = pokemonData;
        this.IV = new int[]{0,(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32),(int) (Math.random()*32)};
        //Individual boosted genetic attributes generated when the pokemon are created
        //Total IV, HP,Attack,Defense,Sp. Atk,Sp. Def,Speed
        this.IV[0] = this.IV[1] + this.IV[2] + this.IV[3] + this.IV[4] + this.IV[5] + this.IV[6];
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
    
    public pokedex getPokemonData() {
        return this.pokemonData;
    }
    
    public int[] getIV() {
        return this.IV;
    }
    
    //set data functions
    
    //used for trading/gifting pokemon
    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }
}