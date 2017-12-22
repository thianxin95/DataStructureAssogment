/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;

import ADT.*;
import JavaInterfaces.*;
import java.util.*;
import entity.*;

public class MaintainDM {
   int empPass;
    int empNum;
    
    
     public DoublyLinkedList<Staff> createStaffRecord(DoublyLinkedList<Staff> staffList){
     empPass=123456;
     empNum=1000;
        
         String answer = "y";
       
        while(answer.equals("y") || answer.equals("Y") ){
            Staff staff = new Staff();
            System.out.println("Please enter staff information\n");
            Scanner scanner = new Scanner(System.in);


            System.out.print("ID:");
            staff.setStaffID(getUniqueEmpId());


           System.out.print("Delivery Man Name:");
           String name= scanner.nextLine();
           staff.setStaffName(name);

           System.out.print("Deliver Man Address:");
           String address= scanner.nextLine();
           staff.setStaffAddress(address);

           System.out.print("Delivery Man Phone Number:");
           int phoneNum= scanner.nextInt();
           staff.setStaffPhone(phoneNum);


           System.out.print("Deliver Man Age:");
           int age= scanner.nextInt();
           staff.setStaffAge(age);
           
            System.out.println("Deliver Man Status:Active");
            staff.setStaffStatus("Active");
            
            System.out.print("Deliver Man Password:");
            staff.setStaffPassword(getUniqueEmpPass());
            
             DMADT dmadt = new DMADT();
             dmadt.CreateRecord(staff, staffList);

           System.out.println("ID:"+staff.getStaffID());
           System.out.println("Name:"+staff.getStaffName());
           System.out.println("Phone:"+staff.getStaffPhone());
           System.out.println("Address:"+staff.getStaffAddress());
           System.out.println("Age:"+staff.getStaffAge());
           System.out.println("Status:"+staff.getStaffStatus());
           System.out.println("Password:"+staff.getStaffPassword());
          
           System.out.println("Do u want to add record again?(y or Y)");
           answer= scanner.next();

     }
      return staffList ;
     }
     
     public DoublyLinkedList<Staff> UpdateStaffInfo(int staffid,DoublyLinkedList<Staff> staffList)
     {
          Scanner scanner = new Scanner(System.in); 
         System.out.println("Please key in the staff ID you wish to update:");
         staffid= scanner.nextInt();
            
         DMADT dmadt = new DMADT();
         dmadt.UpdateDM(staffid, staffList);
        
        // Staff staff = new Staff();
         System.out.print("ArrayList:"+staffList.toString());
        // System.out.print();
                
                System.out.println("Name:"+staffList.GetEntry(staffid).getStaffName()); 
                System.out.println("Phone:"+staffList.GetEntry(staffid).getStaffPhone());
                System.out.println("Address:"+staffList.GetEntry(staffid).getStaffAddress());
                System.out.println("Age:"+staffList.GetEntry(staffid).getStaffAge());
                System.out.println("Status:"+staffList.GetEntry(staffid).getStaffStatus());
               
                System.out.println("Key in the number you wish to update");
                System.out.println("1. Name");
                System.out.println("2. Phone Number");
                System.out.println("3. Address");
                System.out.println("4. Age");
                System.out.println("5. Status");
                System.out.print("Your Selection is:");
             /*   int id2= scanner.nextInt();
               
                switch(id2)
                {
                    case 1:
                    {
                    System.out.println("Name:"+staffList.get(1).getStaffName());
                    System.out.print("Enter a new name:");
                    String name= scanner.next();
                    staffList.get(1).setStaffName(name);
                    System.out.println("Name:"+staffList.get(1).getStaffName()); 
                    System.out.println("Phone:"+staffList.get(0).getStaffPhone());
                    System.out.println("Address:"+staffList.get(0).getStaffAddress());
                    System.out.println("Age:"+staffList.get(0).getStaffAge());
                    System.out.println("Status:"+staffList.get(0).getStaffStatus());
                    }
                    break;
                
                    case 2:
                    {
                    System.out.println("Phone:"+staffList.get(0).getStaffPhone());
                    System.out.print("Enter a new phone:");
                    int phone= scanner.nextInt();
                    staffList.get(0).setStaffPhone(phone);
                    System.out.println("Name:"+staffList.get(0).getStaffName()); 
                    System.out.println("Phone:"+staffList.get(0).getStaffPhone());
                    System.out.println("Address:"+staffList.get(0).getStaffAddress());
                    System.out.println("Age:"+staffList.get(0).getStaffAge());
                    System.out.println("Status:"+staffList.get(0).getStaffStatus());
                    }
                break;
               
                    case 3:
                    {
                    System.out.println("Address:"+staffList.get(0).getStaffAddress());
                    System.out.print("Enter a new Address:");
                    String address= scanner.next();
                    staffList.get(0).setStaffAddress(address);
                    System.out.println("Name:"+staffList.get(0).getStaffName()); 
                    System.out.println("Phone:"+staffList.get(0).getStaffPhone());
                    System.out.println("Address:"+staffList.get(0).getStaffAddress());
                    System.out.println("Age:"+staffList.get(0).getStaffAge());
                    System.out.println("Status:"+staffList.get(0).getStaffStatus());
                    }
                    break;
                
                    case 4:
                    {
                    System.out.println("Age:"+staffList.get(0).getStaffAge());
                    System.out.print("Enter a new age:");
                    int age= scanner.nextInt();
                    staffList.get(0).setStaffAge(age);
                    System.out.println("Name:"+staffList.get(0).getStaffName()); 
                    System.out.println("Phone:"+staffList.get(0).getStaffPhone());
                    System.out.println("Address:"+staffList.get(0).getStaffAddress());
                    System.out.println("Age:"+staffList.get(0).getStaffAge());
                    System.out.println("Status:"+staffList.get(0).getStaffStatus());
                    }
                   break;
                   
                   
                    case 5:
                    {
                    System.out.println("Status:"+staffList.get(0).getStaffStatus());
                    System.out.print("Enter a new status:");
                    String status= scanner.next();
                    staffList.get(0).setStaffStatus(status);
                    System.out.println("Name:"+staffList.get(0).getStaffName()); 
                    System.out.println("Phone:"+staffList.get(0).getStaffPhone());
                    System.out.println("Address:"+staffList.get(0).getStaffAddress());
                    System.out.println("Age:"+staffList.get(0).getStaffAge());
                    System.out.println("Status:"+staffList.get(0).getStaffStatus());
                    }
                   break;
   
            }
            
        */
        
        return staffList;
     }

     
     
     
     
     
     public int getUniqueEmpId() {
        System.out.println( +empNum);
        return empNum++;
    }
     public  int getUniqueEmpPass() {
        System.out.println( +empPass);
        return empPass++;
    }
     
     
  
    
 
       public static void main(String args[]){
         MaintainDM DM = new MaintainDM();
        DoubleLinkListADT<Staff> testlist = new DoubleLinkListADT<Staff>();
         DM.createStaffRecord(testlist);
         DM.UpdateStaffInfo(0, testlist);
         
         
     }
    
}

