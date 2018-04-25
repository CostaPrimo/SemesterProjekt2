package sensafe.udred.business;

import java.util.Date;

/**
 *
 * @author Jeppe Enevold
 */
public class Logger {
    Date date;
    int userID;
    int caseID;
    int journalID;
    
    public Logger(){
        date = new Date();
        userID = 0;
        caseID = 0;
        journalID = 0;
    }
    
    public void log(){
        
    }
    
}
