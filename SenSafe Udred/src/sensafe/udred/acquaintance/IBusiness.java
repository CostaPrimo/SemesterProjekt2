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
    String loadCitizenUser(String CPR);
    String loadEmployee(int ID);
    String loadCitizenProfile(String CPRNumber);
    String loadCase(int caseID);
    String loadallJournal(int caseID);
    public String[] createCitizenUser(String CPRNumber);
    public String[] createEmployee(String name, String zipCode, String email, String department, String phonenumber);
    public void createCitizenProfile(String name, String email, String CPRNumber);
    public String createCase(String caseDescription, String citizenProfile, int caseResponsible);
    public String createJournal(String resume, int writer, int relatedCase);
    public boolean validateLogin(Long ID, String Password);
    public String showCaseOverview(String CPRNumber, String department);
    public String findCitizenProfile(String CPRNumber);
    public String loadAllCitizenUsers();
    public String loadAllEmployee();
    public String getLogs(int ID);
    public String showCaseOverviewForCitizen(String CPRNumber);
    public void changeDepartment(int userID, String newDepartment);
}
