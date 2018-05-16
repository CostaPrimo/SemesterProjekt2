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
    CREATE, DELETE, VIEW,UNKNOWN;
    
    public boolean isUnknown(Action action){
        return action==Action.UNKNOWN;
    }
}
