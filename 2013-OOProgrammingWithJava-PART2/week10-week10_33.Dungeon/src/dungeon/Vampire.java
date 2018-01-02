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
public class Vampire extends Unit{
    
    public Vampire(Tile spaceOccupied){
        super('v', spaceOccupied);
        super.movesToGo = 0;
    }
    
    @Override
    public void moveTo(Tile destination) throws Exception{
        if (destination.isOccupied()){
            if (destination.getOccupant().getSymbol() == 'v'){
                throw new Exception("vampire");
            }
            if (destination.getOccupant().getSymbol() == '@'){
                throw new Exception("player");
            }
        }
        super.spaceOccupied.clear();
        super.spaceOccupied = destination;
        destination.setOccupant(this);
    }
}
