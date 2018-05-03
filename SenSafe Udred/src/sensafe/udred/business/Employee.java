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
    private int userID;
    private String name;
    private int zipCode;
    private String email;
    private String department;
    private String phonenumber;
    
    //First time an employee is created.
    public Employee(String username, String name, int zipCode, String email, String department, String phonenumber){
        super(username);
        this.name = name;
        this.zipCode = zipCode;
        this.email = email;
        this.department = department;
        this.phonenumber = phonenumber;
    }
    //Second time an employee is created by loading.
    public Employee(int userID, String name, String username, char[] password, int zipCode, String email, String department, String phonenumber){
        super(userID);
        this.username = username;
        this.name = name;
        this.password = password;
        this.zipCode = zipCode;
        this.email = email;
        this.department = department;
        this.phonenumber = phonenumber;
    }
    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString(){
        String password = new String(this.password);
        return getUserID() + ":" + name + ":" + username + ":" + password + ":" + zipCode + ":" + email + ":" + department + ":" + phonenumber + "\n";
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
