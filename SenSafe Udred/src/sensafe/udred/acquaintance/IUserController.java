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
public interface IUserController {
    public String createEmployee(String name, String zipCode, String email, String department, String phonenumber);
    public String createCitizenUser(String CPR);
}
