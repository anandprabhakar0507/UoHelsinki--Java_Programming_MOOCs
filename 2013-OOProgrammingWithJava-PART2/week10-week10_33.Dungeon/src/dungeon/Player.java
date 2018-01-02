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
public class Player extends Unit{
    
    public Player(Tile occupiedSpace, int moves){
        super('@',occupiedSpace);
        super.movesToGo = moves;
    }
    
    @Override
    public void moveTo(Tile destination) throws Exception{
        if (destination.isOccupied())
            if (destination.getOccupant().getSymbol() == 'v'){
                throw new Exception("vampire");
            }
        super.spaceOccupied.clear();
        super.spaceOccupied = destination;
        destination.setOccupant(this);
    }
    
    
    
}
