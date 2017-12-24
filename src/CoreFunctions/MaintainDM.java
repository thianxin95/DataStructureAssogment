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
    private Staff staff;
    
    
     public DoublyLinkedList<Staff> createStaffRecord(DoublyLinkedList<Staff> staffList){
     empPass=123456 + staffList.getSize();
     empNum=1000 + staffList.getSize();
        
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
           String phoneNum= scanner.nextLine();
           staff.setStaffPhone(phoneNum);


           System.out.print("Deliver Man Age:");
           int age= scanner.nextInt();
           staff.setStaffAge(age);
           
            System.out.println("Deliver Man Status:Active");
            staff.setStaffStatus("Active");
            
            System.out.print("Deliver Man Password:");
            staff.setStaffPassword(getUniqueEmpPass());
            
            
            staff.setStaffWorkStatus("");
            
            
            
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
         
        Scanner scanName = new Scanner(System.in);
        Scanner scanPhone = new Scanner(System.in);
        Scanner scanAddress = new Scanner(System.in);
          Scanner scanAge = new Scanner(System.in);
        Scanner scanStatus = new Scanner(System.in);
      
       Scanner scanid = new Scanner(System.in); 
       System.out.print("Key in the staff ID that you wish to update:");
       int id = scanid.nextInt();
       MaintainDM main = new MaintainDM();
       main.DisplayStaffRecord(staffList,staffid);
       
      
       //int staffID= staffList.GetEntry(i).getStaffID();
      // staff = staffList.GetEntry(staffID-1000);
      
             
        System.out.println("Key in the value you wish to update");
      //  int newid = staff.getStaffID();
       
        System.out.println("Name :");
        String name = scanName.next();
        
        System.out.println("Phone Number:");
        String number = scanPhone.next();
        
        System.out.println("Address:");
        String address = scanAddress.next();
        
        System.out.println("Age:");
        int age = scanAge.nextInt();
        
        System.out.println("Status:");
        String status = scanStatus.next();
      //  int staffID, String staffName, String staffPhone, String address,int staffAge, String staffStatus
        
        Staff updateStaff = new Staff(staffid,name,number,address,age,status);
        id = id - 1001;
        Staff remove = staffList.GetEntry(id);
      
       DMADT menuadt = new DMADT();
        menuadt.UpdateDM(remove , updateStaff,staffList);
       
        return staffList;
     }
     
     
     public DoublyLinkedList<Staff>DisplayStaffRecord(DoublyLinkedList<Staff> staffList,int staffid)
     {
       Staff staffinfo = new Staff();
        
      for(int i=0;i<staffList.getSize();i++)
        {
           
            if( staffList.GetEntry(i).getStaffID() == staffid)
            {
            
                // staffinfo=staffList.GetEntry(i);
                staffinfo= staffList.GetEntry(i);
               // System.out.println("ID:"+staffList.GetEntry(i).getStaffID()); 
               System.out.println("Name:"+staffList.GetEntry(i).getStaffName()); 
              System.out.println("Phone:"+staffList.GetEntry(i).getStaffPhone());
               System.out.println("Address:"+staffList.GetEntry(i).getStaffAddress());
               System.out.println("Age:"+staffList.GetEntry(i).getStaffAge());
               System.out.println("Status:"+staffList.GetEntry(i).getStaffStatus());
             // System.out.print((i+1) + ". \n" +staffinfo.toString());
           //   
               
                return staffList;
                 
            }
                
        }
        return staffList;
    }
    


    
    public ADT.Queue<Orders> PendingOrder(ADT.Queue<Orders> orderList)
     {
         DMADT dmadt = new DMADT();
        System.out.println("The pending order list:");
        System.out.println("List of food order\n");
        System.out.println(String.format("%-10s %-12s %-12s %-12s %-12s %-12s\n", "Order ID", "Customer ID", "Order Name", "Order Product ID", "Product Quantity", "Payment Status"));
        dmadt.RetrievePending(orderList);
        
       
        return orderList;
     }
     
    public DoublyLinkedList<Staff>DailyTransaction( DoublyLinkedList<Staff> staffList)
    {
        DMADT dmadt = new DMADT();
      
        System.out.println("Daily Transaction Report\n");
        System.out.println(String.format("%-10s %-12s %-12s %-12s\n", "Delivery Man ID", "Delivery Man", "Total Delivery ", "Total Distance"));
        dmadt.DailyTransactionReport(staffList);
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
        LinkList<Orders> test2list = new LinkList<Orders>();
        
  // int staffID, String staffName, String staffPhone, String address,int staffAge, String staffStatus, int staffPassword, String staffWorkStatus,int totalDelivery, double totalDistance
  Staff stafflist = new Staff(1001,"Chim","123","tbr",12,"active",123456,"no",12,20.00);
  Staff stafflist2 = new Staff(1002,"aw","123","tbr",12,"active",123456,"no",50,20.00);
 Staff stafflist3 = new Staff(1003,"dierereru","123","tbr",12,"active",123456,"no",80,20.00);
    // Orders order= new Orders(5001,1001,"niama","2gfg",2,"Pending");
   //  Orders order2= new Orders(5002,1002,"niama","2gfg",2,"Pending");
    // Orders order3= new Orders(5031,1003,"gg","2gfg",2,"No");
    
       //test2list.add(order);
      //  test2list.add(order2);
       // test2list.add(order3);
      testlist.Add(stafflist);
        testlist.Add(stafflist2);
           testlist.Add(stafflist3);
       //  DM.createStaffRecord(testlist);
       System.out.println(testlist.GetEntry(0).getStaffID());
       DM.UpdateStaffInfo(0, testlist);
      //  DM.CheckInfoStaff(testlist);
    //   DM.PendingOrder(test2list);
  //  DM.DailyTransaction(testlist);
  //DM.DisplayStaffRecord(testlist, 1001);
         
         
     }
    
}

