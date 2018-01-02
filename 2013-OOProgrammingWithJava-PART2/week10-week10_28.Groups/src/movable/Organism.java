/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author nathan
 */
public class Organism implements Movable{
    private int[] position;
    
    public Organism(int x, int y){
        position = new int[] {x,y};
    }
    
    public String toString(){
        return "x: " + position[0] + "; y: " + position[1];
    }
    
    public void move(int dx, int dy){
        position[0]+=dx;
        position[1]+=dy;
    }
    
    
    
    
    
}
