public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {   
        int i = 1;
        while (i <= amount) {            
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int size) {
        int i = 1;
        while (i <= size) {            
            System.out.print(" ");
            i++;
        }
    }
    
    

    public static void printTriangle(int size) {
        // 40.2
        int spaces = (size - 1);
        int i = 1;
        
        while (i <= size) {            
            printWhitespaces(spaces);
            printStars(i);
            i++;
            spaces--;
            
        }
    }
    
    

    public static void xmasTree(int height) {
        // 40.3
        int spaces = (height - 1);
        int i = 1;
        int inc = 0;
        int spaceinc = 1;
        
        
        while(i <= height) {
            printWhitespaces(spaces);
            printStars(i + inc);
            i++;
            inc++;
            spaces--;
            
        }
        while(spaceinc <= 2){
            printWhitespaces(height - 2);
            printStars(3);
            spaceinc++;
        }
        
        
        
        
    }
    
    

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
