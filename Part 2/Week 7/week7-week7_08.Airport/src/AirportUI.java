
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

public class AirportUI {

    private Scanner reader;
    private HashMap<String, Plane> airplanes;
    private ArrayList<String> flights;
    
    public AirportUI(Scanner reader) {
        this.airplanes = new HashMap<String, Plane>();
        this.flights = new ArrayList<String>();
        this.reader = reader;
    }
    
    //Airport Panel methods

    public void addPlane() {
        System.out.print("Give plane ID: ");
        String planeId = reader.next();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.next());
        this.airplanes.put(planeId, new Plane(planeId, capacity));
    }

    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeId = reader.next();
        Plane airplane = airplanes.get(planeId);
        System.out.print("Give departure airport code: ");
        String departureCode = reader.next();
        System.out.print("Give destination airport code: ");
        String destinationCode = reader.next();
        Flight flight = new Flight(airplane, departureCode, destinationCode);
        flights.add(flight.toString());

    }

    //Airport Panel UI
    
    public void airportPanel() {
        System.out.println("Airport panel\n"
                + "--------------------\n");

        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");

            String command = reader.next();

            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            }

        }
    }
    
    //Flight Service methods
    
    public void printPlanes(){
        for (Plane airplane : airplanes.values()) {
            System.out.println(airplane);
        }
    }
    
    public void printFlights(){
       for (String flight : flights) {
            System.out.println(flight);
        }
    }
    
    public void planeInfo(){
        System.out.print("Give plane ID: ");
        String planeId = reader.next();
        Plane airplane = airplanes.get(planeId);
        System.out.println(airplane);
    }
    
    //Flight Service UI

    public void flightService() {
        System.out.println("Flight service\n"
                + "--------------------\n");

        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> ");
            String command = reader.next();

            if (command.equals("x")) {
                System.out.println();
                break;
            } else if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                planeInfo();
            }
        }
    }
}
