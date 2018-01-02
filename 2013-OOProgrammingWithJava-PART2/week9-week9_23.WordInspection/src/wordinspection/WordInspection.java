/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nathan
 */
public class WordInspection{
    private List<String> words;
    
    public WordInspection(File file) throws Exception{
        Scanner reader = new Scanner(file);
        words = new ArrayList<String>();
        while (reader.hasNextLine())
            words.add(reader.nextLine());
        reader.close();
    }
    
    public int wordCount(){
        return words.size();
    }
    
    public List<String> wordsContainingZ(){
        List<String> results = new ArrayList<String>();
        for (String word : words)
            if (word.contains("z"))
                results.add(word);
        return results;
    }
    
    public List<String> wordsEndingInL(){
        List<String> results = new ArrayList<String>();
        for (String word : words)
            if (word.charAt(word.length()-1) == 'l')
                results.add(word);
        return results;
    }
    
    public List<String> wordsWhichContainAllVowels(){
        String vowels = "aeiouyäö";
        String test = new String();
        List<String> results = new ArrayList<String>();
        
        OUTER:
        for (String word : words){
            for (char c : vowels.toCharArray())
                if (!word.contains(""+c))
                    continue OUTER;
                results.add(word);
        }
        return results;
    }
    
    public List<String> palindromes(){
        List<String> results = new ArrayList<String>();
        for (String word : words)
            if (word.equals(new StringBuffer(word).reverse().toString()))
                results.add(word);
        return results;
    }
    
}
