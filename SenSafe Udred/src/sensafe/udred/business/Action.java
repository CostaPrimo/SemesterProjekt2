/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.business;

/**
 *
 * @author Jeppe Enevold
 */
public enum Action {
    CREATE("create"), DELETE("delete"), EDIT("edit"), LOGIN("login"), LOGOUT("logout"), SHOWLOGS("showlogs"), VIEW("view"), UNKNOWN("?");
    
    private String actionDone;
    
    Action(String action){
        this.actionDone = action;
    }
    
    @Override
    public String toString(){
        return actionDone;
    }
}
