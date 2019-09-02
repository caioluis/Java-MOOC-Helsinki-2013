
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Digite seu nome: ");
        String name = reader.nextLine();
        int length = calculateCharacters(name);
        System.out.println("Seu nome tem " + length + " letras");
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    
    public static int calculateCharacters(String name) {
       int length = name.length();
       return length;
        
    }
}
