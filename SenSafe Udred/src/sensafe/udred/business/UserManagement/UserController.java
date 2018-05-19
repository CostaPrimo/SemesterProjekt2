package sensafe.udred.business.UserManagement;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;
import sensafe.udred.acquaintance.IUserController;
/**
 *
 * @author Kim Christensen
 */
public class UserController implements IUserController{

    //This file will be replaced with a database later. Possibly an URL connection.

    public UserController(String databaseName, String databaseFileName) {
        //constructor logik
    }
    @Override
    public String createEmployee(String name, String zipcode, String email, String department, String phoneNumber) {
        Employee employee = new Employee(name, zipcode, email, department, phoneNumber);
        System.out.println("User created");
        return employee.toString();
    }
    
    @Override
    public String createCitizenUser(String CPR) {
        CitizenUser user = new CitizenUser(CPR);
        System.out.println("User created" + user.getClass() + user.getUserID());
        return user.toString();
    }

    public void userDelete(int userID) {
//        for (User user : userCollection) {
//            if (user.getUserID() == userID) {
//                userCollection.remove(user);
//                System.out.println("User deleted " + user.getUserID());
//            }
//        }
    }

    public void userChangeDepartment(int userID, String newDepartment) {
//        for (User user : userCollection) {
//            if (user.getUserID() == userID) {
//                if (user instanceof Employee) {
//                    System.out.println(((Employee) user).getDepartment());
//                    ((Employee) user).setDepartment(newDepartment);
//                    System.out.println(((Employee) user).getDepartment());
//                }
//            }
//        }
    }

    public void writeInfoToFile(String stringToWrite) {
////        PrintWriter writerToFile = null;
////        try {
////            writerToFile = new PrintWriter(new FileWriter(file, true));
////            writerToFile.println(stringToWrite);
////        } catch (IOException e) {
////            System.out.println("no file");
////        } finally {
////            if (writerToFile != null) {
////                writerToFile.close();
////            }
////        }
    }

    public void removeUserInfoFromFile(int userID) {
//        Scanner reader = null;
//        File tempfile = new File("tempFile.txt");
//        PrintWriter writer = null;
//        try {
//            reader = new Scanner(file);
//            writer = new PrintWriter(new FileWriter(tempfile));
//            while (reader.hasNext()) {
//                String lineToWrite = reader.nextLine();
//                String[] lineArrayToRead = lineToWrite.split(":");
//                System.out.println(lineArrayToRead[0]);
//                if (Integer.parseInt(lineArrayToRead[0]) == userID) {
//                    continue;
//                }
//                {
//                    writer.println(lineToWrite);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("No file");
//        } finally {
//            if (reader != null && writer != null) {
//                reader.close();
//                writer.close();
//                file.delete();
//                tempfile.renameTo(file);
//            }
//        }
    }
//    public Employee lookupUser(int userID) {
//        Employee employee = null;
//        for (User user : userCollection) {
//            if (user.getUserID() == userID) {
//                employee = (Employee) user;
//                break;
//            }
//        }
//        if (employee == null) {
//            System.out.println("No such user");
//        }
//        return employee;
//    }
    
//    public boolean validatePassword(int userID, String password){
//        Scanner scanner = null;
//        boolean isCorrect = false;
//        try {
//            scanner = new Scanner(file);
//            while(scanner.hasNext()){
//                String[] lineToRead = scanner.nextLine().split(":");
//                int userIDInFile = Integer.parseInt(lineToRead[0]);
//                String passwordInFile = lineToRead[2];
//                if((userID  == userIDInFile) && (password.compareTo(passwordInFile) == 0)){
//                    isCorrect = true;
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Error loading file, try again please");
//        }
//        
//        finally{
//            if(scanner != null){
//                scanner.close();
//            }
//        }
//        return isCorrect;
//    }
}
