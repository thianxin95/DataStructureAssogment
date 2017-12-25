/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.*;
import entity.*;
import java.util.Scanner;




public class DMADT<T> implements MaintainDM<T> {
  
    int empPass;
    int empNum;
    

    @Override
    public DoublyLinkedList<Staff> CreateRecord(Staff staff,DoublyLinkedList<Staff> staffList) {
      
       staffList.Add(staff);
       return staffList;
    }

    
     @Override
    public DoublyLinkedList<Staff> Delete( Staff removeStaff,DoublyLinkedList<Staff> staffList)
    {
        staffList.deleteNode(removeStaff);
         return staffList;
    }


    @Override
    public DoublyLinkedList<Staff> UpdateDM(Staff remove, Staff updatedetail, DoublyLinkedList<Staff> staffList){
         
        staffList.deleteNode(remove);
        staffList.Add(updatedetail);
        return staffList;
    }

    @Override
    public void RetrievePending(Queue<Orders> orderList) {
        System.out.println("OrderList Size :" + orderList.getSize());
       // Orders orderdequed = orderList.dequeue();
       // Orders orderdequed2 = orderList.dequeue();
       // System.out.printf("Queue 1 : %-10s %-12s %-12s %-17s %-15s %-12s\n" ,orderdequed.getOrderID(), orderdequed.getOrderCustomerID() , orderdequed.getOrderName(), orderdequed.getOrderProductID(), orderdequed.getProductQuantity() , orderdequed.getPaymentStatus() );
       // System.out.printf("Queue 2 : %-10s %-12s %-12s %-17s %-15s %-12s\n" ,orderdequed2.getOrderID(), orderdequed2.getOrderCustomerID() , orderdequed2.getOrderName(), orderdequed2.getOrderProductID(), orderdequed2.getProductQuantity() , orderdequed2.getPaymentStatus() );
          Queue<Orders> pendingOrder = orderList;
        for (int i = 0; i < orderList.getSize(); i++){
             Orders orderdequed = pendingOrder.dequeue();
             if(orderdequed !=null){
             //"Order ID", "Customer ID", "Order Name", "Order Product ID", "Product Quantity", "Payment Status"
                System.out.printf("%-10s %-12s %-12s %-17s %-15s %-12s\n" ,orderdequed.getOrderID(), orderdequed.getOrderCustomerID() , orderdequed.getOrderName(), orderdequed.getOrderProductID(), orderdequed.getProductQuantity() , orderdequed.getPaymentStatus() );
                pendingOrder.enqueue(orderdequed);
             }else{
                 System.out.println("No pending Orders");
            }
         } 
    }

    @Override
    public DoublyLinkedList<Staff> DailyTransactionReport(DoublyLinkedList<Staff> staffList) {
      
        
    System.out.println(staffList.reverseString());
    return staffList;
    }
             
    }
 

    
    
    
    
    


