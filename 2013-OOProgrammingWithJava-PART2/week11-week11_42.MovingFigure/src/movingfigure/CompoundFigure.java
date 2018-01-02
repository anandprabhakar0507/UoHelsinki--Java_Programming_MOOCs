/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author nathan
 */
public class CompoundFigure extends Figure{
    private List<Figure> parts;
    
    public CompoundFigure(){
        super(0,0);
        this.parts = new ArrayList<Figure>();
    }

    public void add(Figure f){
        this.parts.add(f);
    }
    
    @Override
    public void draw(Graphics graphics) {
        parts.forEach(n -> n.draw(graphics));
    }

    @Override
    public void move(int dx, int dy) {
        parts.forEach(n -> n.move(dx, dy));
    }
    
    
}
