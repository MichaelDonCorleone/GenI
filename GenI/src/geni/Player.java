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
    
    public void setLineUp(int position, Pokemon pokemonToBeAssigned) {
        
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
