/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred;

/**
 *
 * @author Nikolaj Frank-Jensen
 */
public abstract class User {
    
    private String username;
    private int userID;
    private String password;
    
    public User(String username, int userID, String password){
        this.username = username;
        this.userID = userID;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }
    
    
}
