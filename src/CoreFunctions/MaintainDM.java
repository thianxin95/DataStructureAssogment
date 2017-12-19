/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;

import ADT.*;
import java.util.*;
import entity.*;

public class MaintainDM {
    private ArrayListADT<Staff> staffList = new ArrayListADT<>();
    public static int empNum = 1000;
    public static int empPass = 12345;
    
    public void checkStaffInfomation(){
      
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
               
                 
            }
            else
            {
              System.out.println("no found");

            }        
                
        }   
        
        
    }
     public void createStaffRecord(){
         String answer = "y";
       
        while(answer.equals("y") || answer.equals("Y") ){
            Staff staff = new Staff();
            System.out.println("Please enter staff information\n");
            Scanner scanner = new Scanner(System.in);


            System.out.println("ID:");
            staff.setStaffID(getUniqueEmpId());


           System.out.println("Delivery Man Name:");
           String name= scanner.nextLine();
           staff.setStaffName(name);

           System.out.println("Deliver Man Address:");
           String address= scanner.nextLine();
           staff.setStaffAddress(address);

           System.out.println("Delivery Man Phone Number:");
           int phoneNum= scanner.nextInt();
           staff.setStaffPhone(phoneNum);


           System.out.println("Deliver Man Age:");
           int age= scanner.nextInt();
           staff.setStaffAge(age);
           
            System.out.println("Deliver Man Status:Active");
            staff.setStaffStatus("Active");
            
            System.out.println("Deliver Man Password:");
            staff.setStaffPassword(getUniqueEmpPass());
            

            
            
           staffList.add(staff);
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
    }
     public static int getUniqueEmpId() {
        System.out.println( +empNum);
        return empNum++;
    }
     public static int getUniqueEmpPass() {
        System.out.println( +empPass);
        return empPass++;
    }
     
     
  
    
    public void updateInformation(){
       
       Scanner scanner = new Scanner(System.in); 
             System.out.println("Please key in the staff ID you wish to update:");
             int id= scanner.nextInt();
            
        for(int i=0;i<staffList.getNumberOfEntries();i++)
        {
            if(staffList.get(i).getStaffID() == id)
                
            {
                
                Staff staff = staffList.get(i);
                System.out.println("Name:"+staff.getStaffName()); 
                System.out.println("Phone:"+staff.getStaffPhone());
                System.out.println("Address:"+staff.getStaffAddress());
                System.out.println("Age:"+staff.getStaffAge());
                System.out.println("Status:"+staff.getStaffStatus());
               
                    System.out.println("Key in the number you wish to update");
                    System.out.println("1. Name");
                    System.out.println("2. Phone Number");
                    System.out.println("3. Address");
                    System.out.println("4. Age");
                   System.out.println("5. Status");
                int id2= scanner.nextInt();
               
                switch(id2)
                {
                    case 1:
                    {
                    System.out.println("Name:"+staff.getStaffName());
                    System.out.println("Enter a new name:");
                    String name= scanner.next();
                    staff.setStaffName(name);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                    break;
                
                    case 2:
                    {
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Enter a new phone:");
                    int phone= scanner.nextInt();
                    staff.setStaffPhone(phone);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                break;
               
                    case 3:
                    {
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Enter a new Address:");
                    String address= scanner.next();
                    staff.setStaffAddress(address);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                    break;
                
                    case 4:
                    {
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Enter a new age:");
                    int age= scanner.nextInt();
                    staff.setStaffAge(age);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                   break;
                   
                   
                    case 5:
                    {
                    System.out.println("Status:"+staff.getStaffStatus());
                    System.out.println("Enter a new status:");
                    String status= scanner.next();
                    staff.setStaffStatus(status);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                   break;
   
            }
            }
        
        }
   
    }
       public static void main(String args[]){
         MaintainDM DM = new MaintainDM();
         DM.createStaffRecord();
         DM.updateInformation();
         DM.checkStaffInfomation();
     }
    
}

