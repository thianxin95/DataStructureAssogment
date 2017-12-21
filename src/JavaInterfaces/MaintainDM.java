/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;
import ADT.*;
import entity.*;

/**
 *
 * @author acer
 */
public interface MaintainDM {
    
    public CircularList<Staff> CreateRecord(Staff newStaff,CircularList<Staff> stafflist);
    public CircularList<Staff> CheckDMInfo(CircularList<Staff> stafflist);
    public CircularList<Staff> UpdateDM(int staffid,CircularList<Staff> stafflist );
    
}
