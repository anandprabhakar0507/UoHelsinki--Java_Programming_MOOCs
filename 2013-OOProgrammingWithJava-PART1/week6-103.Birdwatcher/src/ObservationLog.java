
import java.util.ArrayList;
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
public class ObservationLog {
    private ArrayList<Bird> observations;
    private Scanner reader;
    
    public ObservationLog(Scanner reader){
        observations = new ArrayList<Bird>();
        this.reader = reader;
    }
    
    public void addBird(){
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        
        observations.add(new Bird(name, latinName));
    }
    
    public void printStats(){
        for (Bird b : observations)
            System.out.println(b);
    }
    
    public void incrementBird(){
        System.out.print("What was observed:? ");
        String query = reader.nextLine();
        for (Bird b : observations){
            if (b.getName().contains(query)){
                b.incrementSightings();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void printBird(){
        System.out.print("What? ");
        String query = reader.nextLine();
        for (Bird b : observations){
            if (b.getName().contains(query)){
                System.out.println(b);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}
