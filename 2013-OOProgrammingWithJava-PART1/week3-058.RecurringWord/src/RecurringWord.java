
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String in;
        while (true){
            System.out.println("Type a word: ");
            in = reader.nextLine();
            if(words.contains(in)){
                System.out.println("You gave the word " + in + " twice");
                break;
            }
            words.add(in);
        }
        
        
        
        
    }
}
