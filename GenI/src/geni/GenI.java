/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;


import geni.data.*;
import java.util.ArrayList;

/**
 *
 * @author Michael Corleone
 */
public class GenI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Player> trainers = new ArrayList<>();
        ArrayList<Pokemon> pokemon = new ArrayList<>();
        pokemon.add(new Pokemon(0,0,150,70,0,0));
        pokemon.add(new Pokemon(1,1,151,70,0,0));
        trainers.add(new Player("Michael","Mafioso","jd@gmail.com","testingWaters1996"));
        trainers.add(new Player("thefeistyone","marvinStarving2020","canadianProdigy@hotmail.com","testOcean1996"));
        trainers.get(0).setLineUp(0, pokemon.get(0));
        trainers.get(1).setLineUp(1, pokemon.get(1));
    }
    
}
