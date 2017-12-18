
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Team {
    private String name;
    private ArrayList<Player> roster = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player inPlayer){
        if (roster.size() < maxSize)
            roster.add(inPlayer);
    }
    
    public void printPlayers(){
        for (Player p : roster)
            System.out.println(p);
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return roster.size();
    }
    
    public int goals(){
        int total = 0;
        for (Player p : roster)
            total+=p.goals();
        return total;
    }
    
    
}
