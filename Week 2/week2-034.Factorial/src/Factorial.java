import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        int fac = 1;
        while (i <= number) {            
            fac *= i;
            i++;
        }
        System.out.println(fac);
    }
}
