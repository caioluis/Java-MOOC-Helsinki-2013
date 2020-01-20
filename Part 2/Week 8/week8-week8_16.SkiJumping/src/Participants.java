
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
public class Participants {
    private String name;
    public ArrayList<Participants> participants;
    
    public Participants(String name){
        this.name = name;
    }
    
    public void addParticipant(String name){
        participants.add(new Participants(name));
    }
    
}
