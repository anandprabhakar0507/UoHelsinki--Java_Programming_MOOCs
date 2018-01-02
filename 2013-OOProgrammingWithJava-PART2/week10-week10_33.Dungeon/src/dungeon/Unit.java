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
public abstract class Unit {
    protected char symbol;
    protected Tile spaceOccupied;
    protected int movesToGo;
    
    public Unit(char symbol, Tile spaceOccupied){
        this.symbol = symbol;
        this.spaceOccupied = spaceOccupied;
        this.spaceOccupied.setOccupant(this);
    }
    
    public abstract void moveTo(Tile destination) throws Exception;
    
    public void setMovesToGo(int moves) {
        this.movesToGo = moves;
    }

    public int getMovesToGo() {
        return movesToGo;
    }
    
    public void reduceMoves(){
        this.movesToGo--;
        if (movesToGo < 0)
            this.movesToGo = 0;
    }
    
    public char getSymbol() {
        return symbol;
    }

    public Tile getSpaceOccupied() {
        return spaceOccupied;
    }

    public void setSpaceOccupied(Tile spaceOccupied) {
        this.spaceOccupied = spaceOccupied;
    }
    
    @Override
    public String toString(){
        return symbol + " " + spaceOccupied.getY() + " " + spaceOccupied.getX();
    }
}
