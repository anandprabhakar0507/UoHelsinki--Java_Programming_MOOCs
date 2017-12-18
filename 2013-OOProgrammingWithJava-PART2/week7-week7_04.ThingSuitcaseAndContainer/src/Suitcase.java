
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight(){
        int s = 0;
        for (Thing t : things)
            s+=t.getWeight();
        return s;
    }
    
    public void addThing(Thing thing){
        int newWeight = totalWeight() + thing.getWeight();
        if (newWeight <= maxWeight){  
            things.add(thing);
        }
    }
    
    public String toString(){
        if(things.size() == 0)
            return "empty (0 kg)";
        else if (things.size() == 1)
            return things.size() + " thing (" + totalWeight() + " kg)";
        else
            return things.size() + " things (" + totalWeight() + " kg)";
    }
    
    public void printThings(){
        if(things.size() == 0)
            System.out.println("empty (0 kg)");
        else
            things.forEach(n -> System.out.println(n));
    }
    
    public Thing heaviestThing(){
        int max = 0;
        Thing heaviest = null;
        for (Thing t : things){
            if (t.getWeight() > max){
                heaviest = t;
                max = t.getWeight();
            }
        }
        return heaviest;
    }
    
    
    
    
    
    
}
