
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Caio
 */
import java.util.*;

public class VehicleRegister {

    private final HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        } else {
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owner = new ArrayList<String>();
        
        for (RegistrationPlate ownerKey : owners.keySet()) {
            String ownerName = owners.get(ownerKey);
            
            if (!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
            
        }
        
        for (String name : owner) {
            System.out.println(name);
        }
    }
}
