public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount-- > 0)
            System.out.print("*");
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount-- > 0)
            System.out.print(" ");
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        while (i++ < size){ 
            printWhitespaces(size-i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int k = 1;
        while (k <= height){
            printWhitespaces(height - k);
            printStars(-1 + 2 * (k++));
        }
        
        int spacer = (2 * height - 4)/2;
        printWhitespaces(spacer);
        printStars(3);
        printWhitespaces(spacer);
        printStars(3);
            
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
