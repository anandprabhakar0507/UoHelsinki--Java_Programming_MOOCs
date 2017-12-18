
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
public class AirportTerminal {
    private Scanner reader;
    private HashMap<String, Plane> planes;
    
    public AirportTerminal(Scanner reader){
        this.reader = reader;
        this.planes = new HashMap<String, Plane>();
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        String input;
        
        OUTER:
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            input = reader.nextLine();
            
            switch (input) {
                case "x":
                    System.out.println("");
                    break OUTER;
                case "1":
                    addPlane();
                    break;
                case "2":
                    addFlight();
                    break;
                default:
                    break;
            }
        }
        //...Create  FlightTerminal and start it.
        FlightTerminal ui = new FlightTerminal(reader, planes);
        ui.start();
    }
    
    void addPlane(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int cap = Integer.parseInt(reader.nextLine());
        planes.put(id, new Plane(id, cap));
    }
    
    void addFlight(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String dep = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String arr = reader.nextLine();
        planes.get(id).addDepartureArrival(dep, arr);
    }
    
}
