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
    public String[] createCitizenUser(String CPR){
        String[]temp = userController.createCitizenUser(CPR).split(";");
        String userID =persistance.createCitizenUser(CPR, temp[1]);
        String[]returnValue ={temp[1],userID};
        System.out.println(temp[1]); //This needs to be printed out on GUI
        return returnValue;
    }
    @Override
    public String[] createEmployee(String name, String zipCode, String email, String department, String phonenumber){
        String[]temp = userController.createEmployee(name, zipCode, email, department, phonenumber).split(";");
        System.out.println(temp[5]); //This needs to be printed out on GUI
        String userID = persistance.createEmployee(temp[0],temp[1],temp[2],temp[3],temp[4], temp[5]);
        String[]returnValue ={temp[5], userID};
        return returnValue;
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
    public String createCase(String caseDescription, String citizenProfile, int caseResponsible){
        return persistance.createCase(caseDescription, citizenProfile, caseResponsible);
    }
    @Override
    public String createJournal(String resume, int writer, int relatedCase){
        return persistance.createJournal(resume, writer, relatedCase);
    }
    
    @Override
    public String loadCitizenUser(String CPR){
        return persistance.loadCitizenUser(CPR);
    
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
    public String loadallJournal(int caseID){
        return persistance.loadallJournal(caseID);
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
    
    @Override
    public String loadAllCitizenUsers(){
        return persistance.loadAllCitizenUsers();
    }
    
    @Override
    public String loadAllEmployee(){
        return persistance.loadAllEmployee();
    }
    
    @Override
    public String getLogs(int ID){
        return persistance.getLogs(ID);
    }

    @Override
    public String showCaseOverviewForCitizen(String CPRNumber) {
        return persistance.showCaseOverviewForCitizen(CPRNumber);
    }
    
    @Override
    public void changeDepartment(int userID, String newDepartment){
        persistance.changeDepartment(userID, newDepartment);
    }
}
