
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type the last number");
        int secondNumber = Integer.parseInt(reader.nextLine());
        if (firstNumber < secondNumber) {
            
            
            while (firstNumber <= secondNumber) {                
                System.out.println(firstNumber);
                firstNumber++;
            }
            
        } else if (firstNumber == secondNumber) {
            System.out.println("First and Last:" + firstNumber);
        }
        else {
            
        }

    }
}
