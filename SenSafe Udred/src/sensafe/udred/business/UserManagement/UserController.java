package sensafe.udred.business.UserManagement;

import sensafe.udred.acquaintance.IUserController;
/**
 *
 * @author Kim Christensen
 */
public class UserController implements IUserController{

    public UserController() {
    }
    
    @Override
    public String createEmployee(String name, String zipcode, String email, String department, String phoneNumber) {
        Employee employee = new Employee(name, zipcode, email, department, phoneNumber);
        System.out.println("User created");
        return employee.toString();
    }
    
    @Override
    public String createCitizenUser(String CPR) {
        CitizenUser user = new CitizenUser(CPR);
        System.out.println("User created" + user.getClass() + user.getUserID());
        return user.toString();
    }

    public void userChangeDepartment(int userID, String newDepartment) {
//        for (User user : userCollection) {
//            if (user.getUserID() == userID) {
//                if (user instanceof Employee) {
//                    System.out.println(((Employee) user).getDepartment());
//                    ((Employee) user).setDepartment(newDepartment);
//                    System.out.println(((Employee) user).getDepartment());
//                }
//            }
//        }
    }
}
