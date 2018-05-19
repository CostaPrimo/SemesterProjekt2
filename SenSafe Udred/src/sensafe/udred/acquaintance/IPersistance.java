/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.acquaintance;

import java.util.Date;

/**
 *
 * @author Jeppe Enevold
 */
public interface IPersistance {
        public void createCitizenUser(String CPR, String Password);
        public void createEmployee(String name, String zipCode, String email, String department, String phonenumber, String password);
        public void createCitizenProfile(String name, String email, String CPRNumber);
        public void createLog(Date date, int ActorID, int TargetID, String action);
        public void createCase(String caseDescription, String citizenProfile, int caseResponsible);
        public void createJournal(String resume, int writer, int relatedCase);
        public String loadEmployee(int ID);
        public String loadCitizenUser(int ID);
        public String loadCitizenProfile(String CPR);
        public String loadCase(int caseID);
        public String loadJournal(int journalID);
        public boolean validateLogin(int ID, String password);
}
