/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Kim Christensen
 */
public class UserDatabase {

    private Collection<User> userCollection;
    private String databaseName;
    //This file will be replaced with a database later. Possibly an URL connection.
    private String databaseFileName;
    private File file;

    public UserDatabase(String databaseName, String databaseFileName) {
        this.databaseName = databaseName;
        this.databaseFileName = databaseFileName;
        userCollection = new TreeSet<>();
        file = new File(databaseFileName);
    }

    public void userCreate(String username, String name, int zipcode, String email, String department, String phoneNumber) {
        Employee user = new Employee(username, name, zipcode, email, department, phoneNumber);
        userCollection.add(user);
        System.out.println("User created" + user.getClass() + user.getUserID());
        writeInfoToFile(user.toString());
    }

    public void userCreate(String username, String CPR) {
        CitizenUser user = new CitizenUser(username, CPR);
        userCollection.add(user);
        System.out.println("User created" + user.getClass() + user.getUserID());
        writeInfoToFile(user.toString());
    }

    public void userDelete(int userID) {
        for (User user : userCollection) {
            if (user.getUserID() == userID) {
                userCollection.remove(user);
                System.out.println("User deleted " + user.getUserID());
            }
        }
    }

    //Dette kan dog gøres "bedre" hvis vi har seperate collections. Så skal vi ikke caste med instance of for at sikre metoden må kaldes. Hvad tænker i?
    public void userChangeDepartment(int userID, String newDepartment) {
        for (User user : userCollection) {
            if (user.getUserID() == userID) {
                if (user instanceof Employee) {
                    System.out.println(((Employee) user).getDepartment());
                    ((Employee) user).setDepartment(newDepartment);
                    System.out.println(((Employee) user).getDepartment());
                }
            }
        }
    }

    public void writeInfoToFile(String stringToWrite) {
        PrintWriter writerToFile = null;
        try {
            writerToFile = new PrintWriter(new FileWriter(file, true));
            writerToFile.println(stringToWrite);
        } catch (IOException e) {
            System.out.println("no file");
        } finally {
            if (writerToFile != null) {
                writerToFile.close();
            }
        }
    }

    public void removeUserInfoFromFile(int userID) {
        Scanner reader = null;
        File tempfile = new File("tempFile.txt");
        PrintWriter writer = null;
        try {
            reader = new Scanner(file);
            writer = new PrintWriter(new FileWriter(tempfile));
            while (reader.hasNext()) {
                String lineToWrite = reader.nextLine();
                String[] lineArrayToRead = lineToWrite.split(":");
                System.out.println(lineArrayToRead[1]);
                if (Integer.parseInt(lineArrayToRead[1]) == userID) {
                    continue;
                }
                {
                    writer.println(lineToWrite);
                }
            }
        } catch (IOException e) {
            System.out.println("No file");
        } finally {
            if (reader != null && writer != null) {
                reader.close();
                writer.close();
                file.delete();
                tempfile.renameTo(file);
            }
        }
    }
}
