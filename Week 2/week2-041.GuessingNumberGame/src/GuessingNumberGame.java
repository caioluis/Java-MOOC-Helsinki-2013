
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        int numberGuessed = -1;
        System.out.println("Guess a number: ");
        int guesses = 0;
        
        // program your solution here. Do not touch the above lines!
        while (true) {
            
        
       numberGuessed = Integer.parseInt(reader.nextLine());
 
        if (numberGuessed == numberDrawn) {
            
            System.out.println("Congratulations, your guess is correct!");
            break;
        }
        else if (numberGuessed < numberDrawn) {
            System.out.println("The number is greater, guesses made: " + guesses);
            System.out.println("Guess a number: ");
            guesses++;
            
        }
        else{
             System.out.println("The number is lesser, guesses made: " + guesses);
             System.out.println("Guess a number: ");
             guesses++;
        }
        
    }
    }
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
