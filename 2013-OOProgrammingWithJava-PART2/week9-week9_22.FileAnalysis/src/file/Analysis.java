/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nathan
 */
public class Analysis {
    private List<String> lines;
    
    public Analysis(File file) throws Exception{
        Scanner reader = new Scanner(file);
        lines = new ArrayList<String>();
        while(reader.hasNextLine()){
            lines.add(reader.nextLine()+ "\n");
        }
        reader.close();
        
    }
    
    public void printLines(){
        for (String l : lines)
            System.out.println(l);
    }
    
    public int lines(){
        return lines.size();
    }
    
    public int characters() {
        int chars = 0;
        for (String l : lines)
            chars += (int)l.chars().count();
        return chars;
    }
}
