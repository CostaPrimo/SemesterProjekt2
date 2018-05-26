package sensafe.udred.persistance;

import java.sql.*;
/**
 *
 * @author Jeppe Enevold
 */
public class LogDatabase {
    
    public LogDatabase(){
    }
    
    public void writeInfoToLD(Timestamp date, int actorID, int targetID, String action){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenLDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO LogActivity VALUES (?, ?, ?, ?)");
            PStatement.setTimestamp(1, date);
            PStatement.setInt(2, actorID);
            PStatement.setInt(3, targetID);
            PStatement.setString(4, action);
            rs = PStatement.executeQuery();
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (Exception e) {
            }
        }
    }
    public String getLogs(int ID){
        Statement st = null;
        ResultSet rs = null;
        String output ="";
        try {
            st = OpenLDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT DISTINCT * FROM LogActivity WHERE actorID = ? OR targetID = ?");
            PStatement.setInt(1, ID);
            PStatement.setInt(2, ID);
            rs = PStatement.executeQuery();
            while (rs.next()) {
                output += rs.getString(1) + ";";
                output += rs.getString(2) + ";";
                output += rs.getString(3) + ";";
                output += rs.getString(4) + ";";
                output += "\n";
            }
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        finally{
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (Exception e) {
            }
        }
        return output;
    }
    
    public void deleteLog(){
        
    }
    
    private Statement OpenLDConnection(){
        
        try {
            Class.forName("org.postgresql.Driver");
        } 
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }

        String url = "jdbc:postgresql://horton.elephantsql.com:5432/cremkbgt";
        String username = "cremkbgt";
        String password = "kXnelPrVsQ6xV0EKEb54yVlJgyc0JQYZ";

        Statement st = null;

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            st = db.createStatement();
        } 
        catch (Exception e){
            System.out.println(e);
        }
        return st;
    }
}
