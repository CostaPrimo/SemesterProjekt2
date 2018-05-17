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
public class UserDatabase {
    
    public UserDatabase(){
        
    }
    
    public String loadEmployee(int ID){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT * FROM Employee WHERE ID = ?");
            PStatement.setInt(1, ID);
            rs = PStatement.executeQuery();
            output += rs.getString(1) + ";";
            output += rs.getString(2) + ";";
            output += rs.getString(3) + ";";
            output += rs.getString(4) + ";";
            output += rs.getString(5) + ";";
            output += rs.getString(6) + ";";
            output += rs.getString(7) + ";";
            output+= "\n";
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        finally{
            try {
                st.close();
                rs.close();
            } catch (Exception e) {
            }
        }
        return output;
    }
    
     public String loadCitizenUsers(int ID){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT * FROM CitizenUser WHERE ID = ?");
            PStatement.setInt(1, ID);
            rs = PStatement.executeQuery();
            output += rs.getString(1) + ";";
            output += rs.getString(2) + ";";
            output += rs.getString(3) + ";";
            output+= "\n";
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        finally{
            try {
                st.close();
                rs.close();
            } catch (Exception e) {
            }
        }
        return output;
    }
    
    public void writeInfoToEmployee(int userID, String name, String zipCode, String email, String department, String phoneNumber, String password){
        
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO Employee VALUES (?, ?, ?, ?, ?, ?, ?)");
            PStatement.setInt(1, userID);
            PStatement.setString(2, name);
            PStatement.setString(3, zipCode);
            PStatement.setString(4, email);
            PStatement.setString(5, department);
            PStatement.setString(6, phoneNumber);
            PStatement.setString(7, password);
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
    
    public void writeInfoToCitizenUser(String CPRNumber, String password, int userID){
        
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO CitizenUser VALUES (?, ?, ?)");
            PStatement.setString(1, CPRNumber);
            PStatement.setString(2, password);
            PStatement.setInt(3, userID);
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
    
    public void deleteCitizenUser(String CPRNumber, String password){
        
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("DELETE FROM CitizenUser VALUES (?, ?)");
            PStatement.setString(1, CPRNumber);
            PStatement.setString(2, password);
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
    
    public void deleteEmployee(int userID, String name, String zipCode, String email, String department, String phoneNumber, String password){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("DELETE FROM Employee VALUES (?, ?, ?, ?, ?, ?, ?)");
            PStatement.setInt(1, userID);
            PStatement.setString(2, name);
            PStatement.setString(3, zipCode);
            PStatement.setString(4, email);
            PStatement.setString(5, department);
            PStatement.setString(6, phoneNumber);
            PStatement.setString(7, password);
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
    

    
    
    private Statement OpenUDConnection(){
        
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
    
    public static void main(String[] args) {
        
    }
    
}
