/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sanik
 */
public class WorkQueue {
    
    private List<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public List<WorkRequest> getWorkRequestList() {
        if(workRequestList == null){
            workRequestList = new ArrayList();
        }
        return workRequestList;
    }
}