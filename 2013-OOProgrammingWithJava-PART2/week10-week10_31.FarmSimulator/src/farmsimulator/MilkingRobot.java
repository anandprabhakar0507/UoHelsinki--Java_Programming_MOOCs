/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author nathan
 */
public class MilkingRobot {
    private BulkTank tank = null;
    
    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public void milk (Milkable milkable){
        if (this.tank == null)
            throw new IllegalStateException("No tank connected!");
        tank.addToTank(milkable.milk());
    }
    
    
    
}
