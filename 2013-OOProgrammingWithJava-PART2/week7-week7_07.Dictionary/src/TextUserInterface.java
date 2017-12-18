
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        String input;
        String input2;
        
        while (true){
            System.out.print("Statement: ");
            input = reader.nextLine();
            
            if (input.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if(input.equals("")){
                System.out.println("  add - adds a word pair to the dictionary");
                System.out.println("  translate - asks a word and prints its translation");
                System.out.println("  quit - quit the text user interface");
            } else if (input.equals("add")){
                System.out.print("In Finnish: ");
                input = reader.nextLine();
                System.out.print("Translation: ");
                input2 = reader.nextLine();
                add(input, input2);
            } else if ("translate".equals(input)){
                System.out.print("In Finnish: ");
                input = reader.nextLine();
                System.out.println("Translation: " + translate(input));
            } else{
                System.out.println("Unknown statement");
            }
            System.out.println("");
        }
    }
    
    public void add(String word, String translation){
        dictionary.add(word, translation);
    }
    
    public String translate(String word){
        return dictionary.translate(word);
    }
    
    
}
