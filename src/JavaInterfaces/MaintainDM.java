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
    
    public DoublyLinkedList<Staff> CreateRecord(Staff newStaff,DoublyLinkedList<Staff> stafflist);
    public DoublyLinkedList<Staff> CheckDMInfo(DoublyLinkedList<Staff> stafflist);
    public DoublyLinkedList<Staff> UpdateDM(int staffid,DoublyLinkedList<Staff> staffList );
    
}
