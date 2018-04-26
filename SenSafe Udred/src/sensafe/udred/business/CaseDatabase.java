/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Nick
 */
public class CaseDatabase {
    private ArrayList<CitizenProfile> citizenCollection = new ArrayList<>();
    
    
    public CaseDatabase() {
        
    }
    
    
    public void findCitizenProfile(String CPRNummer){
        for (CitizenProfile c : citizenCollection){
            if (CPRNummer == c.getCPR()){
                System.out.println(c);
            }
            
        }
        
    }
    
    public void addTocitizenCollection(CitizenProfile e){
        citizenCollection.add(e);   
    
    }
    
}
