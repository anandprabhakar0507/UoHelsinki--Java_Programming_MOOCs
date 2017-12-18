
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String in = reader.nextLine();
        for (int i = 1; i<=in.length(); i++)
            System.out.println(i + ". character: " + in.charAt(i-1));
    }
}
