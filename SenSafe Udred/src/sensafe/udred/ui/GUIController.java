/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.ui;

import java.net.URL;
import java.util.Date;
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
    private VBox CaseInformationMiddleVBox;
    @FXML
    private Label CaseInformationCaseIdUnfilledLabel;
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

    @FXML
    private BorderPane CreateJournalBorderPane;
    @FXML
    private Button CreateJournalBackButton;
    @FXML
    private TextField CreateJournalUserIDTextField;
    @FXML
    private Button CreateJournalCreateJournalButton;
    @FXML
    private Button CaseInformationOpenJournalButton;
    @FXML
    private Button CaseInformationCreateJournalButton;
    
    
    
    @FXML
    private TextArea CreateJournalResumeTextArea;
    @FXML
    private BorderPane ShowJournalBorderPane;
    @FXML
    private Button ShowJournalBackButton;
    @FXML
    private Label ShowJournalJournalIDLabel;
    @FXML
    private Label ShowJournalWriterLabel;
    @FXML
    private Label ShowJournalCaseIDLabel;
    @FXML
    private TextArea ShowJournalDescriptionTextArea;
    @FXML
    private Label CaseInformationJournalWarningLabel;
    @FXML
    private Label CreateJournalSuccesPopUpLabel;
    @FXML
    private Label CreateJournalWarningLabel;
    @FXML
    private ChoiceBox<String> CreateEmployeeDepartmentChoiceBox;
    @FXML
    private Label LogInWarningLabel;
    
    private int userReference;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ChangeDepartmentChoiceBox.getItems().addAll("Handicap Afdelingen", "Børne- og Familieafdelingen", "Socialafdelingen", "Sundheds- og Omsorgsafdelingen", "Ikke Aktiv");
        CreateEmployeeDepartmentChoiceBox.getItems().addAll("Handicap Afdelingen", "Børne- og Familieafdelingen", "Socialafdelingen", "Sundheds- og Omsorgsafdelingen", "Ikke Aktiv");
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
       
        String caseIDTest = caseOverview[0];
        String[] caseIDBeforeSplit = caseIDTest.split("\\(");
        String caseID = caseIDBeforeSplit[1];
        String caseDescription = caseOverview[1];
        String citizenProfile = caseOverview[2];
        String employee = caseOverview[3];
        String[] employee1 = employee.split("\\)");
        
            CaseInformationCaseIdUnfilledLabel.setText(caseID);
            CaseInformationCaseDescriptionTextArea.setText(caseDescription);
            CaseInformationEmployeeUnfilledLabel.setText(employee1[0]);
            CaseInformationCitizenProfileUnfilledLabel.setText(citizenProfile);
            
            CaseInformationJournalListView.getItems().addAll(UIRun.getInstance().loadallJournal(Integer.parseInt(caseID)).split("\n"));
            
            UIRun.getInstance().createLog(userReference, Integer.parseInt(caseID), "view");
        }
        //Her er metoderne der bliver brugt når journaler bliver genereret
        else if(event.getSource() == CaseInformationCreateJournalButton){
        CaseInformationBorderPane.setVisible(false);
        CreateJournalBorderPane.setVisible(true);        
        }
        //her oprettes journal
        else if (event.getSource() == CreateJournalCreateJournalButton) {
            CreateJournalWarningLabel.setVisible(false);
           String journalDescription = CreateJournalResumeTextArea.getText();
           int writer = userReference; 
           String caseID = CaseInformationCaseIdUnfilledLabel.getText();
           String[] caseIDtest = caseID.split("\\(");
            System.out.println(caseIDtest[0]);
           String realcaseID = caseIDtest[0];
            System.out.println(realcaseID);
            if (journalDescription.isEmpty()  || caseID.isEmpty()) {
                
                CreateJournalWarningLabel.setText("Udfyld alle felter");
                CreateJournalWarningLabel.setVisible(true);
            }
            if (journalDescription.trim().isEmpty()){
                CreateJournalWarningLabel.setText("Udfyld alle felter");
                CreateJournalWarningLabel.setVisible(true);
            
            }
            
            else {
                int tempID = Integer.parseInt(UIRun.getInstance().createJournal(journalDescription, writer, Integer.parseInt(realcaseID)));
                UIRun.getInstance().createLog(userReference, tempID, "create"); 
                CreateJournalResumeTextArea.setText("");
                CreateJournalUserIDTextField.setText("");
                CreateJournalSuccesPopUpLabel.setVisible(true);
                CreateJournalWarningLabel.setVisible(false);
            }
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
            CreateCaseCaseDescTextArea1.clear();
            CreateCaseEmployeeIDTextField1.clear();
            CreateCaseCPRTextField1.clear();
            
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
            CaseInformationJournalListView.getItems().clear();
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
        else if (event.getSource() == CreateJournalBackButton){
        CreateJournalBorderPane.setVisible(false);
        CaseInformationBorderPane.setVisible(true);
        CreateJournalSuccesPopUpLabel.setVisible(false);
        }
        else if (event.getSource() == ShowJournalBackButton) {
            ShowJournalBorderPane.setVisible(false);
            CaseInformationBorderPane.setVisible(true);
            
            ShowJournalCaseIDLabel.setText(" ");
            ShowJournalDescriptionTextArea.setText(" ");
            ShowJournalJournalIDLabel.setText(" ");
            ShowJournalWriterLabel.setText(" ");
            
        }
    }
    
    @FXML
    private void LogIn(ActionEvent event){
        String userID = LogInUserIDTextField.getText();
        String password = LogInPasswordField.getText();
        LogInUserIDTextField.clear();
        LogInPasswordField.clear();
        
        
        
        if (userID.isEmpty() || password.isEmpty()){
                LogInWarningLabel.setText("Indtast email/BrugerID");
                LogInWarningLabel.setVisible(true);
            }
        if (userID.trim().isEmpty() || password.trim().isEmpty()){
                LogInWarningLabel.setText("Indtast email/BrugerID uden mellemrum");
                LogInWarningLabel.setVisible(true);
            }
        else if(!userID.matches("[0-9]+") || userID.length() != 4 && userID.length() != 10){
                LogInWarningLabel.setText("Indtast brugerID med tal, og 4 tegn langt");
                LogInWarningLabel.setVisible(true);
        
        }
        
        else if(UIRun.getInstance().validateLogin(Long.parseLong(userID), password)){
            LogInWarningLabel.setVisible(false);
            
            
            //Logind Employee
            if (userID.length() == 4 && userID.charAt(0) == '2' ){
                LogInBorderPane.setVisible(false);
                EmployeeBorderPane.setVisible(true);
                userReference = Integer.parseInt(userID);
                UIRun.getInstance().createLog(userReference, userReference, "login");
                CaseInformationCreateJournalButton.setVisible(true);
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
               CaseInformationCreateJournalButton.setVisible(false);
               
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
        String Department = CreateEmployeeDepartmentChoiceBox.getSelectionModel().getSelectedItem();
        String Phonenumber = CreateEmployeePhoneNumberTextField.getText();
        
        if(name.isEmpty() || Email.isEmpty() || Zipcode.isEmpty() || Department.isEmpty() || Phonenumber.isEmpty()){
            CreateEmployeeWarningLabel.setText("Udfyld alle felter");
            CreateEmployeeWarningLabel.setVisible(true);
            CreateEmployeePasswordLabel.setText("");
            
        }
        else if(name.trim().isEmpty() || Email.trim().isEmpty()){
            CreateEmployeeWarningLabel.setText("Udfyld navn eller/og email");
            CreateEmployeeWarningLabel.setVisible(true);
            CreateEmployeePasswordLabel.setText("");
        }
        else if(!Zipcode.matches("[0-9]+") || Zipcode.length() != 4){
        CreateEmployeeWarningLabel.setVisible(true);
        CreateEmployeeWarningLabel.setText("Zipcode skal være lavet af tal, og 4 tal langt");
        
        }
        else if (!Phonenumber.matches("[0-9]+") || Phonenumber.length() != 8) {
            CreateEmployeeWarningLabel.setVisible(true);
            CreateEmployeeWarningLabel.setText("Telefon nummer skal være lavet af tal, og 8 tal langt");
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
        else if(!CPR.matches("[0-9]+")){
        CreateCitizenWarningLabel.setText( "Skriv CPR kun med tal");
        CreateCitizenWarningLabel.setVisible(true);
        CreateCitizenPasswordLabel.setVisible(false);
        }
        else if (CPR.length() != 10) {
            CreateCitizenWarningLabel.setText("Indtast CPR med 10 tegn");
            CreateCitizenWarningLabel.setVisible(true);
        }
        else if (CPR.length() == 10){
            String[] infoArray = UIRun.getInstance().createCitizenUser(CPR);
            CreateCitizenPasswordLabel.setText(infoArray[0]);
            CreateCitizenPasswordLabel.setVisible(true);
            CreateCitizenWarningLabel.setVisible(false);
            UIRun.getInstance().createLog(userReference, Integer.parseInt(infoArray[1]), "create");
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
           else if (citizenProfile.length() != 10) {
                CreateCaseCaseCreatedPopupLabel.setText("CPR skal være 10 tal langt");
                CreateCaseCaseCreatedPopupPane.setVisible(true);
        }
           else if (!employeeID.matches("[0-9]+")){
               CreateCaseCaseCreatedPopupLabel.setText("BrugerID skal være lavet af tal");
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
        if (!CreateCaseCaseCreatedPopupLabel.getText().equalsIgnoreCase("Sagen er oprettet")) {
         CreateCaseCaseCreatedPopupPane.setVisible(false);
        }
        else{
        CreateCaseCaseCreatedPopupPane.setVisible(false);
        CreateCaseScrollPane1.setVisible(false);
        CreateCaseStackPane.setVisible(false);
        EmployeeBorderPane.setVisible(true);
        }
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
        else if (!CPR.matches("[0-9]+")){
            FindCitizenCPRNonexistentWarningLabel.setText("CPR skal være lavet af tal");
            FindCitizenCPRNonexistentWarningLabel.setVisible(true);
        
        }
        else if(UIRun.getInstance().findCitizenProfile(CPR) == null){
            FindCitizenCPRNonexistentWarningLabel.setText("CPR findes ikke i databasen");
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
        else if (!logID.matches("[0-9]+")) {
            ShowLogsWarningLabel.setText("ID skal være med tal");
            ShowLogsWarningLabel.setVisible(true);
        }
        else if (logID.length() != 4) {
            ShowLogsWarningLabel.setText("ID skal være 4 tal langt");
            ShowLogsWarningLabel.setVisible(true);
        }
        else if (UIRun.getInstance().getLogs(Integer.parseInt(logID)).equalsIgnoreCase("")) {
            
            ShowLogsWarningLabel.setText("Der er ingen logs med dette ID");
            ShowLogsWarningLabel.setVisible(true);
        }
        else {
            String ULU = UIRun.getInstance().getLogs(Integer.parseInt(logID));
            System.out.println(ULU);
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
        
        
        if(!userID.matches("[0-9]+")){
            ChangeDepartmentWarningLabel.setText("Indtast brugerID med tal");
            ChangeDepartmentWarningLabel.setVisible(true);
        
        }
        
        else if (userID.length() != 4) {
            ChangeDepartmentWarningLabel.setText("Indtast brugerID med 4 tal");
            ChangeDepartmentWarningLabel.setVisible(true);
        }
        else if (UIRun.getInstance().loadEmployee(Integer.parseInt(userID)) == null) {
            ChangeDepartmentWarningLabel.setText("BrugerID findes ikke i databasen");
            ChangeDepartmentWarningLabel.setVisible(true);
        }
        else if (ChangeDepartmentChoiceBox.getSelectionModel().getSelectedItem() == null) {
            ChangeDepartmentWarningLabel.setVisible(true);
            ChangeDepartmentWarningLabel.setText("Vælg afdeling");
        }
        
        else{
            UIRun.getInstance().changeDepartment(Integer.parseInt(userID), department);
            ChangeDepartmentConfirmationLabel.setVisible(true);
            UIRun.getInstance().createLog(userReference, Integer.parseInt(userID), "edit");
            ChangeDepartmentWarningLabel.setVisible(false);
        }
    
    }
    
    @FXML
    private void showJournal(ActionEvent event){
        
        
        
        if (event.getSource() == CaseInformationOpenJournalButton) {
            if (CaseInformationJournalListView.getSelectionModel().getSelectedItem() == null) {
               CaseInformationJournalWarningLabel.setText("valgte journal er tom");
            }
            else if (CaseInformationJournalListView.getSelectionModel().getSelectedItem().isEmpty()) {
                CaseInformationJournalWarningLabel.setText("Vælg Venligt en journal");
            }
            else{
            String[] JournalOverview = CaseInformationJournalListView.getSelectionModel().getSelectedItem().split(";");    
            CaseInformationBorderPane.setVisible(false);
            ShowJournalBorderPane.setVisible(true);
            ShowJournalJournalIDLabel.setText(JournalOverview[0]);
            ShowJournalWriterLabel.setText(JournalOverview[2]);
            ShowJournalCaseIDLabel.setText(JournalOverview[3]);
            ShowJournalDescriptionTextArea.setText(JournalOverview[1]);
            CaseInformationJournalWarningLabel.setText("");
            UIRun.getInstance().createLog(userReference, Integer.parseInt(JournalOverview[0]), "view");
            
            }
        
        }
    }
//    @FXML
//    private void createJournal(ActionEvent event){
//        int caseID = UIRun.getInstance().
//        
//        if (event.getSource() == CaseInformationCreateJournalButton) {
//            CaseInformationBorderPane.setVisible(false);
//            CreateJournalBorderPane.setVisible(true);
//            }
//        
//        
//        else{
//            UIRun.getInstance().createJournal(resume, userReference, userReference);
//        }
//        
//        
//    }
}

