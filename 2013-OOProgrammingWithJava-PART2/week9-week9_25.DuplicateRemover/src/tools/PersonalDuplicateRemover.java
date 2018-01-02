/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nathan
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private Map<String, Integer> dups;
    
    public PersonalDuplicateRemover(){
        dups = new HashMap<String, Integer>();
    }
    
    @Override
    public void add(String characterString) {
        if (dups.containsKey(characterString)){
            dups.put(characterString, dups.get(characterString)+1);
        } else{
            dups.put(characterString, 1);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        //cast to an int the sum of the values decremented by 1.
        return (int)dups.values().stream().mapToInt(n -> n-1).sum();
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return dups.keySet();
    }

    @Override
    public void empty() {
        dups.clear();
    }
    
    
}
