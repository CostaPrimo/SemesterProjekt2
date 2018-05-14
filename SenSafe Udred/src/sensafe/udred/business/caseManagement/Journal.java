package sensafe.udred.business.caseManagement;

import sensafe.udred.business.UserManagement.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj Frank-Jensen
 */
public class Journal {
    
    private int journalID;
    private String journalWriter;
    private String resume;
    
    public Journal(int ID, Employee writer, String resume){
        this.journalID = ID;
        this.journalWriter = writer.getName();
        this.resume = resume;
    }
    
    public void journalCreate(){
        
    }
    
    public void journalSave(){
        
    }
    public int getJournalID(){
        return this.journalID;
    }
}
