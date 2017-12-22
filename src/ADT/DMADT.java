/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.*;
import entity.*;
import java.util.Scanner;




public class DMADT implements MaintainDM {
  
    int empPass;
    int empNum;

    @Override
    public DoublyLinkedList<Staff> CreateRecord(Staff staff,DoublyLinkedList<Staff> staffList) {
       staffList.Add(staff);
       return staffList;
    }

   // @Override
    
   /* public DoublyLinkedList<Staff> CheckDMInfo( DoublyLinkedList<Staff> staffList) {
         
       Scanner scanner = new Scanner(System.in); 
       System.out.println("Please key in the staff ID:");
       int id= scanner.nextInt();
           
             
        for(int i=0;i<staffList.getNumberOfEntries();i++)
        {
           
            if( staffList.get(i).getStaffID() == id)
            {
            
                Staff staff = staffList.get(i);
                System.out.println("ID:"+staff.getStaffID()); 
                System.out.println("Name:"+staff.getStaffName()); 
                System.out.println("Phone:"+staff.getStaffPhone());
                System.out.println("Address:"+staff.getStaffAddress());
                System.out.println("Age:"+staff.getStaffAge());
                System.out.println("Status:"+staff.getStaffStatus());
                return staffList;
                 
            }
                
        }
        System.out.print("Not Found");
        
       return staffList;
    }
*/

    @Override
    public DoublyLinkedList<Staff> UpdateDM( int staffid,DoublyLinkedList<Staff> staffList) {
         
        for(int i=0;i<staffList.getSize();i++)
        {
            if(staffList.GetEntry(i).getStaffID() == staffid){
                    staffList.GetEntry(i);
                    
                    //return staffList;
            }
             
             
        }
        return staffList;
    }

    @Override
    public DoublyLinkedList<Staff> CheckDMInfo(DoublyLinkedList<Staff> stafflist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
     
    
}
