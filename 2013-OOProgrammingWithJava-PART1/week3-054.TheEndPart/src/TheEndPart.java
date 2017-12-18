import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String in = reader.nextLine();
        
        System.out.println("Length of the second part: ");
        int i = Integer.parseInt(reader.nextLine());
        String secondPart = in.substring(in.length()-i, in.length());
        System.out.println("Result: " + secondPart);
    }
}
