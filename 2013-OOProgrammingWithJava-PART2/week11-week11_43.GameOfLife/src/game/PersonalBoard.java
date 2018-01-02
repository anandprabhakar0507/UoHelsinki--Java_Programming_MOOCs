/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author nathan
 */
public class PersonalBoard extends GameOfLifeBoard{
    
    public PersonalBoard(int width, int height){
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        Random randomizer = new Random();
        for(int i = 0; i < super.getWidth(); i++)
            for(int j = 0; j < super.getHeight(); j++)
                super.getBoard()[i][j] = randomizer.nextDouble() <= 
                                         probabilityForEachCell;
    }

    @Override
    public boolean isAlive(int i, int i1) {
        try {
            return super.getBoard()[i][i1];
        } catch (ArrayIndexOutOfBoundsException e1){
            return false;
        }
    }

    @Override
    public void turnToLiving(int i, int i1) {
        try {
            super.getBoard()[i][i1] = true;
        } catch (ArrayIndexOutOfBoundsException e1){
            ;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        try {
            super.getBoard()[i][i1] = false;
        } catch (ArrayIndexOutOfBoundsException e1){
            ;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int m, int n) {
        //For loops below should not count the cell itself at (m,n).  
        //The following line of code will set starting living count to 0 if
        //cell (m,n) is dead, or to -1 if the current cell is alive.  This will 
        //remove the for loop's count of the cell itself if it is alive.
        //We only care about neighbors!
        int living = ((super.getBoard()[m][n] == true) ? -1 : 0);  
        for(int i = m-1; i <= m+1; i++){
            for(int j = n-1; j <= n+1; j++){
                try{
                    System.out.println(i + " " + j);
                    if (super.getBoard()[i][j])
                        living++;
                } catch (ArrayIndexOutOfBoundsException e1){
                    ;
                }
            }
        }
        return living;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbors) {
        if (isAlive(x, y)){
            if (getNumberOfLivingNeighbours(x, y) < 2)
                turnToDead(x, y);
            if (getNumberOfLivingNeighbours(x, y) > 3)
                turnToDead(x, y);
        } else{
            if (getNumberOfLivingNeighbours(x, y) == 3)
                turnToLiving(x, y);
        }
    }
    
    
    
}
