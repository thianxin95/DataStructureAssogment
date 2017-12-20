/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.*;
import entity.*;



public class DMADT implements MaintainDM {

    @Override
    public ArrayListADT<Staff> CreateRecord(ArrayListADT<Staff> stafflist) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return stafflist;
    }

    @Override
    public void CheckDMInfo(int checkstaffid, ArrayListADT<Staff> stafflist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdatDM(int staffid, ArrayListADT<Staff> stafflist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
