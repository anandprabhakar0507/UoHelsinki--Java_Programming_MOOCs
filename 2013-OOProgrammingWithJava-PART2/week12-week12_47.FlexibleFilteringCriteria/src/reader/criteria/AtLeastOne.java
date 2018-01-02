/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.Arrays;

/**
 *
 * @author nathan
 */
public class AtLeastOne implements Criterion{
    private Criterion[] cs;
    
    public AtLeastOne(Criterion... cs){
        this.cs = cs;
    }

    @Override
    public boolean complies(String line) {
        return Arrays.stream(cs).anyMatch(n -> n.complies(line));
    }
    
    
}
