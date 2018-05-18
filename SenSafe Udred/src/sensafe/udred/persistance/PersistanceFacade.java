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

    @Override
    public String loadEmployee(int ID) {
        return userDatabase.loadEmployee(ID);
    }

    @Override
    public String loadCitizenUser(int ID) {
        return userDatabase.loadCitizenUsers(ID);
    }
    
    @Override
    public String loadCitizenProfile(String CPR){
        return caseDatabase.loadCitizenProfile(CPR);
    }
    
    @Override
    public String loadCase(int caseID){
        return caseDatabase.loadCaseTable(caseID);
    }
    @Override
    public String loadJournal(int journalID){
        return caseDatabase.loadJournal();
    }

    
    
        
}

