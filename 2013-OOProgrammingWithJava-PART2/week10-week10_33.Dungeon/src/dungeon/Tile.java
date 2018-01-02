/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author nathan
 */
public class Tile {
    private char symbol;
    private Unit occupant;
    private final int X;
    private final int Y;
    
    public Tile(int x, int y){
        this.symbol = '.';
        occupant = null;
        this.X = x;
        this.Y = y;
    }
    
    public void clear(){
        if(isOccupied())
            this.occupant = null;
    }
    
    public boolean isOccupied(){
        if (occupant == null)
            return false;
        return true;
    }

    public char getSymbol() {
        return symbol;
    }

    public Unit getOccupant() {
        return occupant;
    }

    public void setOccupant(Unit occupant) {
        this.occupant = occupant;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
    
    @Override
    public String toString(){
        if (isOccupied())
            return occupant.getSymbol()+"";
        else
            return this.symbol+"";
    }
    
    
    
    
    
    
}
