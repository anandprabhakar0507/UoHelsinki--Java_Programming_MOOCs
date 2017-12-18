
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String n1 = reader.nextLine();
        
        System.out.println("Type your age: ");
        int a1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String n2 = reader.nextLine();
        
        System.out.println("Type your age: ");
        int a2 = Integer.parseInt(reader.nextLine());
        
        System.out.println(n1 + " and " + n2 + " are " + (a1+a2) + "years old  in total.");
        
    }
}
