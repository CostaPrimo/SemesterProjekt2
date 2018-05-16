package sensafe.udred.business;

import sensafe.udred.business.caseManagement.Case;
import sensafe.udred.business.UserManagement.User;

/**
 *
 * @author Jeppe Enevold
 */
public class LogController {
    
    public LogController(String LogDatabase){
        //LogList = new ArrayList<Logger>();
    }
    
    public void log(User user, Case caseProfile, Action action){
       if(action.isUnknown(action)){
       //Return error string
       }
       else{
       //LogList.add(new Logger(user, caseProfile, action)); Call Log from persistance
       }
       
    }
    
    public Logger getlog(int targetID){
        //return LogList.get(targetID);
    }
}