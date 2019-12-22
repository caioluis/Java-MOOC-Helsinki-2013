public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Mikael");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");

    }

    private static void printWithSmileys(String characterString) {
        String secondLine = secondLine(characterString);

        lineOfSmileys(secondLine.length() / 2);
        System.out.println(secondLine);
        lineOfSmileys(secondLine.length() / 2);

    }

    private static void lineOfSmileys(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

    private static String secondLine(String characterString) {
        if (characterString.length() % 2 == 1) {
            return ":) " + characterString + "  :)";
        }
        return ":) " + characterString + " :)";

    }

}
