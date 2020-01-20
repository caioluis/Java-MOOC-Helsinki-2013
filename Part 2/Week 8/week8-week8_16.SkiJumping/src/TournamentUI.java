/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.util.*;

public class TournamentUI {

    private Scanner reader;
    private Participants participants;
    
    public TournamentUI(Scanner reader){
        this.reader = reader;
    }

    public void jumpingPhase() {
        System.out.println("Kumpula ski jumping week\n\n"
                + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.println("Participant name: ");
            String name = reader.next();
            
            if (name.isEmpty()) {
                break;
            } else {
                participants.addParticipant(name);
            }
        }
        System.out.println("The tournament begins!");
        for (Participants participant : participants.participants) {
            System.out.println(participant);
        }
    }
}
