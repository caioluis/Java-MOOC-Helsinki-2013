
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        System.out.println("Type the first number: ");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        sum = sum + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + sum);
    }
}
