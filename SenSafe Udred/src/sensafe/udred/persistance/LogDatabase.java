/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.persistance;

import java.sql.*;

/**
 *
 * @author Jeppe Enevold
 */
public class LogDatabase {
    
    public LogDatabase(){
        
    }
    
    public void writeInfoToLD(Date date, int actorID, int targetID, String action){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenLDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO LogActivity VALUES (?, ?, ?, ?)");
            PStatement.setDate(1, date);
            PStatement.setInt(2, actorID);
            PStatement.setInt(3, targetID);
            PStatement.setString(4, action);
            rs = PStatement.executeQuery();
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.close();
                rs.close();
            } catch (Exception e) {
            }
        }
    }
    
    public void deleteLog(){
        
    }
    
    private Statement OpenLDConnection(){
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }


        String url = "jdbc:postgresql://horton.elephantsql.com:5432/cremkbgt";
        String username = "cremkbgt";
        String password = "kXnelPrVsQ6xV0EKEb54yVlJgyc0JQYZ";

        Statement st = null;

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            st = db.createStatement();
            
            
            
        } catch (Exception e){
            System.out.println(e);
        }
        
        return st;
        
    }
    
}
