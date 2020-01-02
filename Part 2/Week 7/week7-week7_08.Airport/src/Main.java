
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        AirportUI ui = new AirportUI(reader);

        ui.airportPanel();
        ui.flightService();
    }

}
