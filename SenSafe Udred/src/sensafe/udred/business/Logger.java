package sensafe.udred.business;

import java.util.Date;

/**
 *
 * @author Jeppe Enevold
 */
public class Logger {
    Date date;
    private Date date;
    private int userID;
    private int caseID;
    private int journalID;
    
    public Logger(Case caseProfile, Journal journal, User user){
        this.date = new Date();
        this.userID = user.getUserID();
        this.caseID = caseProfile.getID();
        this.journalID = journal.getJournalID();
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