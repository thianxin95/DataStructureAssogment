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
    
    public DoublyLinkedList<Staff> CheckDMInfo( DoublyLinkedList<Staff> staffList) {
         
       Scanner scanner = new Scanner(System.in); 
       System.out.println("Please key in the staff ID:");
       int id= scanner.nextInt();
           
             
        for(int i=0;i<staffList.getSize();i++)
        {
           
            if( staffList.GetEntry(i).getStaffID() == id)
            {
            
                 staffList.GetEntry(i);
               
                return staffList;
                 
            }
                
        }
       
        
       return staffList;
    }


    @Override
    public DoublyLinkedList<Staff> UpdateDM( int staffid,DoublyLinkedList<Staff> staffList) {
         
        for(int i=0;i<staffList.getSize();i++)
        {
            if(staffList.GetEntry(i).getStaffID() == staffid){
                    staffList.GetEntry(i);
                    
                    
            }
             
             
        }
        return staffList;
    }

    @Override
    public LinkList<Orders> RetrievePending(LinkList<Orders> orderList) {
          for (int i = 0; i < orderList.getNumberofSize(); i++){
             
             if(orderList.get(i).getPaymentStatus().equals("Pending")){
                
                System.out.println(orderList.get(i).toString());
              
             }
             
            
         } return orderList;
    }

   
     
     
    
}
