
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.println("Until what? ");
        int inputNumber = Integer.parseInt(reader.nextLine());
        while (i <= inputNumber) {            
            sum+=i;
            i++;
        }
        
        System.out.println("Sum is " + sum);
        

    }
}
