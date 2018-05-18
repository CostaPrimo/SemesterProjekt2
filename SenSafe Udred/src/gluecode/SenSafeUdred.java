/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gluecode;

import sensafe.udred.business.caseManagement.CaseController;
import sensafe.udred.business.caseManagement.CitizenProfile;
import sensafe.udred.business.UserManagement.Employee;
import sensafe.udred.business.UserManagement.UserController;
import java.io.File;
import java.util.Scanner;
import sensafe.udred.acquaintance.IBusiness;
import sensafe.udred.acquaintance.ICaseController;
import sensafe.udred.acquaintance.ILogController;
import sensafe.udred.acquaintance.IPersistance;
import sensafe.udred.acquaintance.IUserController;
import sensafe.udred.business.BusinessFacade;
import sensafe.udred.business.LogController;
import sensafe.udred.persistance.PersistanceFacade;

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
        ICaseController caseController = new CaseController("temp","temp");
        ILogController logController = new LogController();
        IUserController userController = new UserController("temp","temp");
        
        business.injectData(persistance);
        business.injectCaseController(caseController);
        business.injectLogController(logController);
        business.injectUserController(userController);
        
        //-------------------------------------------------------------------------------------------------------------------          
        business.createLog(1069, 2042, "create");
    }
}