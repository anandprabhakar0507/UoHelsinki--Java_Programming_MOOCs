
import java.util.ArrayList;
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
public class Dictionary {
    private HashMap<String, String> dict = new HashMap<String, String>();

    public Dictionary() {
    
    }
    
    public String translate(String word){
        if (dict.containsKey(word))
            return dict.get(word);
        return null;
    }
    
    public void add(String word, String translation){
        dict.put(word, translation);
    }
    
    public int amountOfWords(){
        return dict.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> tlist = new ArrayList<String>();
        dict.forEach((k, v) -> tlist.add(k + " = " + v));
        return tlist;
    }
    
    
}
