/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import wormgame.Direction;

/**
 *
 * @author nathan
 */
public class Worm {
    private List<Piece> pieces;
    private Direction direction;
    private int maxLength = 3;
    
    public Worm(int originalX, int originalY, Direction originalDirection){
        this.pieces = new ArrayList<Piece>();
        pieces.add(new Piece(originalX, originalY));
        
        this.direction = originalDirection;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    public int getLength(){
        return pieces.size();
    }
    
    public List<Piece> getPieces(){
        return pieces;
    }
    
    public void move(){
        Piece oldHead = pieces.get(getLength()-1);
        switch(direction){
            case LEFT:
                pieces.add(new Piece(oldHead.getX()-1, oldHead.getY()));
                break;
            case RIGHT:
                pieces.add(new Piece(oldHead.getX()+1, oldHead.getY()));
                break;
            case UP:
                pieces.add(new Piece(oldHead.getX(), oldHead.getY()-1));
                break;
            case DOWN:
                pieces.add(new Piece(oldHead.getX(), oldHead.getY()+1));
                break;
        }
        
        if (getLength() >= maxLength+1)
            pieces.remove(0);
    }
    
    public void grow(){
        if (getLength()>=3)
            maxLength++;
    }
    
    public boolean runsInto(Piece piece){
        return pieces.stream().anyMatch(n -> n.runsInto(piece));
    }
    
    public boolean runsIntoItself(){
        for (int i = 0; i < getLength()-1; i++){
            for (int j = i+1; j < getLength(); j++){
                if (pieces.get(i).runsInto(pieces.get(j)))
                    return true;
            }
        } 
        return false;
    }
    
}
