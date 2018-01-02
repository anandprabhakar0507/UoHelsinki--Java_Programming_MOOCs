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
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return readings;
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
        int sum = 0;
        if (!isOn())
            throw new IllegalStateException("Average Sensor is offline.");
        if (sensors.isEmpty())
            throw new IllegalStateException("Average Sensor has no sensors.");
        for (Sensor s : sensors)
            if (s.isOn())
                sum += s.measure();
        int avg = sum/sensors.size();
        readings.add(avg);
        return avg;
    }
    
    
}
