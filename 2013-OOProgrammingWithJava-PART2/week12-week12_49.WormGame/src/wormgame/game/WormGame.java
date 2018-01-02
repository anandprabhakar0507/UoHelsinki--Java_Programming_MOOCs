package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random randomizer;

    public WormGame(int width, int height) {
        
        
        super(1000, null);
        
        this.randomizer = new Random(); 
        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        
        int appleX = randomizer.nextInt(width);
        int appleY = randomizer.nextInt(height);
        
        while (appleX == worm.getPieces().get(0).getX() &&
               appleY == worm.getPieces().get(0).getY()){
            appleX = randomizer.nextInt(width);
            appleY = randomizer.nextInt(height);
        }
        
        this.apple = new Apple(appleX, appleY);
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)){
            worm.grow();
            apple = new Apple(randomizer.nextInt(width), 
                              randomizer.nextInt(height));
        }
        if (worm.runsIntoItself())
            continues = false;
        if (worm.getPieces().get(worm.getLength()-1).getX() == width ||
            worm.getPieces().get(worm.getLength()-1).getY() == height)
            continues = false;
        if (worm.getPieces().get(worm.getLength()-1).getX() == -1 ||
            worm.getPieces().get(worm.getLength()-1).getY() == -1)
            continues = false;
        
        updatable.update();
        setDelay(1000 / worm.getLength());
    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    

}
