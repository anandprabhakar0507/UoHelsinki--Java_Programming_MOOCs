
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int i = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second: ");
        int f = Integer.parseInt(reader.nextLine());
        
        for(int n = i; n <= f; n++)
            System.out.println(n);

    }
}
