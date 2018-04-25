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
public abstract class User implements Comparable<User>{
    
    private String username;
    static private int userID = 1000;
    private String password;
    
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
        userID++;
    }

    public int getUserID() {
        return userID;
    }
    
    @Override
    public int compareTo(User o){
        int result;
        if(this.userID > o.userID){
            result = 1;
        }
        else{
            result = -1;
        }
        return result;
    }
}
