import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type ur name bro");
        String name = reader.nextLine();
        System.out.println("number bro");
        int index = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + name.substring(name.length() - index));
    }
}
