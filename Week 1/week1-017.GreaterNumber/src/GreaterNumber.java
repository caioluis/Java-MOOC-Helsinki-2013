import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        Integer firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        Integer secondNumber = Integer.parseInt(reader.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println("Greater Number: " + firstNumber);
        }
        else if (secondNumber > firstNumber) {
            System.out.println("Greater Number: " + secondNumber);   
        }
        else {
            System.out.println("The numbers are equal");
        
        }
        
    }
}
