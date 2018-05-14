package sensafe.udred.business.UserManagement;
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

    private TreeSet<User> userCollection;
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

    public void userCreate(String name, int zipcode, String email, String department, String phoneNumber) {
        Employee user = new Employee(name, zipcode, email, department, phoneNumber);
        userCollection.add(user);
        System.out.println("User created" + user.getClass() + user.getUserID());
        writeInfoToFile(user.toString());
    }

    public void userCreate(String CPR) {
        CitizenUser user = new CitizenUser(CPR);
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
                System.out.println(lineArrayToRead[0]);
                if (Integer.parseInt(lineArrayToRead[0]) == userID) {
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

    public TreeSet<User> loadUsers() {

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                int userID;
                String name;
                char[] password;
                int zipCode;
                String CPRNumber;
                String email;
                String department;
                String phoneNumber;

                String[] lineToRead = scanner.nextLine().split(":");
                if (lineToRead.length > 4) {
                    userID = Integer.parseInt(lineToRead[0]);
                    name = lineToRead[1];
                    password = lineToRead[2].toCharArray();
                    zipCode = Integer.parseInt(lineToRead[3]);
                    email = lineToRead[4];
                    department = lineToRead[5];
                    phoneNumber = lineToRead[6];
                    Employee employee = new Employee(userID, name, password, zipCode, email, department, phoneNumber);
                    userCollection.add(employee);

                } else {
                    //Lav citizen
                }
            }

        } catch (IOException e) {
            System.out.println("Error opening file");
        } finally {
            scanner.close();
        }
        return userCollection;
    }

    public TreeSet<User> getUserCollection() {
        return userCollection;
    }

    public Employee lookupUser(int userID) {
        Employee employee = null;
        for (User user : userCollection) {
            if (user.getUserID() == userID) {
                employee = (Employee) user;
                break;
            }
        }
        if (employee == null) {
            System.out.println("No such user");
        }
        return employee;
    }
    
    public boolean validatePassword(int userID, String password){
        Scanner scanner = null;
        boolean isCorrect = false;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNext()){
                String[] lineToRead = scanner.nextLine().split(":");
                int userIDInFile = Integer.parseInt(lineToRead[0]);
                String passwordInFile = lineToRead[2];
                if((userID  == userIDInFile) && (password.compareTo(passwordInFile) == 0)){
                    isCorrect = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading file, try again please");
        }
        
        finally{
            if(scanner != null){
                scanner.close();
            }
        }
        return isCorrect;
    }
}
