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
    
}
