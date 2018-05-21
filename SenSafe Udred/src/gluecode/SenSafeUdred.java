/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        ICaseController caseController = new CaseController("temp","temp");
        ILogController logController = new LogController();
        IUserController userController = new UserController("temp","temp");
        
        business.injectData(persistance);
        business.injectCaseController(caseController);
        business.injectLogController(logController);
        business.injectUserController(userController);
        
        UI.injectBusiness(business);
        UI.startApplication(args);
        
        System.out.println(business.loadAllCitizenUsers() + business.loadAllEmployee());
        
//        business.createEmployee("Kim Christensen", "5000", "lul@email.dk", "Handikap Afdelingens", "42233223");
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
        
//        int currentUserID = 0;
//        Employee currentUser = null;
//        File file = new File("Test");
//        UserController database = new UserController("test", "userDatabase.txt");
//        System.out.println(database.getUserCollection());
//        database.loadUsers();
//        System.out.println(database.getUserCollection());
//        CaseController caseDatabase = new CaseController("caseTest", "caseDatabase.txt");
//        CitizenProfile test = new CitizenProfile("Kim", "kim@mail.dk", "23");
//        System.out.println(test);
//        caseDatabase.addTocitizenArray(test);
//        System.out.println(caseDatabase.findCitizenProfile("23"));
//        //Login section
//        
//        System.out.println("Welcome to SenSafe Udred, please enter your username and password to login\n");
//        Scanner loginScanner = new Scanner(System.in);
//        boolean loggingIn = true;
//        while(loggingIn){
//            int userID = loginScanner.nextInt();
//            String password = loginScanner.next();
//            boolean validLogin = database.validatePassword(userID, password);
//            if(validLogin){
//                currentUserID = userID;
//                currentUser = database.lookupUser(userID);
//                loggingIn = false;
//            }
//        }
//        
//        System.out.println("Welcome" + currentUser.getName());
//        Scanner scanner = new Scanner(System.in);
//        boolean boo = true;
//        
//        System.out.println("Tast 1 for at oprette en ny bruger");
//        System.out.println("Tast 2 for at slette en bruger");
//        System.out.println("Tast 3 for at se allerede oprettet brugere");
//        System.out.println("Tast 4 for at oprette en ny sag");
//        System.out.println("Tast 5 for at se relaterede sager");
//        System.out.println("Tast 6 for at se citizenprofile");
//        System.out.println("Tast 7 for at afslutte programmet");
//        
//        while(boo == true){
//            int input = scanner.nextInt();
//            
//            switch(input){
//                case 1: 
//                    System.out.println("Indtast navn");
//                    String name = scanner.next();
//                    System.out.println("Intast postnummer");
//                    int zipcode = scanner.nextInt();
//                    System.out.println("Intast email");
//                    String email = scanner.next();
//                    System.out.println("Indtast afdeling");
//                    String department = scanner.next();
//                    System.out.println("Intast telefonnummer");
//                    String phoneNumber = scanner.next();
//                    database.userCreate(name, zipcode, email, department, phoneNumber);
//                    break;
//                case 2: 
//                    System.out.println("Indtast userID");
//                    int userID = scanner.nextInt();
//                    database.userDelete(userID);
//                    break;
//                    
//                case 3: 
//                    System.out.println(database.getUserCollection());
//                    break;
//                    
//                case 4:
//                    System.out.println("Indtast case ID");
//                    int caseID = scanner.nextInt();
//                    System.out.println("Indtast employee ID");
//                    userID = scanner.nextInt();
//                    Employee employee = database.lookupUser(userID);
//                    System.out.println("Intast citizens CPR");
//                    String cpr = scanner.next();
//                    CitizenProfile citizenProfile = caseDatabase.findCitizenProfile(cpr);
//                    System.out.println("Intast caseDesc");
//                    String caseDesc = scanner.next();
//                    System.out.println("Indtast relatives");
//                    String relative = scanner.next();
//                    System.out.println("Intast medicine");
//                    String medicine = scanner.next();
//                    System.out.println("Du har indtastet: " + caseID + ", " + employee + ", " + citizenProfile + ", " + caseDesc + ", " + relative + ", " + medicine);
//                    caseDatabase.caseCreate(caseID, employee, citizenProfile, caseDesc, relative, medicine);
//                    break;
//                    
//                case 5: 
//                    System.out.println("Indtast det CPR-nummer du vil søge på");
//                    String CPRNumber = scanner.next();
//                    caseDatabase.showCaseOverview(CPRNumber);
//                    break;
//                    
//                case 6:
//                    System.out.println("Please enter the CPR number for the citizen you want to lookup");
//                    boolean isOnProfile = true;
//                    Scanner scannerCitizenProfile = new Scanner(System.in);
//                    String CPRCitizen = scanner.next();
//                    CitizenProfile tempCitizen;
//                    tempCitizen = caseDatabase.findCitizenProfile(CPRCitizen);
//                    int choice;
//                    while(isOnProfile){
//                        System.out.println("Press 1 to get name of this citizen");
//                        System.out.println("Press 2 to get cprnumber of this citizen");
//                        System.out.println("Press 3 to show caseoverview for this citizen");
//                        System.out.println("Press 4 to show a specific case for this user");
//                        choice = scannerCitizenProfile.nextInt();
//                        switch(choice){
//                            case 1:
//                                System.out.println(tempCitizen.getName());
//                                break;
//                                
//                            case 2:
//                                System.out.println(tempCitizen.getCPR());
//                                break;
//                                
//                            case 3:
//                                System.out.println(caseDatabase.showCaseOverview(tempCitizen.getCPR()));
//                                break;
//                            
//                            default:
//                               isOnProfile = false;
//                               break;
//                        } 
//                    }
//                case 7: 
//                    System.out.println("Program exiting switch-loop.");
//                    boo = false;
//                default:
//                    System.out.println("Invalid input");
//            }
//        }      
    }
}