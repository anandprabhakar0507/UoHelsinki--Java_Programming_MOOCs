
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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
   
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public int totalWeight(){
        int sum = 0;
        for (Suitcase s : suitcases)
            sum+=s.totalWeight();
        return sum;
    }
    
    public int getMaxWeight() {
        return maxWeight;
    }

    public ArrayList<Suitcase> getSuitcases() {
        return suitcases;
    }

    
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void addSuitcase(Suitcase suitcase){
        int newWeight = totalWeight() + suitcase.totalWeight();
        if (newWeight <= maxWeight){  
            suitcases.add(suitcase);
        }
    }
    
    public void printThings(){
        if(suitcases.size() == 0)
            System.out.println("empty (0 kg)");
        else
            suitcases.forEach(n -> n.printThings());
    }
    
}
