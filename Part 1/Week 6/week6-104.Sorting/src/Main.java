
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexSmallest]) {
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexSmallestFrom = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < array[indexSmallestFrom]) {
                indexSmallestFrom = i;
            }
        }
        return indexSmallestFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstValue = array[index1];
        int secondValue = array[index2];
        array[index1] = secondValue;
        array[index2] = firstValue;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestNow = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestNow);
            
        }
    }

}
