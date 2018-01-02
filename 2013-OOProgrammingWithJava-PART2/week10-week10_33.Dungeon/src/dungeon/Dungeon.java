/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nathan
 */
public class Dungeon {
    private final int MAXLENGTH;
    private final int MAXHEIGHT;
    private List<Vampire> vampires;
    private final boolean vampiresMove;
    private Tile[][] gameBoard;
    private Player player;
    private Random randomizer = new Random();
    private Scanner reader = new Scanner(System.in);
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.MAXHEIGHT = height;
        this.MAXLENGTH = length;
        this.gameBoard = new Tile[height][length];
        initializeGameBoard();
        
        //initialize player
        this.player = new Player(gameBoard[0][0], moves);
        
        //initialize vampires
        this.vampiresMove = vampiresMove;
        initializeVampires(vampires);
    }
    
    public void run(){
        while (true){
            if (player.getMovesToGo() == 0 && vampires.size() > 0){
                System.out.println("YOU LOSE");
                break;
            }
            
            if (vampires.size() == 0){
                System.out.println("YOU WIN");
                break;
            }
            
            System.out.println(player.getMovesToGo());
            
            System.out.println("");
            
            System.out.println(player);
            this.vampires.forEach(n -> System.out.println(n));
            
            System.out.println(""); 
            
            System.out.println(boardToString());
            
            System.out.println("");
            
            String input = reader.nextLine();
            
            playRound(input);
//            break;
            
        }
    }
    
    public void initializeGameBoard(){
        for (int i = 0; i < MAXHEIGHT; i++){
            for (int j = 0; j < MAXLENGTH; j++){
                this.gameBoard[i][j] = new Tile(i,j);
            }
        }
    }
    
    private void initializeVampires(int numberOfVampires) {
        this.vampires = new ArrayList<Vampire>();
        for (int i = 0; i < numberOfVampires; i++) {
            int x = randomizer.nextInt(MAXHEIGHT);
            int y = randomizer.nextInt(MAXLENGTH);
            
            // check to make sure current unit is not already a vampire,
            // keep randomizing position until unit is not already a vampire.
            while (gameBoard[x][y].isOccupied()) {
                x = randomizer.nextInt(MAXHEIGHT);
                y = randomizer.nextInt(MAXLENGTH);
            }
            Vampire vampire = new Vampire(gameBoard[x][y]);//place the vampire on the board
            this.vampires.add(vampire);//update our list of vampires
        }
    }
    
    public void playRound(String directions){
        movePlayer(directions);
        player.reduceMoves();
        if (vampiresMove)
            moveVampires(directions);
    }
    
    public void movePlayer(String directions){
        for (char c : directions.toCharArray()){
            if (player.getMovesToGo() == 0)
                break; //no more moves!
            switch(c){
                case 'w':
                    moveUnitUp(player);
                    break;
                case 'a':
                    moveUnitLeft(player);
                    break;
                case 's':
                    moveUnitDown(player);
                    break;
                case 'd':
                    moveUnitRight(player);
                    break;
            }
        }
    }
    
    public void moveVampires(String directions){
        int numberOfMoves = directions.length();
        int choice;
        for (Vampire v : vampires){
            for (int i = 0; i < numberOfMoves; i++){
                choice = randomizer.nextInt(4);
                switch (choice){
                    case 0:
                        moveUnitUp(v);
                        break;
                    case 1:
                        moveUnitLeft(v);
                        break;
                    case 2:
                        moveUnitDown(v);
                        break;
                    case 3:
                        moveUnitRight(v);
                        break;
                }
            }
        }
    }
    
    public void moveUnitTo(Unit unit, int nextX, int nextY){
        try{
            unit.moveTo(gameBoard[nextX][nextY]);
        } catch (ArrayIndexOutOfBoundsException aioobe){
            ;
        } catch (Exception spaceOccupied){
            if (unit.getSymbol() == '@' && spaceOccupied.getMessage().equals("vampire")){
                killVampire(gameBoard[nextX][nextY]);
                moveUnitTo(unit, nextX, nextY);
            }
            if (unit.getSymbol() == 'v' && spaceOccupied.getMessage().equals("vampire")){
                ;
            }
            if (unit.getSymbol() == 'v' && spaceOccupied.getMessage().equals("player")){
                killVampire(unit.spaceOccupied);
            }
        }
    }
    
    public void moveUnitRight(Unit unit){
        int nextX = unit.getSpaceOccupied().getX();
        int nextY = unit.getSpaceOccupied().getY()+1;
        moveUnitTo(unit, nextX, nextY);
    }
    
    public void moveUnitDown(Unit unit){
        int nextX = unit.getSpaceOccupied().getX()+1;
        int nextY = unit.getSpaceOccupied().getY();
        moveUnitTo(unit, nextX, nextY);
    }
    
    public void moveUnitLeft(Unit unit){
        int nextX = unit.getSpaceOccupied().getX();
        int nextY = unit.getSpaceOccupied().getY()-1;
        moveUnitTo(unit, nextX, nextY);
    }
    
    public void moveUnitUp(Unit unit){
        int nextX = unit.getSpaceOccupied().getX()-1;
        int nextY = unit.getSpaceOccupied().getY();
        moveUnitTo(unit, nextX, nextY);
    }
    
    public void killVampire(Tile location){
        this.vampires.remove(location.getOccupant());
        location.clear();
    }
    
    public String boardToString(){
        String result = "";
        for (int i = 0; i < MAXHEIGHT; i++){
            for (int j = 0; j < MAXLENGTH; j++){
                result += gameBoard[i][j].toString();
            }
            result += '\n'; 
        }
        return result;
    }
}
