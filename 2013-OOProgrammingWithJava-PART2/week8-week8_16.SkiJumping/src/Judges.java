
import java.util.ArrayList;
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
public class Judges {
    private Random randomizer = new Random();
    private List<Integer> scores;
    private final int NUMBER_OF_JUDGES;
    
    public Judges(int numberOfJudges){
        this.NUMBER_OF_JUDGES = numberOfJudges;
        this.scores = new ArrayList<Integer>();
    }
    
    public void judge(){//produces judge scores for each judge
        int low = 10;
        int high = 20;
        scores.removeAll(scores);
        
        for (int i = 0; i < NUMBER_OF_JUDGES; i++){
            scores.add(randomizer.nextInt(high-low+1) + low);
        }
    }

    public List<Integer> getScores() {
        return scores;
    }
    
    @Override
    public String toString(){
        return scores.toString();
    }
}
