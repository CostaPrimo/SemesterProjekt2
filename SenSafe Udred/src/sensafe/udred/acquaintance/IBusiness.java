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
    
    //void createUser(String CPR);
    void createLog(int ActorID, int TargetID, String action);
    String loadCitizenUser(int ID);
    String loadEmployee(int ID);
    String loadCitizenProfile(String CPR);
    String loadCase(int caseID);
    String loadJournal(int journalID);
}
