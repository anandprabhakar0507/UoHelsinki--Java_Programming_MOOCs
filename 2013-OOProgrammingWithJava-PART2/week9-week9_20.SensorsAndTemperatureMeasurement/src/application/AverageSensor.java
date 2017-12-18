/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nathan
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private boolean online = false;

    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
    }
    
    @Override
    public boolean isOn() {
        for (Sensor s : sensors)
            if (!s.isOn())
                return false;
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : sensors)
            if (!s.isOn())
                s.on();
    }

    @Override
    public void off() {
        for (Sensor s : sensors)
            if (s.isOn())
                s.off();
    }

    @Override
    public int measure() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
