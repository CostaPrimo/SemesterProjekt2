/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

/**
 *
 * @author Nick
 */
public class CitizenProfile {
    private String Name;
    private String Email;
    private String CPR;
    

    public CitizenProfile(String Name, String Email, String CPR) {
        this.Name = Name;
        this.Email = Email;
        this.CPR = CPR;
        
    }
    
    
    
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getCPR() {
        return CPR;
    }

    @Override
    public String toString() {
        return "CitizenProfile{" + "Name=" + Name + ", Email=" + Email + ", CPR=" + CPR + '}';
    }

    
    
    
}