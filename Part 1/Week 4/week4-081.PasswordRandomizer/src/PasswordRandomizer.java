
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    Random r = new Random();
    private int length;
    private int i = 1;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        String characters = "abcdefghijklmnopqrstuvwxyz";
        int numberOfCharacters = this.length;

        while (numberOfCharacters > 0) {
            int luku = this.r.nextInt(characters.length());
            char c = characters.charAt(luku);
            password += c;
            numberOfCharacters--;
        }

        return password;

    }
}
