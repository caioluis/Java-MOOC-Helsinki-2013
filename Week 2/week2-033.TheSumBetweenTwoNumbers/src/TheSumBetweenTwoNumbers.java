
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int i = 0;
        int sum = 0;
        
        System.out.println("Type the first number: ");
        min = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the last number: ");
        max = Integer.parseInt(reader.nextLine());
       
        i = min;
        while (i <= max) {  
        sum += i;
        i++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
