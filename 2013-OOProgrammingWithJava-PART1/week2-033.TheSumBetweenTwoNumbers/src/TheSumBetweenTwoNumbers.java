
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int n = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second: ");
        int m = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (n <= m)
            sum += n++;
        
        System.out.println("Sum is " + sum);
    }
}
