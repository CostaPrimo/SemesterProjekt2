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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
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
    private ListView<String> CitizenListView;
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
    private ListView<String> CaseInformationJournalListView;
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
    @FXML
    private ListView<String> DeleteUserListView;
    @FXML
    private Button FindCitizenButton;
    @FXML
    private Label CaseInformationEmployeeUnfilledLabel;
    @FXML
    private Label CaseInformationCitizenProfileUnfilledLabel;
    @FXML
    private BorderPane ShowLogsBorderPane;
    @FXML
    private Button ShowLogsBackButton;
    @FXML
    private TextField ShowLogIDTextField;
    @FXML
    private Button ShowLogsShowLogsButton;
    @FXML
    private ListView<String> ShowLogsListView;
    @FXML
    private Button AdminFrontPageShowLogs;
    @FXML
    private Label ShowLogsWarningLabel;
    @FXML
    private BorderPane ChangeDepartmentBorderPane;
    @FXML
    private Button ChangeDepartmentBackButton;
    @FXML
    private TextField ChangeDepartmentUserIDTextField;
    @FXML
    private ChoiceBox<String> ChangeDepartmentChoiceBox;
    @FXML
    private Button ChangeDepartmentChangeDepartmentButton;
    @FXML
    private Button AdminFrontPageChangeDepartmentButton;
    @FXML
    private Label ChangeDepartmentWarningLabel;
    @FXML
    private Label ChangeDepartmentConfirmationLabel;

    
    private int userReference;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ChangeDepartmentChoiceBox.getItems().addAll("Handicap Afdelingen", "Børne- og Familieafdelingen", "Socialafdelingen", "Sundheds- og Omsorgsafdelingen", "Ikke Aktiv");
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
            DeleteUserListView.getItems().clear();
            DeleteUserListView.getItems().addAll(UIRun.getInstance().loadAllEmployee().split("\n"));
            DeleteUserListView.getItems().addAll(UIRun.getInstance().loadAllCitizenUsers().split("\n"));
        }
        else if (event.getSource() == AdminFrontPageLogOutButton){
            UIRun.getInstance().createLog(userReference, userReference, "logout");
            AdminFrontPageBorderPane.setVisible(false);
            LogInBorderPane.setVisible(true);
            userReference = 0;
            
        }
        else if (event.getSource() == AdminFrontPageShowLogs) {
           AdminFrontPageBorderPane.setVisible(false);
           ShowLogsBorderPane.setVisible(true);
       }
        else if (event.getSource() == AdminFrontPageChangeDepartmentButton) {
           AdminFrontPageBorderPane.setVisible(false);
           ChangeDepartmentBorderPane.setVisible(true);

       }
       
    }
    @FXML
    private void citizenButtons(ActionEvent event){
        if(event.getSource()==CitizenOpenCaseButton){
            CitizenBorderPane.setVisible(false);
            CaseInformationBorderPane.setVisible(true);
            String[] caseOverview = CitizenListView.getSelectionModel().getSelectedItem().split(",");
            System.out.println(caseOverview[0]+ " " + caseOverview[1] + " , " + caseOverview[2] + " , " + caseOverview[3] + " , ");
            String caseID = caseOverview[0];
            String caseDescription = caseOverview[1];
            String citizenProfile = caseOverview[2];
            String employee = caseOverview[3];
            CaseInformationCaseIdUnfilledLabel.setText(caseID);
            CaseInformationCaseDescriptionTextArea.setText(caseDescription);
            CaseInformationEmployeeUnfilledLabel.setText(employee);
            CaseInformationCitizenProfileUnfilledLabel.setText(citizenProfile);
            //Ingen journaler? og hvordan fåes journalID? metoden skal nok ændres
            CaseInformationJournalListView.getItems().add(UIRun.getInstance().loadJournal(0));
            UIRun.getInstance().createLog(userReference, Integer.parseInt(""+caseID.charAt(1)+caseID.charAt(2)+caseID.charAt(3)+caseID.charAt(4)), "view");
        }
        else if(event.getSource()==CitizenBackButton){
            String tempID = userReference+"";
            if(tempID.charAt(0)=='1'){
                CitizenBorderPane.setVisible(false);
                LogInBorderPane.setVisible(true);
                UIRun.getInstance().createLog(userReference, userReference, "logout");
                userReference = 0;
            }
            else{
                CitizenBorderPane.setVisible(false);
                EmployeeBorderPane.setVisible(true);
            }
        }
    }
    @FXML
    private void employeeButtons(ActionEvent event){
        if(event.getSource()==EmployeeCreateCaseButton){
            EmployeeBorderPane.setVisible(false);
            CreateCaseStackPane.setVisible(true);
            //CreateCaseScrollPane1.setVisible(true);
        }
        else if(event.getSource()==EmployeeFindCitizenProfileButton){
            EmployeeBorderPane.setVisible(false);
            FindCitizenBorderPane.setVisible(true);
            
        }
        else if(event.getSource()==EmployeeLogOutButton){
            UIRun.getInstance().createLog(userReference, userReference, "logout");
            EmployeeBorderPane.setVisible(false);
            LogInBorderPane.setVisible(true);
            userReference = 0;
        }
    }
    @FXML
    private void goBack(ActionEvent event){
        if(event.getSource() == CreateEmployeeBackButton){
            CreateEmployeeBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
        }
        
        else if(event.getSource() == CreateCitizenBackButton){
            CreateCitizenBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
        }
        
        else if(event.getSource() == CreateCaseBackButton1){
            CreateCaseStackPane.setVisible(false);
            //CreateCaseScrollPane1.setVisible(false);
            EmployeeBorderPane.setVisible(true);
        }
        
        else if(event.getSource() == CaseInformationBackButton){
            CaseInformationBorderPane.setVisible(false);
            CitizenBorderPane.setVisible(true);
        }
        
        else if(event.getSource() == FindCitizenGoBackButton){
            FindCitizenBorderPane.setVisible(false);
            EmployeeBorderPane.setVisible(true);
        }
        else if(event.getSource() == DeleteUserBackButton){
            DeleteUserBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
        }
        else if (event.getSource() == ShowLogsBackButton) {
            ShowLogsBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
            ShowLogsListView.getItems().clear();
        }
        else if (event.getSource() == ChangeDepartmentBackButton){
            ChangeDepartmentBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
            ChangeDepartmentConfirmationLabel.setVisible(false);
            ChangeDepartmentWarningLabel.setVisible(false);
        }
    }
    
    @FXML
    private void LogIn(ActionEvent event){
        String userID = LogInUserIDTextField.getText();
        String password = LogInPasswordField.getText();
        LogInUserIDTextField.clear();
        LogInPasswordField.clear();
        
        if(UIRun.getInstance().validateLogin(Integer.parseInt(userID), password)){
            //Logind Employee
            if (userID.length() == 4 && userID.charAt(0) == '2' ){
                LogInBorderPane.setVisible(false);
                EmployeeBorderPane.setVisible(true);
                userReference = Integer.parseInt(userID);
                UIRun.getInstance().createLog(userReference, userReference, "login");
            }
            //CitizenUser log in check
            else if(userID.length() == 10){
                //String CPR
               LogInBorderPane.setVisible(false);
               CitizenBorderPane.setVisible(true);
               // UIRun.getInstance().loadCitizenProfile();
               String[] citizenProfile = UIRun.getInstance().findCitizenProfile(userID).split(";");
               String name = citizenProfile[0];
               String email = citizenProfile[1];
               String CPRNumber = citizenProfile[2];
               CitizenCPRUnfilledLabel.setText(CPRNumber);
               CitizenNameUnfilledLabel.setText(name);
               CitizenEmailUnfilledLabel.setText(email);
               CitizenListView.getItems().clear();
               CitizenListView.getItems().addAll(UIRun.getInstance().showCaseOverviewForCitizen(CPRNumber).split("\n"));
               
               String[]getUserID = UIRun.getInstance().loadCitizenUser(CPRNumber).split(";");
               userReference = Integer.parseInt(getUserID[1]);
               UIRun.getInstance().createLog(userReference, userReference, "login");
               
               
            }
            //Logind Admin
            else if (userID.length() == 4 && userID.charAt(0) == '5') {
                LogInBorderPane.setVisible(false);
                AdminFrontPageBorderPane.setVisible(true);
                userReference = Integer.parseInt(userID);
                UIRun.getInstance().createLog(userReference, userReference, "login");
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
            String[] infoArray = UIRun.getInstance().createEmployee(name, Zipcode, Email, Department, Phonenumber);
            CreateEmployeePasswordLabel.setText(infoArray[0]);
            UIRun.getInstance().createLog(userReference, Integer.parseInt(infoArray[1]), "create");
        }
    }
    @FXML
    private void createCitizenUser(ActionEvent event){
        String CPR = CreateCitizenCPRTextField.getText();
        
        if (CPR.isEmpty()) {
            CreateCitizenWarningLabel.setText("Indtast CPR");
            CreateCitizenWarningLabel.setVisible(true);
            CreateCitizenPasswordLabel.setVisible(false);
            
        }
        else if (CPR.length() == 10){
            String[] infoArray = UIRun.getInstance().createCitizenUser(CPR);
            CreateCitizenPasswordLabel.setText(infoArray[0]);
            CreateCitizenPasswordLabel.setVisible(true);
            CreateCitizenWarningLabel.setVisible(false);
            UIRun.getInstance().createLog(userReference, Integer.parseInt(infoArray[1]), "create");
        }
        else if (CPR.length() != 10) {
            CreateCitizenWarningLabel.setText("Indtast CPR med 10 tegn");
            
        }
        
        
    }
    //Ikke done metode
    @FXML
    private void createCase(ActionEvent event){
        String caseDesc = CreateCaseCaseDescTextArea1.getText();
        String employeeID = CreateCaseEmployeeIDTextField1.getText();
        String citizenProfile = CreateCaseCPRTextField1.getText();
        CreateCaseCaseDescTextArea1.clear();
        CreateCaseEmployeeIDTextField1.clear();
        CreateCaseCPRTextField1.clear();
        
        
           if (caseDesc.isEmpty() || employeeID.isEmpty()|| citizenProfile.isEmpty()) {
               CreateCaseCaseCreatedPopupLabel.setText("Udfyld venligst alle felter");
               CreateCaseCaseCreatedPopupPane.setVisible(true);
            }
           else if (citizenProfile.length() != 10) {
                CreateCaseCaseCreatedPopupLabel.setText("CPR skal være 10 langt");
                CreateCaseCaseCreatedPopupPane.setVisible(true);
        }
           else if (UIRun.getInstance().loadEmployee(Integer.parseInt(employeeID)) == null) {
               CreateCaseCaseCreatedPopupLabel.setText("Employee findes ikke i databasen");
               CreateCaseCaseCreatedPopupPane.setVisible(true);
            
        }
           else if (UIRun.getInstance().loadCitizenProfile(citizenProfile) == null) {
            CreateCaseCaseCreatedPopupLabel.setText("CPR findes ikke i databasen");
               CreateCaseCaseCreatedPopupPane.setVisible(true);
               
        }
           else {
               String caseId = UIRun.getInstance().createCase(caseDesc, citizenProfile, Integer.parseInt(employeeID));
               UIRun.getInstance().createLog(userReference, Integer.parseInt(caseId), "create");
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
    @FXML
    private void deleteUser(ActionEvent event){
        if (event.getSource() == DeleteUserDeleteUserButton) {
            DeleteUserGridPane.setVisible(true);
        }
        if (event.getSource() == DeleteUserConfirmButton) {
            DeleteUserGridPane.setVisible(false);
            
        }
    
    }
    @FXML
    private void findCitizen(ActionEvent event){
        String CPR = ""; 
        CPR = FindCitizenWriteCPRTextField.getText();
        FindCitizenWriteCPRTextField.clear();
        if (CPR.length() == 0) {
            FindCitizenCPRNonexistentWarningLabel.setText("Vær venlig at indtast CPR");
            FindCitizenCPRNonexistentWarningLabel.setVisible(true);
        }
        
        else if (CPR.length() != 10){
            FindCitizenCPRNonexistentWarningLabel.setText("CPR skal være 10 tal langt");
            FindCitizenCPRNonexistentWarningLabel.setVisible(true);
        
        }
        else{
            FindCitizenCPRNonexistentWarningLabel.setVisible(false);
            FindCitizenBorderPane.setVisible(false);
            String[] citizenProfile = UIRun.getInstance().findCitizenProfile(CPR).split(";");
            String name = citizenProfile[1];
            String email = citizenProfile[2];
            CitizenBorderPane.setVisible(true);
            
            CitizenCPRUnfilledLabel.setText(CPR);
            CitizenNameUnfilledLabel.setText(name);
            CitizenEmailUnfilledLabel.setText(email);
            CitizenListView.getItems().clear();
            CitizenListView.getItems().addAll(UIRun.getInstance().showCaseOverviewForCitizen(CPR).split("\n"));
            String[] getUserID = UIRun.getInstance().loadCitizenUser(CPR).split(";");
            UIRun.getInstance().createLog(userReference, Integer.parseInt(getUserID[1]), "view");
            
        }
    
    }
    @FXML
    private void showLogs(ActionEvent event) {
        String logID = ShowLogIDTextField.getText();
        ShowLogIDTextField.clear();
        if (logID.length() == 0) {
            ShowLogsWarningLabel.setText("Indtast ID");
            ShowLogsWarningLabel.setVisible(true);
        }
        else if (UIRun.getInstance().getLogs(Integer.parseInt(logID)) == null) {
            ShowLogsWarningLabel.setText("Der er ingen logs med dette ID");
            ShowLogsWarningLabel.setVisible(true);
        }
        else {
        ShowLogsListView.getItems().clear();
        ShowLogsListView.getItems().addAll(UIRun.getInstance().getLogs(Integer.parseInt(logID)).split("\n"));
        ShowLogsWarningLabel.setVisible(false);
        UIRun.getInstance().createLog(userReference, Integer.parseInt(logID), "showlogs");
        }
    }
    @FXML
    private void changeDepartment(ActionEvent event){
        String userID = ChangeDepartmentUserIDTextField.getText();
        String department = ChangeDepartmentChoiceBox.getSelectionModel().getSelectedItem();
        
        if (UIRun.getInstance().loadEmployee(Integer.parseInt(userID)) == null) {
            ChangeDepartmentWarningLabel.setVisible(true);
        }
        else{
            UIRun.getInstance().changeDepartment(Integer.parseInt(userID), department);
            ChangeDepartmentConfirmationLabel.setVisible(true);
            UIRun.getInstance().createLog(userReference, Integer.parseInt(userID), "edit");
        }
    
    }
    
}

