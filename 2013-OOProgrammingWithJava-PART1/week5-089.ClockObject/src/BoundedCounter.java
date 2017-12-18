/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class BoundedCounter {
    private int value = 0;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit+1;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        if (value > 0 && value < upperLimit)
            this.value = value;
    }
    
    public void next(){
        this.value = ++value%upperLimit;
    }
    
    public String toString(){
        if (value < 10){
            return "0" + value;
        }
        else {
            return "" + this.value;
        }
    }
    
}
