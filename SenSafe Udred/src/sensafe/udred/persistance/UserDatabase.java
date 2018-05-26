/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.persistance;

import java.security.Key;
import java.sql.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

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
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT userid, name, zipcode, email, department, phonenumber FROM Employee WHERE userID = ?");
            PStatement.setInt(1, ID);
            rs = PStatement.executeQuery();
            rs.next();
            output += rs.getString(1) + ";";
            output += rs.getString(2) + ";";
            output += rs.getString(3) + ";";
            output += rs.getString(4) + ";";
            output += rs.getString(5) + ";";
            output += rs.getString(6) + ";";
            //output += rs.getString(7) + ";";
            output+= "\n";
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (Exception e) {
            }
        }
        return output;
    }
    
    public String loadCitizenUsers(String CPR){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT cprnumber, userid FROM CitizenUser WHERE CPRNumber = ?");
            PStatement.setString(1, CPR);
            rs = PStatement.executeQuery();
            rs.next();
            output += rs.getString(1) + ";";
            output += rs.getString(2) + ";";
            //output += rs.getString(3) + ";";
            output+= "\n";
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (SQLException e) {
            }
        }
        return output;
    }
    
    public String loadAllCitizenUsers(){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT cprnumber, userid FROM CitizenUser");
            rs = PStatement.executeQuery();
//            rs.next();
            while(rs.next()){
            output += rs.getString(2) + "; ";
            output += rs.getString(1) + "; ";
           // output += rs.getString(3) + ";";
            output+= "\n";
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (SQLException e) {
            }
        }
        return output;
    }
    
    public String loadAllEmployee(){
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT userid, name, zipcode, email, department, phonenumber FROM Employee");
            rs = PStatement.executeQuery();
//            rs.next();
            while (rs.next()){
            output += rs.getString(1) + "; ";
            output += rs.getString(2) + "; ";
            output += rs.getString(3) + "; ";
            output += rs.getString(4) + "; ";
            output += rs.getString(5) + "; ";
            output += rs.getString(6) + "; ";
            //output += rs.getString(7) + ";";
            output+= "\n";
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (SQLException e) {
            }
        }
        return output;
    }
    
    public String writeInfoToEmployee(String name, String zipCode, String email, String department, String phoneNumber, String password){
        String id = "";
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO Employee(name,zipcode,email,department,phonenumber,password) VALUES (?, ?, ?, ?, ?, ?)");
            PStatement.setString(1, name);
            PStatement.setString(2, zipCode);
            PStatement.setString(3, email);
            PStatement.setString(4, department);
            PStatement.setString(5, phoneNumber);
            password = encryptPassword(password).replaceAll("\u0000","");
            PStatement.setString(6, password);
            rs = PStatement.executeQuery();
        }
        catch (Exception e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (Exception e) {
            }
        }
        try{
            st = OpenUDConnection();
            PreparedStatement PStatement2 = st.getConnection().prepareStatement("SELECT MAX(userid) AS userID FROM Employee");
            rs = PStatement2.executeQuery();
            rs.next();
            id += rs.getString(1);
        }
        catch(Exception e){
        }
        finally{
            try{
                st.close();
                rs.close();
                st.getConnection().close();
            }
            catch(Exception e){
            }
        }
        return id;        
    }
    
    public String writeInfoToCitizenUser(String CPRNumber, String password){
        String id = "";
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO CitizenUser(CPRNumber,Password) VALUES (?, ?)");
            PStatement.setString(1, CPRNumber);
            password = encryptPassword(password).replaceAll("\u0000","");
            PStatement.setString(2, password);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (Exception e) {
            }
        }
        try{
            st = OpenUDConnection();
            PreparedStatement PStatement2 = st.getConnection().prepareStatement("SELECT MAX(userid) AS userID FROM citizenuser");
            rs = PStatement2.executeQuery();
            rs.next();
            id += rs.getString(1);
        }
        catch(Exception e){
        }
        finally{
            try{
                st.close();
                rs.close();
                st.getConnection().close();
            }
            catch(Exception e){
            }
        }
        return id;        
    }
    
    public void writeInfoToAdmin(int adminID, String password){ //Created for making the first admin. Pass is: adminPass
        
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO admin VALUES (?, ?)");
            PStatement.setInt(1, adminID);
            password = encryptPassword(password).replaceAll("\u0000","");
            PStatement.setString(2, password);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (SQLException e) {
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
                st.getConnection().close();
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
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close(); 
            } catch (SQLException e) {
            }
        }
    }
    
    public void changeDepartment(int userID, String newDepartment){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenUDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("UPDATE employee SET department = ? WHERE userid = ?");
            PStatement.setString(1, newDepartment);
            PStatement.setInt(2, userID);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.close();
                if(rs!=null){
                rs.close();
                }
                st.getConnection().close(); 
            } catch (SQLException e) {
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
            
            
            
        } catch (SQLException e){
            System.out.println(e);
        }
        
        return st;
        
    }
    
    private static String encryptPassword(String password){
            //SOURCE FROM https://stackoverflow.com/a/32583766/5274680 - Minor changes. Decrypt not used.
        try {
        String text = password;
        String key = "KimFraBirNiTru3N"; // 128 bit key
        // Create key and cipher
        Key aesKey = new SecretKeySpec(key.getBytes(),"AES");
        Cipher cipher = Cipher.getInstance("AES");
        // encrypt the text
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);
        byte[] encrypted = cipher.doFinal(text.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b: encrypted) {
            sb.append((char)b);
        }

        // the encrypted String
        String enc = sb.toString();
        System.out.println("encrypted:" + enc);
        
        return enc;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean validateLogin(int ID, String password){
        Statement st = null;
        ResultSet rs = null;
        boolean isCorrect = false;
        
        try {
            st = OpenUDConnection();
            if (Integer.toString(ID).length() == 4){
                PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT userid, password FROM employee WHERE userid = ? AND password = ? UNION SELECT adminID, password FROM admin WHERE adminID = ? AND password = ?");
                PStatement.setInt(1, ID);
                password = encryptPassword(password).replaceAll("\u0000", "");
                PStatement.setString(2, password);
                PStatement.setInt(3, ID);
                PStatement.setString(4, password);
                rs = PStatement.executeQuery();
                if(rs.next()){
                    isCorrect = true;
                }
            }
            else if (Integer.toString(ID).length() == 10){
                String CPRNumber = Integer.toString(ID);
                PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT CPRNumber, password FROM citizenuser WHERE CPRNumber = ? AND password = ?");
                PStatement.setString(1, CPRNumber);
                password = encryptPassword(password).replaceAll("\u0000", "");
                PStatement.setString(2, password);
                rs = PStatement.executeQuery();
                if(rs.next()){
                    isCorrect = true;
                }
            }
            else{
                
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        finally{
            try {
                st.close();
                rs.close();
                st.getConnection().close();
            } catch (SQLException e) {
            }
        }
        return isCorrect;
    }
    public static void main(String[] args) {
        UserDatabase ud = new UserDatabase();
        System.out.println(ud.writeInfoToEmployee("Jonh", "2000", "test@test.dk", "testDepartment", "21428416", "testword"));
                
    }
}
