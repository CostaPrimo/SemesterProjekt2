/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

/**
 *
 * @author Nikolaj Frank-Jensen
 */
public class CitizenUser extends User {
    
    private String CPRNumber;

    public CitizenUser (String username, String CPRNumber){
    super(username);
    this.CPRNumber = CPRNumber;
    }
}
