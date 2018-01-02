/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author nathan
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.history = new ContainerHistory();
        this.history.add(initialVolume);
    }
    
    public double get(int index){
        return this.history.get(index);
    }
    
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        history.add(super.getVolume());
    }
    
    public double takeFromTheContainer(double amount){
        amount = super.takeFromTheContainer(amount);
        history.add(super.getVolume());
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.history.maxValue());
        System.out.println("Smallest product amount: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        System.out.println("Greatest change: " + this.history.greatestFluctuation());
        System.out.println("Variance: " + this.history.variance());
    }
    
    public String history(){
        return this.history.toString();
    }
     
    
    
}
