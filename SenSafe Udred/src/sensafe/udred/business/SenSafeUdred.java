/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jeppe Enevold
 */
public class SenSafeUdred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Test");
        UserDatabase database = new UserDatabase("test", "userDatabase.txt");
        System.out.println(database.getUserCollection());
        database.loadUsers();
        System.out.println(database.getUserCollection());
        CaseDatabase caseDatabase = new CaseDatabase("caseTest", "caseDatabase.txt");
        Scanner scanner = new Scanner(System.in);
        boolean boo = true;
        
        //Lav login?
        
        System.out.println("Tast 1 for at oprette en ny bruger");
        System.out.println("Tast 2 for at slette en bruger");
        System.out.println("Tast 3 for at se allerede oprettet brugere");
        System.out.println("Tast 4 for at oprette en ny sag");
        System.out.println("Tast 5 for at se relaterede sager");
        System.out.println("Tast 6 for at afslutte programmet");
        
        while(boo == true){
            int input = scanner.nextInt();
            
            switch(input){
                case 1: 
                    System.out.println("indtast brugernavn");
                    String username = scanner.next();
                    System.out.println("Indtast navn");
                    String name = scanner.next();
                    System.out.println("Intast postnummer");
                    int zipcode = scanner.nextInt();
                    System.out.println("Intast email");
                    String email = scanner.next();
                    System.out.println("Indtast afdeling");
                    String department = scanner.next();
                    System.out.println("Intast telefonnummer");
                    String phoneNumber = scanner.next();
//                    System.out.println(username + name + zipcode + email + department + phoneNumber);
                    database.userCreate(username, name, zipcode, email, department, phoneNumber);
                    break;
                case 2: 
                    System.out.println("Indtast userID");
                    int userID = scanner.nextInt();
                    database.userDelete(userID);
                    break;
                case 3: 
                    System.out.println("Ikke indsat endnu");
                    break;
                    
                // Case 4 mangler en måde hvorpå man kan indtaste en employee og citizenprofile              
                case 4:
                    System.out.println("Indtast case ID");
                    int caseID = scanner.nextInt();
                    System.out.println("Indtast employee ID");
                    userID = scanner.nextInt();
                    Employee employee = database.lookupUser(userID);
                    System.out.println("Intast citizens CPR");
                    String cpr = scanner.next();
                    CitizenProfile citizenProfile = caseDatabase.findCitizenProfile(cpr);
                    System.out.println("Intast caseDesc");
                    String caseDesc = scanner.next();
                    System.out.println("Indtast relatives");
                    String relative = scanner.next();
                    System.out.println("Intast medicine");
                    String medicine = scanner.next();
                    System.out.println("Du har indtastet: " + caseID + ", " + employee + ", " + citizenProfile + ", " + caseDesc + ", " + relative + ", " + medicine);
                    caseDatabase.caseCreate(caseID, employee, citizenProfile, caseDesc, relative, medicine);
                    break;

                case 5: 
                    System.out.println("Indtast det CPR-nummer du vil søge på");
                    String CPRNumber = scanner.next();
                    caseDatabase.showCaseOverview(CPRNumber);
                    break;
                case 6: 
                    System.out.println("Program exiting switch-loop.");
                    boo = false;
                default:
                    System.out.println("Invalid input");
               
                
            }
        }
//        
//        File file = new File("Test");
//        UserDatabase database = new UserDatabase("test", "userDatabase.txt");
//        database.userCreate("Kim", "1923918");
//        database.userCreate("Trox", "hamme", 5000, "kim@kim.dk", "Handkkap", "2323232");
//        database.userChangeDepartment(1002, "BARBIE");
//        database.removeUserInfoFromFile(1001);
//        
    }
        
        
}
    
    

