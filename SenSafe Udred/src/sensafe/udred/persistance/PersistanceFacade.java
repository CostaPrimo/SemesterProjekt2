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
    public String createCitizenUser(String CPR, String password){
        return userDatabase.writeInfoToCitizenUser(CPR, password);
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
    public String loadCitizenUser(String CPR) {
        return userDatabase.loadCitizenUsers(CPR);
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
    public String loadallJournal(int caseID){
        return caseDatabase.loadallJournal(caseID);
    }

    @Override
    public String createEmployee(String name, String zipCode, String email, String department, String phonenumber, String password) {
        return userDatabase.writeInfoToEmployee(name, zipCode, email, department, phonenumber, password);
    }
    
    @Override
    public void createCitizenProfile(String name, String email, String CPRNumber){
        caseDatabase.writeInfoToCitizenProfile(name, email, CPRNumber);
    }
    
    @Override
    public String createCase(String caseDescription, String citizenProfile, int caseResponsible){
        return caseDatabase.writeInfoToCaseTable(caseDescription, citizenProfile, caseResponsible);
    }
    
    @Override
    public String createJournal(String resume,int writer, int relatedCase){
       return caseDatabase.writeInfoToJournal(resume, writer, relatedCase);
    }
    @Override
    public boolean validateLogin(Long ID, String password){
        return userDatabase.validateLogin(ID, password);
    }

    @Override
    public String showCaseOverview(String CPRNumber, String department){
        return caseDatabase.showCaseOverview(CPRNumber, department);
    }
    
    @Override
    public String findCitizenProfile(String CPRNumber){
        return caseDatabase.loadCitizenProfile(CPRNumber);
    }

    @Override
    public String loadAllCitizenUsers() {
        return userDatabase.loadAllCitizenUsers();
    }

    @Override
    public String loadAllEmployee() {
        return userDatabase.loadAllEmployee();
    }
    
    @Override
    public String getLogs(int ID){
        return logDatabase.getLogs(ID);
    }

    @Override
    public String showCaseOverviewForCitizen(String CPRNumber) {
        return caseDatabase.showCaseOverviewForCitizen(CPRNumber);
    }
    
    @Override
    public void changeDepartment(int userID, String newDepartment){
        userDatabase.changeDepartment(userID, newDepartment);
    }
        
}

