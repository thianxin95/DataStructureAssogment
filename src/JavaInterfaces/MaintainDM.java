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
    
    public ArrayListADT<Staff> CreateRecord(Staff newStaff,ArrayListADT<Staff> stafflist);
    public ArrayListADT<Staff> CheckDMInfo(ArrayListADT<Staff> stafflist);
    public ArrayListADT<Staff> UpdateDM(int staffid,ArrayListADT<Staff> stafflist );
    
}
