package sensafe.udred.business.UserManagement;
/**
 *
 * @author Nick
 */
public class SysAdmin {
    private int AdminID;
    private String Password;

    public SysAdmin(String Username, String Password) {
        //NEED Autogeneratoin of AdminID + password
        
        //this.AdminID = Username;
        //this.Password = Password;
    }
    
    public int getAdminID(){
        return this.AdminID;
    }
    
}
