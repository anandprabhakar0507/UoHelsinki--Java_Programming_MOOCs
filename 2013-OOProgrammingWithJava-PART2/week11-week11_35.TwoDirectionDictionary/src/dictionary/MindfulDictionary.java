/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nathan
 */
public class MindfulDictionary {
    private Map<String, String> finnishToEnglish;
    private Map<String, String> englishToFinnish;
    private File dictionarySource;

    public MindfulDictionary() {
        finnishToEnglish = new HashMap<String, String>();
        englishToFinnish = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file){
        this();
        dictionarySource = new File(file);
    }
    
    public void add(String word, String translation){
        if (!finnishToEnglish.containsKey(word) && !englishToFinnish.containsKey(translation)){
            finnishToEnglish.put(word, translation);
            englishToFinnish.put(translation, word);
        }
    }
    
    public String translate(String word){
        if (finnishToEnglish.containsKey(word))
            return finnishToEnglish.get(word);
        if (englishToFinnish.containsKey(word))
            return englishToFinnish.get(word);
        return null;
    }
    
    public void remove(String word){
        englishToFinnish.remove(finnishToEnglish.remove(word));
        finnishToEnglish.remove(englishToFinnish.remove(word));
    }
    
    public boolean load(){
        try {
            Scanner reader = new Scanner (dictionarySource);
            while (reader.hasNextLine()){
                String[] words = reader.nextLine().split(":");
                String one = words[0];
                String two = words[1];
                add(one, two);
            }
            return true;
        } catch (FileNotFoundException fnfe){
            return false;
        }
    }
    
    public boolean save(){
        try{
            FileWriter f = new FileWriter(dictionarySource.toString());
            finnishToEnglish.forEach((k,v) -> {
                try {
                    f.write(k + ":" + v + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            f.close();
            return true;
        } catch (IOException ioe){
            return false;
        }
    }
    
}
