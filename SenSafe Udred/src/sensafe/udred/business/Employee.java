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
public class Employee extends User {
    
    private String name;
    private int zipCode;
    private String email;
    private String department;
    private String phonenumber;
    
    public Employee (String username, int userID, String password, String name, int zipCode, String email, String department, String phonenumber){
        super(username, userID, password);
        this.name = name;
        this.zipCode = zipCode;
        this.email = email;
        this.department = department;
        this.phonenumber = phonenumber;
    }
}
