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
    
    //Constructor
    public Pokemon(int originalTrainerID, int trainerID, pokedex pokemonData) {
        this.ID = pokemonCount++;
        this.originalTrainerID = originalTrainerID;
        this.trainerID = trainerID;
        this.pokemonData = pokemonData;
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
    
    //set data functions
    
    //used for trading/gifting pokemon
    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }
}