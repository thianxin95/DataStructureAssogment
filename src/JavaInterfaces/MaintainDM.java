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
public interface MaintainDM<T> {

  public DoublyLinkedList<Staff> CreateRecord(Staff newStaff, DoublyLinkedList<Staff> stafflist);

  public DoublyLinkedList<Staff> UpdateDM(Staff remove, Staff updatedetail, DoublyLinkedList<Staff> staffList);

  public DoublyLinkedList<Staff> Delete(Staff removeStaff, DoublyLinkedList<Staff> stafflist);

  public void RetrievePending(Queue<Orders> orderList);

  public DoublyLinkedList<Staff> DailyTransactionReport(DoublyLinkedList<Staff> staffList);

}
