
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Jumper implements Comparable<Jumper>{
    private String name;
    private int points = 0;                   //total points of all completed rounds.
    private int lastJumpLength = 0;           //last round's jump
    private List<Integer> lastScores;         //last round's judge scores
    private List<Integer> jumps;              //log of all previous jumps
    private Random randomizer = new Random(); //for generating random jumps
    
    public Jumper(String name){
        this.name = name;
        this.lastScores = new ArrayList<Integer>();
        this.jumps = new ArrayList<Integer>();
    }
    
    public void jump(){
        int low = 60;
        int high = 120;
        lastJumpLength = randomizer.nextInt(high-low+1)+low; //jumps between 60-120, inclusive 
        jumps.add(lastJumpLength);
    }

    public List<Integer> getJumps() {
        return jumps;
    }

    public int getPreviousJumpLength() {
        return lastJumpLength;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    
    public List<Integer> getPreviousRoundJudgeScores() {
        return lastScores;
    }
    
    public void addPoints(Judges judges){ //round points = sum(jump length, 3 middle judge scores)
        points += lastJumpLength;
        lastScores.removeAll(lastScores);       //remove last round's scores
        lastScores.addAll(judges.getScores());  //store this round's scores
        for (Integer score : midScores(judges.getScores())){
            points += score;
        }
    }
        
    private List<Integer> midScores(List<Integer> scores){
        Collections.sort(scores);
        scores.remove(scores.size()-1);//remove highest
        scores.remove(0);              //remove lowest
        return scores;
    }
    
    @Override
    public String toString(){
        return name + " (" + points + " points)";
    }

    @Override
    public int compareTo(Jumper otherJumper) {
        return this.points - otherJumper.points;
    }
    
    
}
