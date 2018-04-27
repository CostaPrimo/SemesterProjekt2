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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Nick
 */
public class CaseDatabase {
    
    private ArrayList<CitizenProfile> citizenArray = new ArrayList<>();
    private Collection<Case> caseCollection;
    
    private String databaseName;
    private String databaseFileName;
    private File file;
    
    
    public CaseDatabase(String databaseName, String fileName) {
        this.databaseName = databaseName;
        this.databaseFileName = fileName;
        caseCollection = new TreeSet<>();
        file = new File(fileName);
}
    
    //"case" er allerede en ting i netbeans, så objektet kaldes "cases" i stedet.
    public void caseCreate(int caseID, Employee employee, CitizenProfile citizenProfile, String caseDesc, String relative, String medicine) {
        String citizenProfileCPR = citizenProfile.getCPR();
        Case cases = new Case(caseID, employee, citizenProfile, caseDesc, relative, medicine);
        caseCollection.add(cases);
        System.out.println("Case created " + cases.getClass() + cases.getCaseID());
        writeInfoToFile(cases.toString());
    }
    
    public void caseDelete(int caseID) {
        for (Case cases : caseCollection) {
            if (cases.getCaseID() == caseID) {
                caseCollection.remove(cases);
                System.out.println("Case deleted " + cases.getCaseID());
            }

        }
    }
     
    public TreeSet<Case> showCaseOverview(String CPRNumber){
        TreeSet<Case> tempSet = new TreeSet<>(); 
        for (Case cases : caseCollection) {
            if (cases.getCitizenProfile().getCPR() == CPRNumber) {
                tempSet.add(cases);
                System.out.println("Case added to tempSet.");
                
            } else { 
                System.out.println("No matching cases found.");
            }
        } 
        System.out.println("Set returned.");
        return tempSet;
        
    }
    
    
    
    //Kode Kim har lavet for at skrive til fil
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
    
    //Kode Kim har skrevet for at slette fra fil
    public void removeCaseFromFile(int caseID) {
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
                if (Integer.parseInt(lineArrayToRead[1]) == caseID) {
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

        
    public CitizenProfile findCitizenProfile(String CPRNummer){
        for (CitizenProfile c : citizenArray){
            if (CPRNummer == c.getCPR()){
                System.out.println(c);
                return c;
                
            }
            
        }
        return null;
    }
    
    public void addTocitizenArray(CitizenProfile e){
        citizenArray.add(e);   
    
    }
    
}
