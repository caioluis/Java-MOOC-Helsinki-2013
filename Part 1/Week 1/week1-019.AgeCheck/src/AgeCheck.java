
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        Integer age = Integer.parseInt(reader.nextLine());
        
        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
            
        }
        else {
            System.out.println("OK");
        }

    }
}
