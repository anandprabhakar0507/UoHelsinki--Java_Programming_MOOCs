
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Tournament {
    private List<Jumper> jumpers;//Ordered from least to greatest points. Reversed for final results.
    private Judges judges;       //wrapper for judge score arraylist.
    private int roundCounter = 0;//number of rounds completed.
    
    public Tournament(int numberOfJudges){
        this.jumpers = new ArrayList<Jumper>();
        this.judges = new Judges(numberOfJudges);
    }
    
    public void addParticipant(Jumper jumper){
        jumpers.add(jumper);
    }
    
    public int getNumberOfParticipants(){
        return jumpers.size();
    }
    
    public void sortParticipants(){
        Collections.sort(jumpers);
    }
    
    public Jumper getParticipant(int index){
        return jumpers.get(index);
    }
    
    public int getRoundCounter() {
        return roundCounter;
    }
    
    public void playNextRound(){
        for (Jumper j : jumpers){
            j.jump();               //jumper jumps
            judges.judge();         //judges judge
            j.addPoints(judges);    //add jump length and mid scores to jumper's total points
        }
        sortParticipants(); //person with lowest score must go first next round.
        roundCounter += 1;  //number of rounds completed increments.
    }
    
    public void printPreviousRound(){
        System.out.println("Results of round " + roundCounter);
        for (Jumper j : jumpers){
            System.out.println("  " + j.getName());
            System.out.println("    length: " + j.getPreviousJumpLength());
            System.out.println("    judge votes: " + j.getPreviousRoundJudgeScores());
        }
        System.out.println("");
    }
    
    public void printTournamentResults(){
        //Reorder jumpers in proper place rankings, most points to least points.
        Collections.reverse(jumpers);
        
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        
        for (Jumper j : jumpers){
            //print rank, name, point total
            System.out.println(jumpers.indexOf(j)+1 + "           " + j);
            
            //print jump lengths in order of occurrence
            System.out.print("            jump lengths: ");
            printJumperJumpLengths(j);
            
            //spacer
            System.out.println("");
        }
    }
    
    // Helper function that prints jumper's jump lengths in order of occurrence.  
    // Example print: 95 m, 96 m, 63 m
    private void printJumperJumpLengths(Jumper j){
        Iterator<Integer> itr = j.getJumps().iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " m");
            if (itr.hasNext())
                System.out.print(", ");
        }
    }
}
