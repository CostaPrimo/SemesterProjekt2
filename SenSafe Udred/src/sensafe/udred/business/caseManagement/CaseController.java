package sensafe.udred.business.caseManagement;

import sensafe.udred.acquaintance.ICaseController;
/**
 *
 * @author Nick
 */
public class CaseController implements ICaseController {
    
    public CaseController() {
    }
    
    @Override
    public String createCitizenProfile(String name, String email, String CPR){
        CitizenProfile citizenProfile = new CitizenProfile(name, email, CPR);
        return citizenProfile.toString();
    }
}