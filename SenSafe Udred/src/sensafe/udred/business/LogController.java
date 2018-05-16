package sensafe.udred.business;

import sensafe.udred.acquaintance.ILogController;

/**
 *
 * @author Jeppe Enevold
 */
public class LogController implements ILogController {
    
    public LogController(){
        //LogList = new ArrayList<Logger>();
    }
    
    public void log(int ActorID, int TargetID, Action action){
       if(action.isUnknown(action)){
       //Return error string
       }
       else{
       //LogList.add(new Logger(user, caseProfile, action)); Call Log from persistance
       }
       
    }
    
    public String getlog(int targetID){
        //return LogList.get(targetID);
        return "temp";
    }
}