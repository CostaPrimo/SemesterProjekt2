/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.ui;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sensafe.udred.acquaintance.IBusiness;
import sensafe.udred.acquaintance.IUI;

/**
 *
 * @author Nick
 */
public class UIRun extends Application implements IUI {
    private IBusiness business;
    private static UIRun uiRun;
    
    public static UIRun getInstance(){
        return uiRun;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void injectBusiness(IBusiness businessLayer) {
        this.business = businessLayer;
    }

    @Override
    public void startApplication(String[] args) {
        uiRun = this;
        launch(args);
    }
    
    //Methods for use in the controller
    //----------------------------------------------------------------------------------------------------
    
    public void createLog(int actorID, int targetID, String action){
        business.createLog(actorID, targetID, action);
    }
    
    public String loadCitizenUser(int ID){
        return business.loadCitizenUser(ID);
    }
    
    public String loadEmployee(int ID){
        return business.loadEmployee(ID);
    }
    
    public String loadCitizenProfile(String CPR){
        return business.loadCitizenProfile(CPR);
    }
    
    public String loadCase(int caseID){
        return business.loadCase(caseID);
    }
    
    public String loadJournal(int journalID){
        return business.loadJournal(journalID);
    }
    
    public String createCitizenUser(String CPR){
        return business.createCitizenUser(CPR);
        
    }
    
    public String createEmployee(String name, String zipCode, String email, String department, String phonenumber){
       return business.createEmployee(name, zipCode, email, department, phonenumber);
    }
    
    public void createCitizenProfile(String name, String email, String CPRNumber){
        business.createCitizenProfile(name, email, CPRNumber);
    }
    
    public void createCase(String caseDescription, String citizenProfile, int caseResponsible){
        business.createCase(caseDescription, citizenProfile, caseResponsible);
    }
    
    public void createJournal(String resume, int writer, int relatedCase){
        business.createJournal(resume, writer, relatedCase);
    }
    
    public boolean validateLogin(int ID, String Password){
        return business.validateLogin(ID, Password);
    }
    
    public String showCaseOverview(String CPRNumber, String department){
        return business.showCaseOverview(CPRNumber, department);
    }
    
    public String findCitizenProfile(String CPRNumber){
        return business.findCitizenProfile(CPRNumber);
    }
    
    public String loadAllCitizenUsers(){
        return business.loadAllCitizenUsers();
    }
    
    public String loadAllEmployee(){
        return business.loadAllEmployee();
    }
    
    public String getLogs(int ID){
        return business.getLogs(ID);
    }
    public String showCaseOverviewForCitizen(String CPRNumber){
        return business.showCaseOverviewForCitizen(CPRNumber);
    }
    public void changeDepartment(int userID, String newDepartment){
        business.changeDepartment(userID, newDepartment);
    }
}
