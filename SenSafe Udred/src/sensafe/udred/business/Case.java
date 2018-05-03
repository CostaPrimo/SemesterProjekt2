/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.util.ArrayList;

/**
 *
 * @author jtrue
 */
public class Case implements Comparable<Case>{

    

    private int caseID;
    private Employee employee;
    private CitizenProfile citizenProfile;
    private String caseDesc;
    private String relative;    
    private String medicine;
    
    public Case(int CaseID, Employee employee, CitizenProfile citizenProfile, String CaseDesc, String Relative, String Medicine) {
        this.caseID = CaseID;
        this.employee = employee;
        this.citizenProfile = citizenProfile;
        this.caseDesc = CaseDesc;
        this.relative = Relative;
        this.medicine = Medicine;
    }

    /**
     * @return the citizenProfile
     */
    public CitizenProfile getCitizenProfile() {
        return citizenProfile;
    }
   
    public int getCaseID() {
        return this.caseID;
    }
    
    @Override
    public int compareTo(Case o){
        int result;
        if(this.caseID > o.caseID){
            result = 1;
        }
        else{
            result = -1;
        }
        return result;
    }

    @Override
    public String toString() {
        return caseID + ":" + employee + ":" + citizenProfile + ":" + caseDesc + ":" + relative + ":" + medicine;
    }
    
    
    
    
}
