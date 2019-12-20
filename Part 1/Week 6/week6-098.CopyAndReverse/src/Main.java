
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reversed = reverseCopy(original);
        
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reversed = new int[array.length];
        int j = -1;
        for (int i = array.length - 1; i >=0  ; i--) {
            j++;
            reversed[j] = array[i];
        }
        
        return reversed;
    }
    
}
