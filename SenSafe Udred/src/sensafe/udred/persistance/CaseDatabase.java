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
    
    public String loadCaseTable(int ID){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT * FROM CaseTable WHERE CaseID = ?");
            PStatement.setInt(1, ID);
            rs = PStatement.executeQuery();
            while(rs.next()){
            output += rs.getString(1) + ";";
            output += rs.getString(2) + ";";
            output += rs.getString(3) + ";";
            output += rs.getString(4) + ";";
            output+= "\n";
            }
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
    
    public String loadCitizenProfile(String CPRNumber){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT * FROM CitizenProfile WHERE CPRNumber = ?");
            PStatement.setString(1, CPRNumber);
            rs = PStatement.executeQuery();
            rs.next();
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
    
    public String loadJournal(){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT * FROM Journal");
            rs = PStatement.executeQuery();
            while(rs.next()){
            output += rs.getString(1) + ";";
            output += rs.getString(2) + ";";
            output += rs.getString(3) + ";";
            output += rs.getString(4) + ";";
            output+= "\n";
            }
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
    
    public void writeInfoToCitizenProfile(String name, String email, String CPRNumber){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO CitizenProfile VALUES (?, ?, ?)");
            PStatement.setString(1, name);
            PStatement.setString(2, email);
            PStatement.setString(3, CPRNumber);
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
    
    public void writeInfoToCaseTable(String caseDescription, String citizenProfile, int caseResponsible){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO CaseTable VALUES (?, ?, ?)");
            PStatement.setString(1, caseDescription);
            PStatement.setString(2, citizenProfile);
            PStatement.setInt(3, caseResponsible);
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
    
    public void writeInfoToJournal(int journalID, String resume, int writer, int relatedCase){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO Journal VALUES (?, ?, ?, ?)");
            PStatement.setInt(1, journalID);
            PStatement.setString(2, resume);
            PStatement.setInt(3, writer);
            PStatement.setInt(4, relatedCase);
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
    
    public void deleteCase(int caseID){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("DELETE FROM CaseTable WHERE caseID = ?");
            PStatement.setInt(1, caseID);
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
    
    public void deleteJournal(int journalID){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("DELETE FROM Journal WHERE JournalID = ?");
            PStatement.setInt(1, journalID);
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
    
    public void findCitizenProfile(String CPRNumber){
        
    }
    
    
    
    
    
    private Statement OpenCDConnection(){
        
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
        CaseDatabase cd = new CaseDatabase();
        //cd.writeInfoToCaseTable(2001, "caseDescription", "CPRNumber", 6969);
        cd.writeInfoToCaseTable("TestDescription", "KIM", 6969);
    }
    
}
