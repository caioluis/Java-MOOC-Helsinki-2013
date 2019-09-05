
public class NumberStatistics {

    private int amountOfNumbers;

    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        sum += number;
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {

        double average = 0;
        if (amountOfNumbers != 0) {
           average = sum / (double) amountOfNumbers;
        }
        return average;

    }
}
