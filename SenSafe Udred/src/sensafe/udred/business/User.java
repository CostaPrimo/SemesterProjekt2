/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.util.Random;

/**
 *
 * @author Nikolaj Frank-Jensen
 */
public abstract class User implements Comparable<User>{
    
    private String username;
    static private int userID = 1000;
    private char[] password;
    
    
    public User(String username){
        this.username = username;
        userID++;
        password = passwordGenerator(8);
        
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
}
