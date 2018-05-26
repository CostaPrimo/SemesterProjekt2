package sensafe.udred.business.caseManagement;
/**
 *
 * @author Nikolaj Frank-Jensen
 */
public class Journal {
    
    private int journalID;
    private int journalWriter;
    private String resume;
    
    public Journal(int ID, int employeeID, String resume){
        this.journalID = ID;
        this.journalWriter = employeeID;
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
