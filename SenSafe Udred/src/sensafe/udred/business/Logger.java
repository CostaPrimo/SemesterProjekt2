package sensafe.udred.business;

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
    
    //Log User to Journal Interraction
    public Logger(int ActorID, int TargetID, Action action){
        this.date = new Date();
        this.actorID = ActorID;
        this.targetID = TargetID;
        this.action = action;
    }

    @Override
    public String toString(){
        return "Date;" + this.date + ";ActorID;" + this.actorID + ";TargetID;" + this.targetID + ";Action;" + this.action.toString(); 
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