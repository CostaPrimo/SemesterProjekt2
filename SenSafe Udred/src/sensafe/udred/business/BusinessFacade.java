package sensafe.udred.business;

import java.util.Date;
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
    public void createUser(String CPR){
        String[]temp = userController.userCreate(CPR).split(";");
        persistance.createCitizenUser(CPR, temp[1], Integer.parseInt(temp[0]));
    }
    
    @Override
    public void createLog(int ActorID, int TargetID, String action){
        persistance.createLog(logController.log(ActorID, TargetID, action),ActorID,TargetID,logController.verifyAction(action));
    }
}
