package sensafe.udred.business.caseManagement;
import sensafe.udred.business.UserManagement.Employee;
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
