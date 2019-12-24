
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
public class Container {
    
    private int totalWeight;
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maximumWeight){
        this.suitcases = new ArrayList<Suitcase>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if ((this.totalWeight + suitcase.totalWeight()) <= maximumWeight) {
            suitcases.add(suitcase);
            totalWeight+=suitcase.totalWeight();
        }
    }
    
    public String toString(){
        if (suitcases.isEmpty()) {
            return "Container is empty (0 kg)";
        } else if (suitcases.size() == 1){
            return "1 suitcase ("  + totalWeight + " kg)";
        } else {
            return suitcases.size() + " suitcases (" +  totalWeight + " kg)";
        }
    }
    
     public void printThings(){
         for (Suitcase suitcase : suitcases) {
             suitcase.printThings();                 
         }
     }
}
