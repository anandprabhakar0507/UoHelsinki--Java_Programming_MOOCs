import java.util.Scanner;

public class FirstCharacters {
    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String in = reader.nextLine();
        for (int i = 1; i<4 && in.length() >=3; i++)
            System.out.println(i + ". character: " + in.charAt(i-1));
    }
    
    
    
}
