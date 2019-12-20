
public class Greatest {
    
    public static boolean compare(int max, int u, int v) {
        
        return max > u && max > v;
    }

    public static int greatest(int number1, int number2, int number3) {
        
        int greatestNumber = 0;
        
        if (number1 == number2 && number1 == number3) {
            greatestNumber = number3;
        }
        if (compare(number1, number2, number3)) {
             greatestNumber = number1;
        }
        if (compare(number2, number1, number3)) { 
            greatestNumber = number2;
        }
        if (compare(number3, number1, number2)) { 
            greatestNumber = number3;
        }
        

        return greatestNumber;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
