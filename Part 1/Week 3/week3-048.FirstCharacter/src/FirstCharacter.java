import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = reader.nextLine();
        System.out.println("A primeira letra do seu nome é " + firstCharacter(name));
    }
    
    public static char firstCharacter(String text) {
        char first = text.charAt(0);
        return first;
    }
}
