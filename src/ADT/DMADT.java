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
    public ArrayListADT<Staff> CreateRecord(ArrayListADT<Staff> staffList) {
        empPass = 12345;
        empNum = 1000 + staffList.getNumberOfEntries();
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
       
       return staffList;
    }

    @Override
    
    public ArrayListADT<Staff> CheckDMInfo( ArrayListADT<Staff> staffList) {
         
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

    @Override
    public ArrayListADT<Staff> UpdateDM( ArrayListADT<Staff> staffList) {
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
                System.out.print("Your Selection is:");
                int id2= scanner.nextInt();
               
                switch(id2)
                {
                    case 1:
                    {
                    System.out.println("Name:"+staff.getStaffName());
                    System.out.print("Enter a new name:");
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
                    System.out.print("Enter a new phone:");
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
                    System.out.print("Enter a new Address:");
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
                    System.out.print("Enter a new age:");
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
                    System.out.print("Enter a new status:");
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
     
     public static void main(String args[])
     {
            DMADT lol = new DMADT();
//            /int staffID, String staffName, int staffPhone, String address,int staffAge, String staffStatus, int staffPassword
            Staff teststaff1 = new Staff(1000, "Test1" , 01036065 , "ABCD" , 12 , "Active", 123456);
            Staff teststaff2 = new Staff(1001, "Test2" , 1234 , "ABCD" , 12 , "Active", 123456);
            ArrayListADT<Staff> testlist = new ArrayListADT<Staff>();
           testlist.add(teststaff1);
           testlist.add(teststaff2);
          testlist = lol.CreateRecord(testlist);
           testlist = lol.UpdateDM(testlist); //leang hlp me check update also
           
            testlist=lol.CheckDMInfo(testlist);
            
     }
    
}
