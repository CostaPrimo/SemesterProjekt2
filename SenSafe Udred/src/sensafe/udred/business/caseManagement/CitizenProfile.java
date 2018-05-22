package sensafe.udred.business.caseManagement;
/**
 *
 * @author Nick
 */
public class CitizenProfile {
    private String Name;
    private String Email;
    private String CPR;
    

    public CitizenProfile(String Name, String Email, String CPR) {
        this.Name = Name;
        this.Email = Email;
        this.CPR = CPR;
        
    }
    
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getCPR() {
        return CPR;
    }

    @Override
    public String toString() {
        return Name + ";" + Email + ";" + CPR;
    }

    
    
    
}
