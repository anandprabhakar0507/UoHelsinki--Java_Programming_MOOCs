/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
  
    public Counter(){
        this(0,false);
    }
    
    public int value(){
        return value;
    }
    
    public void increase(int amt){
        if (amt > 0)
            value += amt;
        if (check && value < 0)
            value = 0;
    }
    public void increase(){
        increase(1);
    }
    
    public void decrease(int amt){
        if (amt > 0)
            value -= amt;
        if (check && value < 0)
            value = 0;
    }
    
    public void decrease(){
        decrease(1);
    }
    
    
}
