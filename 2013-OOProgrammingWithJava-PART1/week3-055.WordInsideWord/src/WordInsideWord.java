
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String in1 = reader.nextLine();
        System.out.println("Type the second word: ");
        String in2 = reader.nextLine();
        
        if (in1.contains(in2))
            System.out.println("The word '" + in2 + "' is found in the word '" + in1 + "'.");
        else
            System.out.println("The word '" + in2 + "' is not found in the word '" + in1 + "'.");
    }
}
