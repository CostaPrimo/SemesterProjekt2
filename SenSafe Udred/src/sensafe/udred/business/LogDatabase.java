package sensafe.udred.business;

import java.util.ArrayList;
//import java.util.Collection;

/**
 *
 * @author Jeppe Enevold
 */
public class LogDatabase {
 
    //Collection<Logger> LogList;
    ArrayList<Logger> LogList;
    public LogDatabase(){
        LogList = new ArrayList<Logger>();
    }
    
    public void log(Journal journal, User user, Case caseProfile){
       LogList.add(new Logger(caseProfile, journal, user));
    }
    public Logger getlog(int i){
        return LogList.get(i);
    }
    public void deleteLog(){
        
    }
}
