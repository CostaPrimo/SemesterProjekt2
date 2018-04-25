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
public abstract class User {
    
    private String username;
    static private int userID = 1000;
    private String password;
    
    
    public User(String username, int userID, String password){
        this.username = username;
        this.userID = userID;
        this.password = password;
        userID++;
        
    }

    public int getUserID() {
        return userID;
    }
    
    
}
