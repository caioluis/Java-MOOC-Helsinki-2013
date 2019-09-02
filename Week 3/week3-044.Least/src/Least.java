import java.util.Scanner;
public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a return in the end
        int least = 0;
        if (number1 < number2) {
            least = number1;
        }
        else if (number2 > number2) {
            least = number2;
        }
        else {
            least = number2;
        }
        
        return least;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("digite um n ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("digite outro n ");
        int y = Integer.parseInt(reader.nextLine());
        int result = least(x, y);
        System.out.println("o menor número é: " + result);
    }
}
