/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;


/**
 *
 * @author nathan
 */
public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<Box>();

        if (things.get(0).getClass() == Item.class){
            List<Item> items = new ArrayList<Item>();
            things.forEach(n -> items.add((Item) n));
            Collections.sort(items);
            Box box = new Box(boxesVolume);
            for ( Item i : items){
                if (!box.addThing(i)){
                    boxes.add(box);
                    box = new Box(boxesVolume);
                    box.addThing(i);
                }
            }
            boxes.add(box);
        }
        return boxes;
    }
    
}
