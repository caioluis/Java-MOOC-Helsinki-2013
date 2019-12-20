/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
public class Player {
    private int goals;
    private String playerName;
    
        public Player(String playerName){
        this.playerName = playerName;
    }
    
    public Player(String playerName, int goals){
        this.playerName = playerName;
        this.goals = goals;
    }
    
    public int goals(){
        return goals;
    }
    
    public String getName(){
        return playerName;
    }
    
    public String toString(){
        return this.playerName + ", " + this.goals + " goals.";
    }
    
}
