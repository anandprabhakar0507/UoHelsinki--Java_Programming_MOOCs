
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners ;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if (this.owners.containsKey(plate))
            return false;
        this.owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        if (this.owners.containsKey(plate))
            return this.owners.get(plate);
        return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            this.owners.put(plate, null);
            return true;
        }
        
        return false;   
    }
    
    public void printRegistrationPlates(){
        this.owners.keySet().forEach(n -> System.out.println(n));
    }
    
    public void printOwners(){
        ArrayList<String> ownerSet = new ArrayList<String>();
        for (String o : this.owners.values()){
            if (!ownerSet.contains(o)){
                ownerSet.add(o);
                System.out.println(o);
            }
        }
    }
    
    
}
