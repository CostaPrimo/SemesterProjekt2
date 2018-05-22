package sensafe.udred.business.caseManagement;
/**
 *
 * @author jtrue
 */
public class Case{
    private int caseID;
    private String caseDescription;
    private String citizenProfile;
    private int caseResponsible;
    
    public Case(int caseID, String caseDescription, String citizenProfile, int caseResponsible) {
        this.caseID = caseID;
        this.caseDescription = caseDescription;
        this.citizenProfile = citizenProfile;
        this.caseResponsible = caseResponsible;
        
    }

    /**
     * @return the citizenProfile
     */
    public String getCitizenProfile() {
        return citizenProfile;
    }
   
    public int getCaseID() {
        return this.caseID;
    }

    @Override
    public String toString() {
        return caseID + ";" + caseDescription + ";" + citizenProfile + ";" + caseResponsible;
    }
}
