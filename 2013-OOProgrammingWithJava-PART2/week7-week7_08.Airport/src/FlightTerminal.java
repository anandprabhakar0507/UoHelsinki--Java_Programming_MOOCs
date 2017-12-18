
import java.util.HashMap;
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
public class FlightTerminal {
    private Scanner reader;
    private HashMap<String, Plane> planes;

    public FlightTerminal(Scanner reader, HashMap<String, Plane> planes) {
        this.reader = reader;
        this.planes = planes;
    }
    
    public void start(){
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        String input;
        
        OUTER:
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            input = reader.nextLine();
            
            switch (input) {
                case "x":
                    System.out.println("");
                    break OUTER;
                case "1":
                    printPlanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printInfo();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void printPlanes(){
        planes.values().forEach(n -> System.out.println(n));
    }
    
    public void printFlights(){
        planes.values().forEach(n -> n.printFlights());
        System.out.println("");
    }
    
    public void printInfo(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println(planes.get(id));
        System.out.println("");
    }
    
    
    
    
    
    
    
}
