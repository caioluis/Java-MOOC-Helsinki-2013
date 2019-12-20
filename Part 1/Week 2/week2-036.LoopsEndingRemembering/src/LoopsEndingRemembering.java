import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int hmn = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Type numbers");
        while (number != -1) {
            number = Integer.parseInt(reader.nextLine());
            if(number%2 == 0) {
                even++;
            } else if (number == -1) {
            } else {
                odd++;
            }
            sum += number;
            hmn ++;
            
            
        }
        sum ++;
        hmn --;
        
        double avg = (double)sum / (double)hmn;
        System.out.println("Thank you and see you later");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + hmn);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
