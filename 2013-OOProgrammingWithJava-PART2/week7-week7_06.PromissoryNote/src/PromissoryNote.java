
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class PromissoryNote {
    private HashMap<String, Double> dues = new HashMap<String, Double>();
    public PromissoryNote() {
        ;
    }
    
    public void setLoan(String toWhom, double value){
        dues.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if (dues.containsKey(whose)){
            return dues.get(whose);
        }
        
        return 0;
    }
    
    
    
}
