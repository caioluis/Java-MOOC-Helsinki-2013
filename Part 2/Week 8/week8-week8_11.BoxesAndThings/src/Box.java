
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

public class Box implements ToBeStored {

    private double maximumWeight;
    private double currentWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
        currentWeight = 0;
    }

    public void add(ToBeStored t) {
        if (currentWeight + t.weight() <= maximumWeight) {
            things.add(t);
            currentWeight += t.weight();
        }
    }
    
    public double weight(){
        double weight = 0;
        for (ToBeStored t : things) {
            weight+=t.weight();
        }
        
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + currentWeight + " kg";
    }
}
