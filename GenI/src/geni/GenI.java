/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;


import geni.pokedex.*;

/**
 *
 * @author PCuser
 */
public class GenI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<6; i++) {
            int HP = pokemon.values()[0].getBattleData()[1];
            System.out.println(type.Bug.getBattleCoefficients()[0]);          
        }
    }
    
}
