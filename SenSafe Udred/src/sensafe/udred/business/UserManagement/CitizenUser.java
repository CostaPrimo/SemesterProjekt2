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
        return  CPRNumber + ";" + password + ";" + getUserID();
    }
}
