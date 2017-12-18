
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
public class CharacterIterator implements Iterator<Character> {
    private final String str;
    private int pos = 0;
    private int rpos = 0;
    
    public CharacterIterator (String in){
        this.str = in;
        this.rpos = in.length()-1;
    }
    
    public boolean hasNext() {
        return pos < str.length();
    }
    
    public boolean rhasNext(){
        return rpos >= 0;
    }
    
    public Character next() {
        return str.charAt(pos++);
    }
    
    public Character rnext() {
        return str.charAt(rpos--);
    }
    
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
}
