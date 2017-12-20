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
    public ArrayListADT<Staff> CreateRecord(Staff staff,ArrayListADT<Staff> staffList) {
       staffList.add(staff);
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
    public Staff UpdateDM( int staffid,ArrayListADT<Staff> staffList) {
         
        for(int i=0;i<staffList.getNumberOfEntries();i++)
        {
            if(staffList.get(i).getStaffID() == staffid){
            return staffList.get(i);
            }
             // return staffList;
                
        
    }
          Staff updateRecord = new Staff();
            return updateRecord;
    }
    
     
     public static void main(String args[])
     {
            DMADT damamt = new DMADT();
//            /int staffID, String staffName, int staffPhone, String address,int staffAge, String staffStatus, int staffPassword
            Staff teststaff1 = new Staff(1000, "Test1" , 01036065 , "ABCD" , 12 , "Active", 123456);
            Staff teststaff2 = new Staff(1001, "Test2" , 1234 , "ABCD" , 12 , "Active", 123456);
            ArrayListADT<Staff> testlist = new ArrayListADT<Staff>();
           testlist.add(teststaff1);
           testlist.add(teststaff2);
        //  testlist = lol.CreateRecord(testlist);
          // testlist = lol.UpdateDM(testlist);
           
            //testlist=lol.CheckDMInfo(testlist);
            
     }
    
}
