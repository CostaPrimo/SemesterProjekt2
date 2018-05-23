/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.acquaintance;

/**
 *
 * @author Jeppe Enevold
 */
public interface IBusiness {
    void injectData(IPersistance persistanceLayer);
    void injectLogController(ILogController logController);
    void injectUserController(IUserController userController);
    void injectCaseController(ICaseController caseController);
    
    void createLog(int ActorID, int TargetID, String action);
    String loadCitizenUser(int ID);
    String loadEmployee(int ID);
    String loadCitizenProfile(String CPRNumber);
    String loadCase(int caseID);
    String loadJournal(int journalID);
    public String createCitizenUser(String CPRNumber);
    public String createEmployee(String name, String zipCode, String email, String department, String phonenumber);
    public void createCitizenProfile(String name, String email, String CPRNumber);
    public void createCase(String caseDescription, String citizenProfile, int caseResponsible);
    public void createJournal(String resume, int writer, int relatedCase);
    public boolean validateLogin(int ID, String Password);
    public String showCaseOverview(String CPRNumber, String department);
    public String findCitizenProfile(String CPRNumber);
    public String loadAllCitizenUsers();
    public String loadAllEmployee();
    public String getLogs(int ID);
    public String showCaseOverviewForCitizen(String CPRNumber);
}
