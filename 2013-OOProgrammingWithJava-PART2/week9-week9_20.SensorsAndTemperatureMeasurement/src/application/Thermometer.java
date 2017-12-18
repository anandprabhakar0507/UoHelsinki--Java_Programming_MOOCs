/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author nathan
 */
public class Thermometer implements Sensor{
    private boolean online = false;
    private int value;
    private Random randomizer = new Random();
    
    public Thermometer(int value) {
        this.value = value;
    }
    
    @Override
    public boolean isOn() {
        return online;
    }

    @Override
    public void on() {
        online = true;
    }

    @Override
    public void off() {
        online = false;
    }

    @Override
    public int measure() {
        if (isOn())
            return randomizer.nextInt(61) - 30;
        throw new IllegalStateException("It is not online");
    }
    
}
