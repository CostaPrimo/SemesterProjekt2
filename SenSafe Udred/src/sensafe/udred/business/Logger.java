package sensafe.udred.business;

import sensafe.udred.business.caseManagement.Case;
import sensafe.udred.business.UserManagement.User;
import java.util.Date;

/**
 *
 * @author Jeppe Enevold
 */
public class Logger {
    private Date date;
    private int actorID;
    private int targetID;
    private Action action;
    
    public Logger(User user, Case caseProfile, Action action){
        this.action = action;
        this.date = new Date();
        this.actorID = user.getUserID();
        this.targetID = caseProfile.getCaseID();
    }

    @Override
    public String toString(){
        return "Date ; " + this.date + " ; ActorID ; " + this.actorID + " ; TargetID ; " + this.targetID + " ; Action ; " + this.action; 
    }
    /**
     * @return the date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * @return the userID
     */
    public int getActorID() {
        return this.actorID;
    }

    /**
     * @return the caseID
     */
    public int getTargetID() {
        return this.targetID;
    }
    
    /**
     * @return the Action
     */
    public Action getAction(){
        return this.action;
    }
}