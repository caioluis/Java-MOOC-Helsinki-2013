
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Caio
 */
public class Plane {

    private String planeId;
    private int capacity;

    public Plane(String planeId, int capacity) {
        this.planeId = planeId;
        this.capacity = capacity;
    }

    public String getId() {
        return this.planeId;
    }

    public String toString() {
        return this.planeId + " (" + this.capacity + " ppl)";
    }

}
