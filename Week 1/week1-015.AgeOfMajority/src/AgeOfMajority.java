
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How old are you?");
        Integer age = Integer.parseInt(reader.nextLine());
        
        if (age < 18) {
            System.out.println("You have not reached the age of majority yet!");
        }
        else{
            System.out.println("You've reached the majority!");
        }

        // Type your program here 
    }
}
