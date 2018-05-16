package sensafe.udred.persistance;

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
}
