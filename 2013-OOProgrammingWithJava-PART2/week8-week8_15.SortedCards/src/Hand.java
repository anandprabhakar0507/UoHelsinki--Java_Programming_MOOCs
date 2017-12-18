
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }
    
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        cards.forEach(n -> System.out.println(n));
    }
    
    public void sort(){
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand h) {
        return sumHand(this) - sumHand(h);    
    }
    
    private int sumHand(Hand h){
        int sum = 0;
        for (Card c : h.cards){
            sum += c.getValue();
        }
        return sum;
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        cards.sort(suitSorter);
    }
    
    
    
}
