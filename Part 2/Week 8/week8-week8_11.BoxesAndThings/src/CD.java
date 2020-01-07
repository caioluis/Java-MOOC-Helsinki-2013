/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    
    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        
    }
    
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear +")";
    }

    @Override
    public double weight() {
        return 0.1;
     }
}
