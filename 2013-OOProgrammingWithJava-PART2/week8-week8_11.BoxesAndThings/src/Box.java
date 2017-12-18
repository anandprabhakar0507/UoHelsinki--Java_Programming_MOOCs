
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Box implements ToBeStored{
    private final double maxWeight;
    private List<ToBeStored> stuff;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        stuff = new ArrayList<>();
    }
    
    public double weight(){
        double weight = 0;
        for (ToBeStored s : stuff)
            weight += s.weight();
        return weight;
    }
    
    public void add(ToBeStored thing){
        if (thing.weight() + this.weight() <= maxWeight){
            stuff.add(thing);
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + stuff.size() + " things, total weight " + weight() + " kg";
    }
}
