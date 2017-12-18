/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        word = word.toLowerCase();
        searched = searched.trim().toLowerCase();
        
        if (word == null || searched == null)
            return false;
        return word.contains(searched);
        
        
    }
}
