/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.acquaintance;

import java.util.Date;

/**
 *
 * @author Jeppe Enevold
 */
public interface ILogController {
    public Date log(int ActorID, int TargetID, String Action);
    public String verifyAction(String action);
}
