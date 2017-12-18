import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String in;
        while (true){
            System.out.println("Type a word: ");
            in = reader.nextLine();
            if (in.equals(""))
                break;
            words.add(in);
            
        }
        
        System.out.println("You typed the following words: ");
        
        Collections.reverse(words);
        for (String word : words)
            System.out.println(word);
    }
}
