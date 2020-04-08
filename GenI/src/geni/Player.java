/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;

/**
 *
 * @author PCuser
 */
public class Player {
    private static int count = 0;
    private final int  trainerID;
    private String name;
    private final int badges[];
    
    public Player(String name){
        this.badges = new int[]{0,0,0,0,0,0,0,0};
        this.trainerID = count++;
        this.name = name;
    }
    //setters
    public void setBadges(int badgeNo, int state) {
        if(state == 1 || state == 0) {
            this.badges[badgeNo] = state;
        }
    }
    
    public void setName(String name) {
        this.name = name;
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
