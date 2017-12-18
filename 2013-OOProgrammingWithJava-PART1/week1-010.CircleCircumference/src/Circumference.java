
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.println("Type the radius: ");
        double r = Integer.parseInt(reader.nextLine());
        
        System.out.println("Circumference of the circle: " + (Math.PI * 2 * r));
    }
}
