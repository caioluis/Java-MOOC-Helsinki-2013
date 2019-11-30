/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getName() {
        return teamName;
    }

    public void addPlayer(Player player) {
        if (this.playerList.size() < this.maxSize) {
            playerList.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.playerList.size();
    }
    
    public int goals(){
        int teamGoals = 0;
        for (Player player : playerList) {
            teamGoals += player.goals();
        }
        return teamGoals;
    }

}
