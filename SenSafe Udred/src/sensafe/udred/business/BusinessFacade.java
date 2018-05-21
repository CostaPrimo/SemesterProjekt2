package sensafe.udred.business;

import sensafe.udred.acquaintance.IBusiness;
import sensafe.udred.acquaintance.ICaseController;
import sensafe.udred.acquaintance.ILogController;
import sensafe.udred.acquaintance.IPersistance;
import sensafe.udred.acquaintance.IUserController;

/**
 *
 * @author Jeppe Enevold
 */
public class BusinessFacade implements IBusiness {
    private IPersistance persistance;
    private ICaseController caseController;
    private ILogController logController;
    private IUserController userController;

    /**
     * 
     * inject methods
     */
    //-------------------------------------------------------------------------------------------------------------------
    @Override
    public void injectData(IPersistance persistanceLayer) {
        this.persistance = persistanceLayer;
    }

    @Override
    public void injectLogController(ILogController logController) {
        this.logController = logController;
    }

    @Override
    public void injectUserController(IUserController userController) {
        this.userController = userController;
    }

    @Override
    public void injectCaseController(ICaseController caseController) {
        this.caseController = caseController;
    }
    
    //-------------------------------------------------------------------------------------------------------------------    
    @Override
    public void createCitizenUser(String CPR){
        String[]temp = userController.createCitizenUser(CPR).split(";");
        persistance.createCitizenUser(CPR, temp[1]);
        System.out.println(temp[1]); //This needs to be printed out on GUI
    }
    @Override
    public void createEmployee(String name, String zipCode, String email, String department, String phonenumber){
        String[]temp = userController.createEmployee(name, zipCode, email, department, phonenumber).split(";");
        persistance.createEmployee(temp[0],temp[1],temp[2],temp[3],temp[4], temp[5]);
        System.out.println(temp[5]); //This needs to be printed out on GUI
    }
    
    @Override
    public void createCitizenProfile(String name, String email, String CPRNumber){
        String[]temp = caseController.createCitizenProfile(name, email, CPRNumber).split(";"); //Laves i tilfælde af at citizenprofile får mere funktionalitet senere.
        persistance.createCitizenProfile(temp[0], temp[1], temp[2]);
    }
    @Override
    public void createLog(int ActorID, int TargetID, String action){
        persistance.createLog(logController.log(ActorID, TargetID, action), ActorID, TargetID, logController.verifyAction(action));
    }
    @Override
    public void createCase(String caseDescription, String citizenProfile, int caseResponsible){
        persistance.createCase(caseDescription, citizenProfile, caseResponsible);
    }
    @Override
    public void createJournal(String resume, int writer, int relatedCase){
        persistance.createJournal(resume, writer, relatedCase);
    }
    
    @Override
    public String loadCitizenUser(int ID){
        return persistance.loadCitizenUser(ID);
    
    }
    
    @Override
    public String loadEmployee(int ID){
        return persistance.loadEmployee(ID);
    }
    
    @Override
    public String loadCitizenProfile(String CPR){
        return persistance.loadCitizenProfile(CPR);
    }
    
    @Override
    public String loadCase(int caseID){
        return persistance.loadCase(caseID);
    }
    
    @Override
    public String loadJournal(int journalID){
        return persistance.loadJournal(journalID);
    }
    
    @Override
    public boolean validateLogin(int ID, String password){
        return persistance.validateLogin(ID, password);
    }
    
    @Override
    public String showCaseOverview(String CPRNumber, String department){
        return persistance.showCaseOverview(CPRNumber, department);
    }
    
    @Override
    public String findCitizenProfile(String CPRNumber){
        return persistance.findCitizenProfile(CPRNumber);
    }
    
}
