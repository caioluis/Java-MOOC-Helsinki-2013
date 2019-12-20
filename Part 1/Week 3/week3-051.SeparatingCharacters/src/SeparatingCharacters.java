
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type ur name");
        String name = reader.nextLine();
        int length = name.length();
        int i = 0;
        while (i <= length - 1) {            
            System.out.println(i+1 +". character: "+name.charAt(i));
            i++;
        }
    }
}
