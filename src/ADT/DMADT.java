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
    public Queue<Orders> RetrievePending(Queue<Orders> orderList) {
          for (int i = 0; i < orderList.getSize(); i++){
             
           //  if(orderList.getFront(i).getPaymentStatus().equals("Pending")){
                
              //  System.out.println(orderList.getFront(i).toString());
              
           //  }
             
            
       //  } return orderList;
    }

    //@Override
  /*  public DoublyLinkedList<FoodDelivered> DailyTransactionReport(DoublyLinkedList<FoodDelivered> deliveredList,DoublyLinkedList<Staff> staffList) {
         int n, temp;
     //   Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = .nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
      for (int i = 0; i < deliveredList.getSize(); i++){
             
            // if(deliveredList.GetEntry(i).getPaymentStatus().equals("Pending")){
                
                System.out.println(deliveredList.toString());
              
            // }
             
            
         } return deliveredList;
    }

   
     
     
   */

    @Override
    public DoublyLinkedList<FoodDelivered> DailyTransactionReport(DoublyLinkedList<FoodDelivered> deliveredList, DoublyLinkedList<Staff> staffList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
