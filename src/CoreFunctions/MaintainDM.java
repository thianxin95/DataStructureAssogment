
package CoreFunctions;

import ADT.*;
import JavaInterfaces.*;
import java.util.*;
import entity.*;
import java.text.SimpleDateFormat;

public class MaintainDM {
   int empPass;
    int empNum;
    private Staff staff;
     DMADT menuadt = new DMADT();
    
    
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
            
            int n =0;
            double  c= 0.00;
            staff.setStaffWorkStatus("");
            staff.setTotalDelivery(n);
            staff.setTotalDistance(c);
            
            
            

           menuadt.CreateRecord(staff, staffList);

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
     
     public DoublyLinkedList<Staff> UpdateStaffInfo(DoublyLinkedList<Staff> staffList)
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
       main.DisplayStaffRecord(staffList,id);
       
        System.out.println("Key in the value you wish to update");
     
       
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
      
        
        Staff updateStaff = new Staff(id,name,number,address,age,status);
        int temop = id;
        id = id - 1000;
        Staff remove = staffList.GetEntry(id);
         
      
        menuadt.UpdateDM(remove , updateStaff,staffList);
        
        main.DisplayStaffRecord(staffList, temop);
       
        return staffList;
     }
     
     
     public DoublyLinkedList<Staff>DisplayStaffRecord(DoublyLinkedList<Staff> staffList,int staffid)
     {
       Staff staffinfo = new Staff();
      

      for(int i=0;i<staffList.getSize();i++)
        {
           
            if( staffList.GetEntry(i).getStaffID() == staffid)
            {
            
                
                staffinfo= staffList.GetEntry(i);
            
               System.out.println("Name:"+staffList.GetEntry(i).getStaffName()); 
               System.out.println("Phone:"+staffList.GetEntry(i).getStaffPhone());
               System.out.println("Address:"+staffList.GetEntry(i).getStaffAddress());
               System.out.println("Age:"+staffList.GetEntry(i).getStaffAge());
               System.out.println("Status:"+staffList.GetEntry(i).getStaffStatus());
             
                return staffList;
                 
            }
                
        }
        return staffList;
    }
    


    
    public ADT.Queue<Orders> PendingOrder(ADT.Queue<Orders> orderList)
     {
         
        System.out.println("The pending order list to be delivered:");
        System.out.println("List of food order\n");
        System.out.println(String.format("%-10s %-12s %-12s %-17s %-15s %-12s\n", "Order ID", "Customer ID", "Order Name", "Order Product ID", "Product Quantity", "Payment Status"));
        menuadt.RetrievePending(orderList);
        
       
        return orderList;
     }
     
    public DoublyLinkedList<Staff>DailyTransaction( DoublyLinkedList<Staff> staffList)
    {
        DMADT dmadt = new DMADT();
       int totalDelivery=0;
        double totalDistance=0.00;
        System.out.println("Daily Transaction Report\n");
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        System.out.println("Today :"+timeStamp);
        dmadt.DailyTransactionReport(staffList);
        
        for(int i=0;i<staffList.getSize();i++)
             
        {
           
            totalDelivery+=staffList.GetEntry(i).getTotalDelivery();
            totalDistance+=staffList.GetEntry(i).getTotalDistance();
        }
        System.out.print("\t\t\t\t\t\tTotal Delivery:"+totalDelivery+"\t\t");
        System.out.println("Total Distance:"+totalDistance);
        
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
     //   LinkList<Orders> test2list = new LinkList<Orders>();
        

 Staff stafflist = new Staff(1000,"Chim","123","tbr",12,"active",123456,"no",12,20.00);
  Staff stafflist2 = new Staff(1001,"aw","123","tbr",12,"active",123456,"no",80,20.00);
 Staff stafflist3 = new Staff(1002,"dierereru","123","tbr",12,"active",123456,"no",70,20.00);

    testlist.Add(stafflist);
    testlist.Add(stafflist2);
   testlist.Add(stafflist3);
    DM.createStaffRecord(testlist);
    DM.UpdateStaffInfo(testlist);
    DM.DailyTransaction(testlist);
  
   
         
     }
    
}



