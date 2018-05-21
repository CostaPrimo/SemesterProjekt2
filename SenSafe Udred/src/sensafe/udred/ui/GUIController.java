/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Jeppe Enevold
 */
public class GUIController implements Initializable {
    
    @FXML
    private AnchorPane BaggrundAnchorPane;
    @FXML
    private BorderPane LogInBorderPane;
    @FXML
    private Label LogInTitel;
    @FXML
    private HBox logInCenterHBox;
    @FXML
    private VBox LogInLeftVbox;
    @FXML
    private VBox LogInMiddleVBox;
    @FXML
    private Label LogInUserNameLabel;
    @FXML
    private Label LogInPasswordLabel;
    @FXML
    private PasswordField LogInPasswordField;
    @FXML
    private VBox LogInRightVBox;
    @FXML
    private Button LogInLogInButton;
    @FXML
    private BorderPane AdminFrontPageBorderPane;
    @FXML
    private Label AdminFrontPageTitelLabel;
    @FXML
    private VBox AdminFrontPageVBox;
    @FXML
    private Button AdminFrontPageCreateEmployeeButton;
    
    @FXML
    private Button AdminFrontPageCreateCitizenButton;
    @FXML
    private Button AdminFrontPageDeleteUserButton;
    @FXML
    private BorderPane EmployeeBorderPane;
    @FXML
    private Label EmployeeFrontPageTitel;
    @FXML
    private Button EmployeeLogOutButton;
    @FXML
    private VBox EmployeeVBox;
    @FXML
    private Button EmployeeCreateCaseButton;
    @FXML
    private Button EmployeeFindCitizenProfileButton;
    @FXML
    private BorderPane CitizenBorderPane;
    @FXML
    private Label CitizenTitelLabel;
    private Button CitizenLogOutButton;
    @FXML
    private HBox CitizenCenterHbox;
    @FXML
    private HBox CitizenInnerCenterHbox;
    @FXML
    private VBox CitizenLeftVBox;
    @FXML
    private Label CitizenPersonInformationLabel;
    @FXML
    private Label CitizenCPRLabel;
    @FXML
    private Label CitizenNameLabel;
    @FXML
    private Label CitizenEmailLabel;
    @FXML
    private VBox CitizenMiddleVBox;
    @FXML
    private Label CitizenCPRUnfilledLabel;
    @FXML
    private Label CitizenNameUnfilledLabel;
    @FXML
    private Label CitizenEmailUnfilledLabel;
    @FXML
    private VBox CitzienRightVBox;
    @FXML
    private Label CitizenCasesLabel;
    @FXML
    private ListView<?> CitizenListView;
    @FXML
    private Button CitizenOpenCaseButton;
    @FXML
    private BorderPane FindCitizenBorderPane;
    @FXML
    private Label FindCitizenTitelLabel;
    @FXML
    private Button FindCitizenGoBackButton;
    @FXML
    private HBox FindCitizenCenterHBox;
    @FXML
    private VBox FindCitizenVBox;
    @FXML
    private Label FindCitizenCPRNummerLabel;
    @FXML
    private TextField FindCitizenWriteCPRTextField;
    @FXML
    private Label FindCitizenAccessDeniedLabel;
    @FXML
    private Label FindCitizenCPRNonexistentWarningLabel;
    @FXML
    private BorderPane CaseInformationBorderPane;
    @FXML
    private Label CaseInformationTitelLabel;
    @FXML
    private HBox CaseInformationCenterHbox;
    @FXML
    private HBox CaseInformationInnerLeftCenterHBox;
    @FXML
    private VBox CaseInformationLeftVBox;
    @FXML
    private Label CaseInformationCaseInformationLabel;
    @FXML
    private Label CaseInformationCaseIDLabel;
    @FXML
    private Label CaseInformationEmployeeLabel;
    @FXML
    private Label CaseInformationCitizenProfileLabel;
    @FXML
    private Label CaseInformationRelativeLabel;
    @FXML
    private Label CaseInformationMedicineLabel;
    @FXML
    private VBox CaseInformationMiddleVBox;
    @FXML
    private Label CaseInformationCaseIdUnfilledLabel;
    @FXML
    private Label CaseInformationeEmployeeUnfilledLabel;
    @FXML
    private Label CaseInformationRelativeUnfilledLabel;
    @FXML
    private Label CaseInformationMedicineUnfilledLabel;
    @FXML
    private VBox CaseInformationRightVBox;
    @FXML
    private Label CaseInformationCaseDescriptionLabel;
    @FXML
    private TextArea CaseInformationCaseDescriptionTextArea;
    @FXML
    private Label CaseInformationJournalerLabel;
    @FXML
    private ListView<?> CaseInformationJournalListView;
    @FXML
    private Button CaseInformationBackButton;
    @FXML
    private BorderPane DeleteUserBorderPane;
    @FXML
    private Label DeleteUserTitel;
    @FXML
    private Button DeleteUserBackButton;
    @FXML
    private HBox DeleteUserCenterHBox;
    @FXML
    private VBox DeleteUserLeftVBox;
    @FXML
    private VBox DeleteUserMiddleVBox;
    @FXML
    private Label DeleteUserInsertUserIDLabel;
    @FXML
    private TextField DeleteUserInsertUserIDTextField;
    @FXML
    private Button DeleteUserDeleteUserButton;
    @FXML
    private GridPane DeleteUserGridPane;
    @FXML
    private Label DeleteUserInsertAdminLabel;
    @FXML
    private PasswordField DeleteUserPassWordPasswordField;
    @FXML
    private TextField DeleteUserUserIDTextField;
    @FXML
    private Label DeleteUserBrugerIDFilledLabel;
    @FXML
    private Label DeleteUserPasswordtextLabel;
    @FXML
    private Button DeleteUserConfirmButton;
    @FXML
    private VBox DeleteUserRightVBox;
    @FXML
    private BorderPane CreateEmployeeBorderPane;
    @FXML
    private Label CreateEmployeeTitel;
    @FXML
    private Button CreateEmployeeBackButton;
    @FXML
    private HBox CreateEmployeeCenterHBox;
    @FXML
    private VBox CreateEmployeeLeftVBox;
    @FXML
    private Label CreateEmployeeNameLabel;
    @FXML
    private Label CreateEmployeeEmailLabel;
    @FXML
    private Label CreateEmployeeZipcodeLabel;
    @FXML
    private Label CreateEmployeeDepartmentLabel;
    @FXML
    private Label CreateEmployeePhoenNumberLabel;
    @FXML
    private VBox CreateEmployeeRightVBox;
    @FXML
    private TextField CreateEmployeeNameTextField;
    @FXML
    private TextField CreateEmployeeEmailTextField;
    @FXML
    private TextField CreateEmployeeZipcodeTextField;
    @FXML
    private TextField CreateEmployeeDepartmentTextField;
    @FXML
    private TextField CreateEmployeePhoneNumberTextField;
    @FXML
    private Button CreateEmployeeCreateEmployeeButton;
    @FXML
    private BorderPane CreateCitizenBorderPane;
    @FXML
    private Label CreateCitizenTitelLabel;
    @FXML
    private Button CreateCitizenBackButton;
    @FXML
    private VBox CreateCitizenCenterVBox;
    @FXML
    private Label CreateCitizenCPRLabel;
    @FXML
    private TextField CreateCitizenCPRTextField;
    @FXML
    private Button CreateCitizenCreateCitizenButton;
   
    @FXML
    private Button AdminFrontPageLogOutButton;
    @FXML
    private Button CitizenBackButton;
    @FXML
    private TextField LogInUserIDTextField;
    @FXML
    private Label CreateEmployeeWarningLabel;
    @FXML
    private Label CreateEmployeePasswordLabel;
    @FXML
    private Label CreateEmployeeTextLabel;
    @FXML
    private Label CreateCitizenTextLabel;
    @FXML
    private Label CreateCitizenPasswordLabel;
    @FXML
    private Label CreateCitizenWarningLabel;
    @FXML
    private ScrollPane CreateCaseScrollPane1;
    @FXML
    private BorderPane CreateCaseInnerBorderPane1;
    @FXML
    private Button CreateCaseBackButton1;
    @FXML
    private TextArea CreateCaseCaseDescTextArea1;
    @FXML
    private TextField CreateCaseCPRTextField1;
    @FXML
    private TextField CreateCaseEmployeeIDTextField1;
    @FXML
    private Button CreateCaseCreateCaseButton1;
    @FXML
    private Pane CreateCaseCaseCreatedPopupPane;
    @FXML
    private Label CreateCaseCaseCreatedPopupLabel;
    @FXML
    private Button CreateCaseCaseCreatedPopupButton;
    @FXML
    private StackPane CreateCaseStackPane;

    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
   @FXML
    private void adminButtons(ActionEvent event){
        if(event.getSource()==AdminFrontPageCreateEmployeeButton){
            AdminFrontPageBorderPane.setVisible(false);
            CreateEmployeeBorderPane.setVisible(true);
        }
        else if(event.getSource()==AdminFrontPageCreateCitizenButton){
            AdminFrontPageBorderPane.setVisible(false);
            CreateCitizenBorderPane.setVisible(true);
        }
        else if(event.getSource()==AdminFrontPageDeleteUserButton){
            AdminFrontPageBorderPane.setVisible(false);
            DeleteUserBorderPane.setVisible(true);
        }
        else if (event.getSource() == AdminFrontPageLogOutButton){
            AdminFrontPageBorderPane.setVisible(false);
            //Make sure to swap something around in logic layer
            //ActiveUser == null
            LogInBorderPane.setVisible(true);
            
        }
       
    }
    @FXML
    private void citizenButtons(ActionEvent event){
        if(event.getSource()==CitizenOpenCaseButton){
            CitizenBorderPane.setVisible(false);
            //TODO
            //ADD LOAD CASE INFORMATION
            CaseInformationBorderPane.setVisible(true);
        }
        else if(event.getSource()==CitizenBackButton){
           
            CitizenBorderPane.setVisible(false);
            //Make sure to swap something around in logic layer
            //ActiveUser == null            
            LogInBorderPane.setVisible(true);
        }
    }
    @FXML
    private void employeeButtons(ActionEvent event){
        if(event.getSource()==EmployeeCreateCaseButton){
            EmployeeBorderPane.setVisible(false);
            
            CreateCaseStackPane.setVisible(true);
            CreateCaseScrollPane1.setVisible(true);
        }
        else if(event.getSource()==EmployeeFindCitizenProfileButton){
            EmployeeBorderPane.setVisible(false);
            FindCitizenBorderPane.setVisible(true);
        }
        else if(event.getSource()==EmployeeLogOutButton){
            //Make sure to swap something around in logic layer
            //ActiveUser == null
            EmployeeBorderPane.setVisible(false);
            LogInBorderPane.setVisible(true);
        }
    }
    @FXML
    private void goBack(ActionEvent event){
        if(event.getSource()== CreateEmployeeBackButton){
            CreateEmployeeBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
            //UIRun.getInstance().createLog(1100, 1220, "create");
            
        }
        else if(event.getSource()== CreateCitizenBackButton){
            CreateCitizenBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
        }
      
        else if(event.getSource()==CreateCaseBackButton1){
            CreateCaseStackPane.setVisible(false);
            EmployeeBorderPane.setVisible(true);
        }
        else if(event.getSource()==CaseInformationBackButton){
            CaseInformationBorderPane.setVisible(false);
            CitizenBorderPane.setVisible(true);
        
            
        }
        else if(event.getSource()==FindCitizenGoBackButton){
            FindCitizenBorderPane.setVisible(false);
            EmployeeBorderPane.setVisible(true);
        }
        else if(event.getSource()==DeleteUserBackButton){
            DeleteUserBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
        }
    }
    @FXML
    private void LogIn(ActionEvent event){
        String userID = LogInUserIDTextField.getText();
        String password = LogInPasswordField.getText();
        
        
        if(UIRun.getInstance().validateLogin(Integer.parseInt(userID), password)){
            //Logind Employee
            if (userID.charAt(0) == '2' ){
                LogInBorderPane.setVisible(false);
                EmployeeBorderPane.setVisible(true);
            }
            //Citizen log in check
            else if(userID.charAt(0) == '1'){
                //String CPR
                LogInBorderPane.setVisible(false);
                CitizenBorderPane.setVisible(true);
               // UIRun.getInstance().loadCitizenProfile();
            }
            //Logind Admin
            else if (userID.charAt(0) == '5') {
                LogInBorderPane.setVisible(false);
                AdminFrontPageBorderPane.setVisible(true);
            }
        }   
    }
    @FXML
    private void createEmployee(ActionEvent event) {
        String name = CreateEmployeeNameTextField.getText();
        String Email = CreateEmployeeEmailTextField.getText();
        String Zipcode = CreateEmployeeZipcodeTextField.getText();
        String Department = CreateEmployeeDepartmentLabel.getText();
        String Phonenumber = CreateEmployeePhoneNumberTextField.getText();
        
        if(name.isEmpty() || Email.isEmpty() || Zipcode.isEmpty() || Department.isEmpty() || Phonenumber.isEmpty()){
            CreateEmployeeWarningLabel.setVisible(true);
            CreateEmployeePasswordLabel.setText("");
        }
        else{
            CreateEmployeeWarningLabel.setVisible(false);
            CreateEmployeePasswordLabel.setText(UIRun.getInstance().createEmployee(name, Zipcode, Email, Department, Phonenumber));
        }
           
    
    }
    @FXML
    private void createCitizenUser(ActionEvent event){
        String CPR = CreateCitizenCPRTextField.getText();
        
        if (CPR.isEmpty()) {
            CreateCitizenWarningLabel.setText("Pls enter a CPR");
            CreateCitizenWarningLabel.setVisible(true);
            CreateCitizenPasswordLabel.setVisible(false);
            
        }
        else if (CPR.length() == 10){
            CreateCitizenPasswordLabel.setText(UIRun.getInstance().createCitizenUser(CPR));
            CreateCitizenPasswordLabel.setVisible(true);
            CreateCitizenWarningLabel.setVisible(false);
        }
        else if (CPR.length() != 10) {
            CreateCitizenWarningLabel.setText("Pls enter a CPR thats 10 numbers long");
            
        }
        
        
    }
    //Ikke done metode
    @FXML
    private void createCase(ActionEvent event){
        String caseDesc = CreateCaseCaseDescTextArea1.getText();
        String employeeID = CreateCaseEmployeeIDTextField1.getText();
        String citizenProfile = CreateCaseCPRTextField1.getText();
        
           if (caseDesc.isEmpty() || employeeID.isEmpty()|| citizenProfile.isEmpty()) {
               CreateCaseCaseCreatedPopupLabel.setText("Udfyld venligst alle felter");
               CreateCaseCaseCreatedPopupPane.setVisible(true);
            }
           else {
               
               UIRun.getInstance().createCase(caseDesc, citizenProfile, Integer.parseInt(employeeID));
               CreateCaseCaseCreatedPopupLabel.setText("Sagen er oprettet");
               CreateCaseCaseCreatedPopupPane.setVisible(true);
           }
    }  
    @FXML
    private void createCasePopupButton(ActionEvent event){
        CreateCaseCaseCreatedPopupPane.setVisible(false);
        CreateCaseScrollPane1.setVisible(false);
        CreateCaseStackPane.setVisible(false);
        EmployeeBorderPane.setVisible(true);
    
    }
}

