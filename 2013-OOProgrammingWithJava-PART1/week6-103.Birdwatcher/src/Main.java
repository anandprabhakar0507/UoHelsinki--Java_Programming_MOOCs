
import java.util.ArrayList;
import java.util.Scanner;



public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        String input;
        ObservationLog log = new ObservationLog(reader);
        
        while(true){
            System.out.print("? ");
            input = reader.nextLine();
            if (input.equals("Add"))
                log.addBird();
            else if (input.equals("Observation"))
                log.incrementBird();
            else if (input.equals("Statistics"))
                log.printStats();
            else if (input.equals("Show"))
                log.printBird();
            else if (input.equals("Quit"))
                break;
            else
                System.out.println("Usage: Add, Observation, Statistics, Show, Quit");
        }
        
        
    }

}
