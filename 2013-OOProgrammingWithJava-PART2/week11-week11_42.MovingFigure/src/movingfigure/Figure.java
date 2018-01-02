/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author nathan
 */
public abstract class Figure {
    private int x;
    private int y;

    public abstract void draw(Graphics graphics);
    
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }
    
    
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    
    
    
}
