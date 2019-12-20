
import java.util.Random;

public class Dice {

    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {

        return 1 + random.nextInt(numberOfSides);
    }
}
