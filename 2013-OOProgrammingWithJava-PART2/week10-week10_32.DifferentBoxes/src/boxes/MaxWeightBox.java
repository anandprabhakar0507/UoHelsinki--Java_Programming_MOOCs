/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nathan
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (things.stream()
                  .mapToInt(n -> n.getWeight())
                  .sum() + thing.getWeight() <= maxWeight){
            this.things.add(thing); 
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    
    
    
    
    
}
