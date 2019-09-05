
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private int numberDrawn;
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random r = new Random();
        // Write the number drawing here using the method containsNumber()
        while (this.numbers.size() < 7) {
            numberDrawn = 1 + r.nextInt(39);
            if (containsNumber(numberDrawn) == false) {
                numbers.add(numberDrawn);
            }

        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers

        return numbers.contains(number);
    }
}
