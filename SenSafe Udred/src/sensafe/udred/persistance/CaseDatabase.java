/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.persistance;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Jeppe Enevold
 */
public class CaseDatabase {
    
    public CaseDatabase(){
        
    }
    
    public void writeInfoToCD(){
        
    }
    
    public void deleteCase(int caseID){
        
    }
    
    public void findCitizenProfile(String CPRNumber){
        
    }
    
    
    
    
    
    private void OpenCDConnection(){
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }


        String url = "jdbc:postgresql://horton.elephantsql.com:5432/cremkbgt";
        String username = "cremkbgt";
        String password = "kXnelPrVsQ6xV0EKEb54yVlJgyc0JQYZ";


        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            Scanner sc = new Scanner(System.in);
            String i = sc.nextLine();
            ResultSet rs = null;
            
            
            st.close();
            rs.close();
            
        } catch (Exception e){
            System.out.println(e);
        }
        
    }

    
}
