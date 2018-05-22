package sensafe.udred.business.UserManagement;

import java.util.Random;
/**
 *
 * @author Nikolaj Frank-Jensen
 */
public abstract class User{
    
    private int userID; //Save virker, men ikke load da de tager samme reference??
    protected String password;
    
    //First time program is ran.
    public User(){
        password = passwordGenerator(8);
    }
    //Used during load.
    public User(int userID){
    }
    
    private String passwordGenerator(int len){
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        
        String values = capitalChars + smallChars + numbers;
        
        Random random = new Random();
        
        char[] password = new char[len];
        
        for(int i = 0; i < len; i++){
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        System.out.println("kode lavet");
        return new String (password);
    }

    public String getPassword() {
        return new String(password);
    }

    public int getUserID() {
        return userID;
    }
    
    /**
     * @param aUserID the userID to set
     */
    public void setUserID(int aUserID) {
        userID = aUserID;
    }
}
