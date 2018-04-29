/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.util.Random;
import org.w3c.dom.css.Counter;

/**
 *
 * @author Nikolaj Frank-Jensen
 */
public abstract class User implements Comparable<User>{
    
    protected String username;
    private int userID; //Save virker, men ikke load da de tager samme reference??
    private static int tempID;
    protected char[] password;
    
    //First time program is ran.
    public User(String username){
        this.username = username;
        password = passwordGenerator(8);
        userID = 1 + tempID;
        System.out.println(userID);
        tempID++;
    }
    //Used during load.
    public User(int userID){
        System.out.println(tempID);
        System.out.println(userID);
        if(tempID<userID){
        tempID = userID;
            System.out.println(tempID);
        }
        setUserID(userID);
    }
    
    private char [] passwordGenerator(int len){
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
        return password;
    }

    public char[] getPassword() {
        return password;
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

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param aUserID the userID to set
     */
    public void setUserID(int aUserID) {
        userID = aUserID;
    }
}
