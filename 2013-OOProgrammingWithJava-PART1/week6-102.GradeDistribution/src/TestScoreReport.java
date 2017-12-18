

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
public class TestScoreReport {
    private MyArrayList<Integer> scores;
    private Scanner reader;
    
    public TestScoreReport(Scanner reader){
        scores = new MyArrayList<Integer>();
        this.reader = reader;
    }
    
    int convertRawToScore(int raw){
        int score;
        
        if (raw >= 50)
            score = 5;
        else if ( raw >= 45)
            score = 4;
        else if ( raw >= 40)
            score = 3;
        else if ( raw >= 35)
            score = 2; 
        else if ( raw >= 30)
            score = 1;
        else
            score = 0;
        return score;   
    }
    
    void inputRaw(){
        while (true){
            int inRaw = Integer.parseInt(reader.nextLine());
            if (inRaw >= 0 && inRaw <= 60){
                int score = convertRawToScore(inRaw);
                scores.add(score);
            } else if (inRaw == -1)
                break;
        }
    }
    
    void printHisogram(){
        System.out.println("Grade distribution: ");
        for(int i = 5; i > -1; i--){
            System.out.print(i+": ");
            for (int j = 0; j < scores.count(i); j++)
                System.out.print("*");
            System.out.println("");
        }
    }
    
    double acceptancePercentage(){
        return 100*(1.0 - (double)scores.count(0)/scores.size());
    }
    
}
