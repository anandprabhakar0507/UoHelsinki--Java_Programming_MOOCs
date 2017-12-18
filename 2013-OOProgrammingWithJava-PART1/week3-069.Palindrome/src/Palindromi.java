import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        CharacterIterator ritr = new CharacterIterator(text);
        String reversed = "";
        while (ritr.rhasNext()){
            reversed+=ritr.rnext();
        }
        return reversed;
    }
    public static boolean palindrome(String text) {
        // write code here
        String rtext = reverse(text);
        
        return text.equals(rtext);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
