package sensafe.udred.business;

import sensafe.udred.business.caseManagement.Case;
import sensafe.udred.business.caseManagement.Journal;
import sensafe.udred.business.UserManagement.User;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Jeppe Enevold
 */
public class LogController {
 
    //Collection<Logger> LogList;
    private ArrayList<Logger> LogList;
    private String LogDatabase; //Replace later
    private File logFile;
    
    public LogController(String LogDatabase){
        LogList = new ArrayList<Logger>();
        logFile = new File(LogDatabase);
    }
    
    public void log(Journal journal, User user, Case caseProfile){
       LogList.add(new Logger(caseProfile, journal, user));
       writeInfoToFile(new Logger(caseProfile, journal, user).toString());
       
    }
    public Logger getlog(int key){
        return LogList.get(key);
    }
    public void deleteLog(int key){
        LogList.remove(key);
    }

    private void writeInfoToFile(String stringToWrite) {
        PrintWriter writerToFile = null;
        try {
            writerToFile = new PrintWriter(new FileWriter(logFile, true));
            writerToFile.println(stringToWrite);
        } 
        catch (IOException e) {
            System.out.println("no file");
        } 
        finally {
            if (writerToFile != null) {
                writerToFile.close();
            }
        }
    }
}
