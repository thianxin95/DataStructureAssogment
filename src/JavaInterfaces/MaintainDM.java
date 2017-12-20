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
    
    public void CreateRecord(ArrayListADT<Staff> stafflist);
    public void CheckDMInfo(int checkstaffid, ArrayListADT<Staff> stafflist);
    public void UpdatDM(int staffid,ArrayListADT<Staff> stafflist );
    
}
