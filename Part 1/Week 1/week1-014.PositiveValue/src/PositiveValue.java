
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        float number = Float.parseFloat(reader.nextLine());
        
        if (number > 0) {
            System.out.println("Your name is positive");
        }
        else{
            System.out.println("Your number is not positive");
        }

        // Type your program here:
    }
}
