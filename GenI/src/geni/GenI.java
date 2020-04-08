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
public class GenI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<8; i++) {
            int HP = pokedex.values()[0].getBattleData()[1];
            System.out.println(badge.values()[i]);          
        }
    }
    
}
