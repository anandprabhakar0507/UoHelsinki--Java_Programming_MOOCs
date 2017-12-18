
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class MyArrayList<Integer> extends ArrayList<Integer>{
    
    public int count(int q){
        Integer i;
        int c = 0;
        
        for (Iterator<Integer> itr = this.iterator(); itr.hasNext(); ){
            i = itr.next();
            if (i.equals(q))
                c++;
        }
        
        return c;
            
    }
}
