package sensafe.udred.persistance;

import java.sql.Timestamp;
import java.util.Date;
import sensafe.udred.acquaintance.IPersistance;

/**
 *
 * @author Jeppe Enevold
 */
public class PersistanceFacade implements IPersistance {
        private CaseDatabase caseDatabase = new CaseDatabase();
        private LogDatabase logDatabase = new LogDatabase();
        private UserDatabase userDatabase = new UserDatabase();
        
        @Override
        public void createCitizenUser(String CPR, String password, int userID){
            userDatabase.writeInfoToCitizenUser(CPR, password, userID);
        }
        
        @Override
        public void createLog(Date date, int ActorID, int TargetID, String action){
            logDatabase.writeInfoToLD(new Timestamp(date.getTime()), ActorID, TargetID, action);
        }
}
