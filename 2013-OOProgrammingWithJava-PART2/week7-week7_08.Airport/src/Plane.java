
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
public class Plane {
    private HashMap<String, String> departureArrivals;
    private String name;
    private int capacity;

    public Plane(String name, int capacity) {
        this.departureArrivals = new HashMap<String, String>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addDepartureArrival(String dep, String arr){
        departureArrivals.put(dep, arr);
    }
    
    public String toString(){
        return name + " (" + capacity + " ppl)";
    }
    
    public void printFlights() {
        departureArrivals.forEach(
                 (k, v) -> System.out.println(this + " (" + k + "-" + v + ")")); 
    }
    
    

    
    
    
}
