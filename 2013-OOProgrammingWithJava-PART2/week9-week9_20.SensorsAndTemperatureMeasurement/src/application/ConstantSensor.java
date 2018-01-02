/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author nathan
 */
public class ConstantSensor implements Sensor{
    private int value;

    public ConstantSensor(int value) {
        this.value = value;
    }
    
    @Override
    public int measure(){
        if (isOn())
            return value;
        throw new IllegalStateException("It is not online");
    }

    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public void off() {
        ;
    }

    @Override
    public void on() {
        ;
    }

}
