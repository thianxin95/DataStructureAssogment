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
    public Queue<Orders> RetrievePending(Queue<Orders> orderList) {
          for (int i = 0; i < orderList.getSize(); i++){
             
             if(orderList.getEntry(i).getPaymentStatus().equals("Pending")){
                
                System.out.println(orderList.getEntry(i).toString());
              
             }
             
            
         } return orderList;
    }

    @Override
    public DoublyLinkedList<Staff> DailyTransactionReport(DoublyLinkedList<Staff> staffList) {
            
            int[] arr = this.getArrayInt(staffList);
            
            
            
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int tmp = 0;
                    if (arr[i] > arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
           }
           int[] reverse = new int[50];
           int countdown = 0;
            for(int x = arr.length; x< arr.length; x--){
                reverse[countdown] = arr[x - 1];
                countdown++;
            }
            int loop = 1;
            while(loop == 1){
              for(int i=0;i<staffList.getSize();i++){
                if(staffList.GetEntry(i).getTotalDelivery() == reverse[i]){
                  staffList.GetEntry(i).getStaffID();
                  staffList.GetEntry(i).getStaffName();
                  staffList.GetEntry(i).getTotalDelivery();
                  staffList.GetEntry(i).getDistance();
                 System.out.println(staffList.toString());
              }
               if(staffList.GetEntry(i).getTotalDelivery() == reverse[0]){
                   loop =0;
               }
            }
    
        
 /*           for(int i=0;i<staffList.getSize();i++){
                staffList.GetEntry(i).getStaffID();
                staffList.GetEntry(i).getStaffName();
                staffList.GetEntry(i).getTotalDelivery();
                staffList.GetEntry(i).getDistance();
               System.out.println(staffList.toString());
                
            }*/
      
   
    }
             return staffList;
    }
    public int[] getArrayInt(DoublyLinkedList<Staff> staffList){
        int Arr[] = new int[50];
        for(int i = 0 ; i<staffList.getSize(); i++){
            Arr[i]=staffList.GetEntry(i).getTotalDelivery();
        }
        return Arr;
    }

   

    
    
    
    
    
}


