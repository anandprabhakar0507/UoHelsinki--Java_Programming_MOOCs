/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nathan
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public double get(int index){
        return this.history.get(index);
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    public double maxValue(){
        return history.stream().max(Double::compare).orElse(0.0);
    }
    
    public double minValue(){
        return history.stream().min(Double::compare).orElse(0.0);
    }
    
    public double average(){
        if (!history.isEmpty()){
            return history.stream().reduce(0.0, (n, m) -> n+m) /
                   history.size();
        } else 
            return 0.0;
    }
    
    public double greatestFluctuation(){
        double maxDiff = 0;
        
        for (int i = 1; i < history.size(); i++){
            maxDiff = Math.max(maxDiff, Math.abs(history.get(i) - history.get(i-1)));
        }
        return maxDiff;
    }
    
    public double variance(){
        return history.stream()
                      .mapToDouble(n -> Math.pow(n - this.average(), 2))
                      .sum()/(history.size()-1);
    }
    
    public String toString(){
        return history.toString();
    }
    
}
