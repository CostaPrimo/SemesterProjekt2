package sensafe.udred.business.UserManagement;
/**
 *
 * @author Nikolaj Frank-Jensen
 */
public class Employee extends User {
    private int userID;
    private String name;
    private String zipCode;
    private String email;
    private String department;
    private String phonenumber;
    
    //First time an employee is created.
    public Employee(String name, String zipCode, String email, String department, String phonenumber){
        super();
        this.name = name;
        this.zipCode = zipCode;
        this.email = email;
        this.department = department;
        this.phonenumber = phonenumber;
    }
    //Second time an employee is created by loading.
    public Employee(int userID, String name, String zipCode, String email, String department, String phonenumber, String password){
        super(userID);
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
        return name + ";" + zipCode + ";" + email + ";" + department + ";" + phonenumber  + ";" + password;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
