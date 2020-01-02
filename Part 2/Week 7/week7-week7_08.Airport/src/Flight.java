/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */

public class Flight {

    private Plane airplane;
    private String departureCode;
    private String destinationCode;

    public Flight(Plane airplane, String departureCode, String destinationCode) {
        this.airplane = airplane;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    public String toString() {
        return this.airplane + " (" + this.departureCode + "-" + this.destinationCode +")";
    }
 
    
}
