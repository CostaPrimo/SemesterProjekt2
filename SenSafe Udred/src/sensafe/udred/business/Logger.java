package sensafe.udred.business;

import sensafe.udred.business.caseManagement.Case;
import sensafe.udred.business.caseManagement.Journal;
import sensafe.udred.business.UserManagement.User;
import java.util.Date;

/**
 *
 * @author Jeppe Enevold
 */
public class Logger {
    private Date date;
    private int userID;
    private int caseID;
    private int journalID;
    
    public Logger(Case caseProfile, Journal journal, User user){
        this.date = new Date();
        this.userID = user.getUserID();
        this.caseID = caseProfile.getCaseID();
        this.journalID = journal.getJournalID();
    }

    @Override
    public String toString(){
        return "Date ; " + this.date + " ; UserID ; " + this.userID + " ; CaseID ; " + this.caseID + " ; JournalID ; " + this.journalID; 
    }
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @return the caseID
     */
    public int getCaseID() {
        return caseID;
    }

    /**
     * @return the journalID
     */
    public int getJournalID() {
        return journalID;
    }
    
}