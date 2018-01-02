/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nathan
 */
public class Farm implements Alive{
    private String ownerName;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String ownerName, Barn barn){
        this.ownerName = ownerName;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow){
        cows.add(cow);
    }
    
    public void manageCows(){
        barn.takeCareOf(cows);
    }

    public String getOwner() {
        return ownerName;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }
    
    @Override
    public void liveHour() {
        cows.forEach(n -> n.liveHour());
    }
    
    @Override
    public String toString(){
        String result = "Farm owner: "     + ownerName                     + "\n" +
                        "Barn bulk tank: " + barn.getBulkTank().toString() + "\n" +
                        "Animals:";
        for (Cow cow : cows)
            result += "\n        " + cow.toString();
        return result;
    }
}
