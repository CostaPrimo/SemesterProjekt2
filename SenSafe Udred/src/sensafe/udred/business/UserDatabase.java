/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.io.File;
import java.util.Collection;
import java.util.TreeSet;
import sensafe.udred.business.User;

/**
 *
 * @author Kim Christensen
 */
public class UserDatabase {
    
    private Collection<User> userCollection;
    private String databaseName;
    //This file will be replaced with a database later. Possibly an URL connection.
    private File databaseFile;

    public UserDatabase(String databaseName, File databaseFile){
        this.databaseName = databaseName;
        this.databaseFile = databaseFile;
        userCollection = new TreeSet<>();
    }
    
    public void userCreate(String username, String name, int zipcode, String email, String department, String phoneNumber){
        User user = new Employee(username, name, zipcode, email, department, phoneNumber);
        userCollection.add(user);
        System.out.println("User created" + user.getClass() + user.getUserID());
    }
    
    public void userCreate(String username, String CPR){
        User user = new CitizenUser(username,CPR);
        userCollection.add(user);
        System.out.println("User created" + user.getClass() + user.getUserID());
    }
    
    public void userDelete(int userID){
        for (User object : userCollection) {
            if(object.getUserID() == userID){
                userCollection.remove(object);
                System.out.println("User deleted " + object.getUserID());
            }
        }
    }
    
}
