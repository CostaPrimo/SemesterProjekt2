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
    private TextField LogInUsernameTextField;
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
    @FXML
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
    private ScrollPane CreateCaseScrollPane;
    @FXML
    private BorderPane CreateCaseBorderPane;
    @FXML
    private Button CreateCaseBackButton;
    @FXML
    private BorderPane CreateCaseInnerBorderPane;

    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   @FXML
    private void testfunction(){
       AdminFrontPageBorderPane.setVisible(false);
       CreateEmployeeBorderPane.setVisible(true);
       
    }
    @FXML
    private void BackToAdminFrontPageFromCreateEmployee(ActionEvent event){
        if(event.getSource()== CreateEmployeeBackButton){
            CreateEmployeeBorderPane.setVisible(false);
            AdminFrontPageBorderPane.setVisible(true);
            UIRun.getInstance().createLog(1100, 1220, "create");
        }
    }
}

