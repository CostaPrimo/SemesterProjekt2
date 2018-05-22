package gluecode;

import sensafe.udred.business.caseManagement.CaseController;
import sensafe.udred.business.UserManagement.UserController;
import sensafe.udred.acquaintance.IBusiness;
import sensafe.udred.acquaintance.ICaseController;
import sensafe.udred.acquaintance.ILogController;
import sensafe.udred.acquaintance.IPersistance;
import sensafe.udred.acquaintance.IUI;
import sensafe.udred.acquaintance.IUserController;
import sensafe.udred.business.BusinessFacade;
import sensafe.udred.business.LogController;
import sensafe.udred.persistance.PersistanceFacade;
import sensafe.udred.ui.UIRun;
/**
 *
 * @author Jeppe Enevold
 */
public class SenSafeUdred {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Gluecode
         */
        //-------------------------------------------------------------------------------------------------------------------          
        
        IPersistance persistance = new PersistanceFacade();
        IBusiness business = new BusinessFacade();
        IUI UI = new UIRun();
        ICaseController caseController = new CaseController();
        ILogController logController = new LogController();
        IUserController userController = new UserController();
        
        business.injectData(persistance);
        business.injectCaseController(caseController);
        business.injectLogController(logController);
        business.injectUserController(userController);
        
        UI.injectBusiness(business);
        UI.startApplication(args);
        
        //System.out.println(business.loadAllCitizenUsers() + business.loadAllEmployee());
        
        //business.createEmployee("Kim Christensen", "5000", "lul@email.dk", "Handikap Afdelingens", "42233223");
        //business.createCitizenUser("1010294023");
        //business.createCitizenProfile("KimCitipro", "kim@email.dk", "2904489338");
        //business.createCase("Sample caseDescription", "2904489338", 2000);
        //business.createJournal("Sample resume", 2000, 3001);
        //System.out.println(business.loadEmployee(2000));
        //System.out.println(business.loadCitizenUser(1000));
        //System.out.println(business.loadCitizenProfile("2904489338"));
        //System.out.println(business.loadCase(3001));
        //System.out.println(business.loadJournal(4002));
                
        //-------------------------------------------------------------------------------------------------------------------          
    }
}