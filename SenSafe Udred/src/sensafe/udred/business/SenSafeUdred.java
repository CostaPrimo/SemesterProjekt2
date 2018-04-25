/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.io.File;

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
        database.userCreate("Kim", "1923918");
        database.userCreate("Trox", "hamme", 5000, "kim@kim.dk", "Handkkap", "2323232");
        database.userChangeDepartment(1002, "BARBIE");
        database.removeUserInfoFromFile(1001);
    }
        
        
}
    
    

