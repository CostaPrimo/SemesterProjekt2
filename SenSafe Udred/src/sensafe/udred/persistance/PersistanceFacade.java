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
    public void createCitizenUser(String CPR, String password){
        userDatabase.writeInfoToCitizenUser(CPR, password);
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
        return caseDatabase.loadJournal(journalID);
    }

    @Override
    public void createEmployee(String name, String zipCode, String email, String department, String phonenumber, String password) {
        userDatabase.writeInfoToEmployee(name, zipCode, email, department, phonenumber, password);
    }
    
    @Override
    public void createCitizenProfile(String name, String email, String CPRNumber){
        caseDatabase.writeInfoToCitizenProfile(name, email, CPRNumber);
    }
    
    @Override
    public void createCase(String caseDescription, String citizenProfile, int caseResponsible){
        caseDatabase.writeInfoToCaseTable(caseDescription, citizenProfile, caseResponsible);
    }
    
    @Override
    public void createJournal(String resume,int writer, int relatedCase){
        caseDatabase.writeInfoToJournal(resume, writer, relatedCase);
    }
    @Override
    public boolean validateLogin(int ID, String password){
        return userDatabase.validateLogin(ID, password);
    }

    
    
        
}

