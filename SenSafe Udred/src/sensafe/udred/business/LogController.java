package sensafe.udred.business;

import java.util.HashMap;
import sensafe.udred.acquaintance.ILogController;

/**
 *
 * @author Jeppe Enevold
 */
public class LogController implements ILogController {
    private HashMap<String, Action> validActions;
    
    
    public LogController(){
        validActions = new HashMap<String, Action>();
        for(Action command : Action.values()) {
             if(command != Action.UNKNOWN) {
                 validActions.put(command.toString(), command);
             }
         }
    }
    
    @Override
    public String log(int ActorID, int TargetID, String action){
       if(isUnknown(getAction(action))){
           return "non valid action";
       }
       else{
           return new Logger(ActorID, TargetID, getAction(action)).toString();
       }
    }
    
    public String getlog(int targetID){
        //return LogList.get(targetID);
        return "temp";
    }
    
    private boolean isUnknown(Action action){
        return action==Action.UNKNOWN;
    }
    
    private Action getAction(String action){
         Action validAction = validActions.get(action);
         if(validAction != null) {
             return validAction;
         }
         else {
             return Action.UNKNOWN;
         }        
    }
}