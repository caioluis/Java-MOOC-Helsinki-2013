
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("87.");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");

    }

    private static void printWithSmileys(String characterString) {
        for (int i = 0; i <= characterString.length() * 2; i=i+2) {
               System.out.print(":)");
        }
        
    }

}
