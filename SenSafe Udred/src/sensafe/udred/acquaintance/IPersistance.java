/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.acquaintance;

/**
 *
 * @author Jeppe Enevold
 */
public interface IPersistance {
        public void createCitizenUser(String CPR, String Password, int userID);
        public String loadEmployee(int ID);
        public String loadCitizenUser(int ID);
}
