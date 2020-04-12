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
        pokemon.add(new Pokemon(0,0,151,70,0,0));
        
        trainers.add(new Player("Michael","Mafioso","jd@gmail.com","testingWaters1996"));
        trainers.add(new Player("thefeistyone","marvinStarving2020","canadianProdigy@hotmail.com","testOcean1996"));
        trainers.get(0).setLineUp(0, pokemon.get(0));
        System.out.println(trainers.get(0).getLineup()[0].getActualStats()[0]);
        System.out.println(trainers.get(0).getLineup()[0].getActualStats()[2]);
        System.out.println(trainers.get(0).getLineup()[0].getActualStats()[3]);
        System.out.println(trainers.get(0).getLineup()[0].getActualStats()[4]);
        System.out.println(trainers.get(0).getLineup()[0].getActualStats()[5]);
        System.out.println(pokedex.Mewtwo.getBattleData()[1]);
    }
    
}
