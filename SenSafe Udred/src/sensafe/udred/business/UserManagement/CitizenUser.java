/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business.UserManagement;

/**
 *
 * @author Nikolaj Frank-Jensen
 */
public class CitizenUser extends User {
    
    private String CPRNumber;

    public CitizenUser (String CPRNumber){
    super();
    this.CPRNumber = CPRNumber;
    }

    @Override
    public String toString() {
        return  getUserID() + ":" + password + ":" + CPRNumber + "\n";
    }
    
    
}
