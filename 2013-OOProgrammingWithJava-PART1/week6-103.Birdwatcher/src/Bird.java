/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Bird {
    private String name;
    private String latinName;
    private int sightings = 0;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getSightings() {
        return sightings;
    }
    
    public void incrementSightings(){
        sightings++;
    }
    
    public String toString(){
        return name + " (" + latinName + "): " + sightings + " observations";
    }
    
}
