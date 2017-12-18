import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        System.out.println("Factorial is ");
        
        int p = 1;
        
        while (n >= 1)
            p *= n--;
        
        System.out.println("Factorial is " + p);
    }
}
