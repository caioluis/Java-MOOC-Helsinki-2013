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

public class Suitcase {

    private int totalWeight;
    private int maximumWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addThing(Thing thing) {
        if ((thing.getWeight() + totalWeight) <= maximumWeight) {
            things.add(thing);
            totalWeight += thing.getWeight();
        }

    }

    public String toString() {
        if (things.isEmpty()) {
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing(" + totalWeight + " kg)";
        } else {
            return things.size() + " things(" + totalWeight + " kg)";
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Thing heaviestThing() {
        int heaviestIndex = 0;
        if (things.isEmpty()) {
            return null;
        } else {
            for (int i = 1; i < things.size(); i++) {
                if (things.get(i).getWeight() > things.get(i - 1).getWeight()) {
                    heaviestIndex = i;
                }
            }

            return things.get(heaviestIndex);
        }
    }
}
