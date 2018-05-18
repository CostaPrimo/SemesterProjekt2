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

    @Override
    public void createEmployee(int userID, String name, String zipCode, String email, String department, String phonenumber, char[] password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
        
}

