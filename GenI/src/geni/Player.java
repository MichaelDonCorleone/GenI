/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;

/**
 *
 * @author Michael Corleone
 */
public class Player {
    private static int count = 0;
    private final int  trainerID;
    private String name;
    private final int badges[];
    private String username;
    private String password;
    private String email;
    private String ipAddress;
    private String previousIPaddress;
    private Pokemon[] lineup;
    
    public Player(String name, String username, String password, String email){
        this.trainerID = count++;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.lineup = new Pokemon[6];
        this.badges = new int[]{0,0,0,0,0,0,0,0};
    }
    //setters
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    public void setPrevioustIpAdress(String previousIpAddress) {
        this.previousIPaddress = previousIpAddress;
    }
    
    public void setBadges(int badgeNo, int state) {
        if(state == 1 || state == 0) {
            this.badges[badgeNo] = state;
        }
    }
    
    public void setLineUp(int positionToBeAssignedTo, Pokemon pokemonToBeAssigned) {
        boolean alreadyInLineUp = false;
        int positionInLineUp = -1;
        int pokemonIDtoSwitch = -1;
        for(int i =0; i < 6; i++) {
            //check if position iterated is empty
            if(lineup[i] != null) {
                if(lineup[i].getID() == pokemonToBeAssigned.getID()) {
                    alreadyInLineUp = true;
                    positionInLineUp = i;
                }
            } else {
                if(alreadyInLineUp == false) {
                    lineup[i] = pokemonToBeAssigned;
                    break;
                } else {
                    //check if we are trying to assign our pokemon that is already in the lineup
                    //to a null position
                    if(positionToBeAssignedTo >= i) {
                        break;
                    } else {
                        //check if we are trying to assign the pokemon to the position it already is.
                        if(lineup[positionToBeAssignedTo].getID() == pokemonToBeAssigned.getID()) {
                            break;
                        } else {
                            lineup[positionInLineUp] = lineup[positionToBeAssignedTo];
                            lineup[positionToBeAssignedTo] = pokemonToBeAssigned;
                        }
                    }
                }
            }
            if(i==5) {
                if(positionInLineUp == -1) {
                    lineup[positionToBeAssignedTo] = pokemonToBeAssigned;
                } else {
                    //take the pokemon from the position that we want to swap this pokemon to
                    //and transfer it to the position the pokemon we want to swap from is 
                    //then assign the pokemon to the positionToBeAssignedTo.
                    lineup[positionInLineUp] = lineup[positionToBeAssignedTo];
                    lineup[positionToBeAssignedTo] = pokemonToBeAssigned;
                }
            }
        }
    }
    
    //getters
    public String getName() {
        return this.name;
    }
    
    public int[] getBadges() {
        return this.badges;
    }
    
    public int getTrainerID() {
        return this.trainerID;
    }
}
