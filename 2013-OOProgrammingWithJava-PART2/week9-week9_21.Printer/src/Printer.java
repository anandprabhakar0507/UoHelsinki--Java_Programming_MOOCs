
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Printer {
    private List<String> lines = new ArrayList<String>();
    
    public Printer(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine())
            lines.add(reader.nextLine());
        reader.close();
    }
    
    public void printLinesWhichContain(String word){
        for (String line : lines){
            if (line.contains(word) || word.equals(""))
                System.out.println(line);
        }
    }
}
