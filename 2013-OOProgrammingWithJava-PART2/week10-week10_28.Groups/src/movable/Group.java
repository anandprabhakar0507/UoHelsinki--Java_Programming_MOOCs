/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nathan
 */
public class Group implements Movable{
    private List<Movable> orgs;
    
    public Group(){
        orgs = new ArrayList<Movable>();
    }
    
    public String toString(){
        String result = "";
        for (Movable org : orgs){
            result += org.toString() + "\n";
        }
//        result.subSequence(0, result.length()-1);
        return result;
    }
    
    public void addToGroup(Movable movable){
        orgs.add(movable);
    }
    
    public void move(int dx, int dy){
        orgs.forEach(n -> n.move(dx, dy));
    }
}
