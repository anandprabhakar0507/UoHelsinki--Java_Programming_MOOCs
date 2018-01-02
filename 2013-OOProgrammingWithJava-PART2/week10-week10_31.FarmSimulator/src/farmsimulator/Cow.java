/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author nathan
 */
public class Cow implements Milkable, Alive{
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private String name;
    private double udderCapacity;
    private double amount = 0; 
    
    public Cow(String name) {
        this.name = name;
        this.udderCapacity = new Random().nextInt(26)+15;
    }

    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public double milk() {
        double take = amount;
        amount = 0;
        return take;
    }

    @Override
    public void liveHour() {
        amount += new Random().doubles(0.7, 2).findFirst().getAsDouble();
        if (amount > udderCapacity)
            amount = udderCapacity;
    }
    
    @Override
    public String toString(){
        return name + " " + Math.ceil(amount) + "/"  + Math.ceil(udderCapacity);
    }
    
    
}
