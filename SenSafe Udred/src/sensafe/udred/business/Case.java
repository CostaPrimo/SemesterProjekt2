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
public class Case {

    private int CaseID;
    private String CaseResponsible;
    private String CitizenProfile;
    private String CaseDesc;
    private String Relative;    
    private String Medicine;
    
    public Case(int CaseID, String CaseResponsible, String CitizenProfile, String CaseDesc, String Relative, String Medicine) {
        this.CaseID = CaseID;
        this.CaseResponsible = CaseResponsible;
        this.CitizenProfile = CitizenProfile;
        this.CaseDesc = CaseDesc;
        this.Relative = Relative;
        this.Medicine = Medicine;
    }

    //CaseDB
    ArrayList<Case> CaseList;
    
    public void CaseDatabase() {
        CaseList = new ArrayList<Case>();
    }
    
    public void caseCreate(int CaseID, String CaseResponsible, String CitizenProfile, String CaseDesc, String Relative, String Medicine) {
        CaseList.add(this);
    }
    
    public void caseDelete(int CaseID) {
        CaseList.remove(CaseID);
    }
    
    public int getCaseID() {
        return this.CaseID;
    }
    
    public void caseSave(int CaseID) {
        CaseList.add(CaseID, this);
    }
    
}
