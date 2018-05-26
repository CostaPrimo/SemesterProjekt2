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

    public CaseDatabase() {

    }

    public String loadCaseTable(int ID) {
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT * FROM CaseTable WHERE CaseID = ?");
            PStatement.setInt(1, ID);
            rs = PStatement.executeQuery();
            while (rs.next()) {
                output += rs.getString(1) + ";";
                output += rs.getString(2) + ";";
                output += rs.getString(3) + ";";
                output += rs.getString(4) + ";";
                output += "\n";
            }
            if (output.isEmpty()) {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No case found");
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        return output;
    }

    public String loadCitizenProfile(String CPRNumber) {
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
            output += "\n";
        } catch (SQLException e) {
            System.out.println("No user found");
            return null;
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        return output;
    }

    public String loadJournal(int journalID) {
        Statement st = null;
        ResultSet rs = null;
        String output = "";
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT * FROM Journal WHERE journalID = ?");
            PStatement.setInt(1, journalID);
            rs = PStatement.executeQuery();
            rs.next();
            output += rs.getString(1) + ";";
            output += rs.getString(2) + ";";
            output += rs.getString(3) + ";";
            output += rs.getString(4) + ";";
            output += "\n";

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        return output;
    }

    public void writeInfoToCitizenProfile(String name, String email, String CPRNumber) {
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO CitizenProfile VALUES (?, ?, ?)");
            PStatement.setString(1, name);
            PStatement.setString(2, email);
            PStatement.setString(3, CPRNumber);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
    }

    public String writeInfoToCaseTable(String caseDescription, String citizenProfile, int caseResponsible) {
        String id = "";
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO CaseTable(caseDescription, citizen, caseResponsible) VALUES (?, ?, ?)");
            PStatement.setString(1, caseDescription);
            PStatement.setString(2, citizenProfile);
            PStatement.setInt(3, caseResponsible);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        } finally {
            try {
                st.close();
                //rs.close();
                st.getConnection().close();
                
                
            } catch (SQLException e) {
            }
        }
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement2 = st.getConnection().prepareStatement("SELECT MAX(caseid) AS caseID FROM caseTable");
            rs = PStatement2.executeQuery();
            rs.next();
            id += rs.getString(1);    
        }
        catch(Exception e){
        }
        finally {
            try{
                st.getConnection().close();
                st.close();
                rs.close();
            }
            catch(Exception e){
            }
        }
        return id;
    }

    public void writeInfoToJournal(String resume, int writer, int relatedCase) {
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("INSERT INTO Journal(resume, writer, relatedCase) VALUES (?, ?, ?)");
            PStatement.setString(1, resume);
            PStatement.setInt(2, writer);
            PStatement.setInt(3, relatedCase);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
    }

    public void deleteCase(int caseID) {
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("DELETE FROM CaseTable WHERE caseID = ?");
            PStatement.setInt(1, caseID);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (Exception e) {
            }
        }
    }

    public void deleteJournal(int journalID) {
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("DELETE FROM Journal WHERE JournalID = ?");
            PStatement.setInt(1, journalID);
            rs = PStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Exception" + e);
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
    }

    public String showCaseOverview(String CPRNumber, String department) {
        StringBuilder output = new StringBuilder();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT(caseid,casedescription,citizen,caseresponsible) FROM casetable, employee WHERE citizen = ? AND department = ?");
            PStatement.setString(1, CPRNumber);
            PStatement.setString(2, department);
            rs = PStatement.executeQuery();
            while (rs.next()) {
                output.append(rs.getString(1)).append(";");
                output.append("\n");
            }
            if (output.length() != 0) {
                return output.toString();
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Exception" + e);
            return null;
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
    }
    public String showCaseOverviewForCitizen(String CPRNumber) {
        StringBuilder output = new StringBuilder();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = OpenCDConnection();
            PreparedStatement PStatement = st.getConnection().prepareStatement("SELECT DISTINCT(caseid,casedescription,citizen,caseresponsible) FROM casetable, employee WHERE citizen = ?");
            PStatement.setString(1, CPRNumber);
            
            rs = PStatement.executeQuery();
            while (rs.next()){
                
                output.append(rs.getString(1)).append(";");
                output.append("\n");
        }
            if (output.length() != 0) {
                return output.toString();
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Exception" + e);
            return null;
        } finally {
            try {
                st.getConnection().close();
                st.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
    }

    private Statement OpenCDConnection() {

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

        } catch (SQLException e) {
            System.out.println(e);
        }
        return st;
    }
    
//    public static void main(String[] args) {
//        CaseDatabase CD = new CaseDatabase();
//        System.out.println(CD.loadCitizenProfile("1010294023"));
//    }
}
