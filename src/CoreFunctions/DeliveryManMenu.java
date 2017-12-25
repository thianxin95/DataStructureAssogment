/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;


//import ADT.DeliveryManADT;
import ADT.DoubleLinkListADT;
import ADT.LinkList;
import ADT.LinkedStack;
import ADT.Queue;
import entity.Customer;
import entity.DeliveryMan;

import entity.Orders;
import entity.Staff;
import entity.TrackOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DeliveryManMenu {
    ClearScreen clear = new ClearScreen();
    Scanner scanner = new Scanner(System.in);
    private DeliveryMan DeliveryManLoggedIn = new DeliveryMan();
   // Staff staff = new Staff();
     private Staff user;
    
     
    public DeliveryManMenu(){
        
    }

    public void DeliveryManFunctionMenu(Staff staff){        
        clear.clearScreen();
        System.out.println("        Hello "+ staff.getStaffName()+"!");
        System.out.println("       Welcome to delivery man area");
        System.out.println("            Have a nice day...");                          
    }
    
    public void ClockIn(Staff staff, LinkList<DeliveryMan> deliveryManList){
        clear.clearScreen();
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dateIn = new Date();
        int id;
        String name;
        String in;
        String out = "Pending";
        System.out.println("    Clock in Successful!!");
        System.out.println("    Clock in at : "+dateFormat.format(dateIn));
        id = staff.getStaffID();
        name = staff.getStaffName();
        in = dateFormat.format(dateIn);
        DeliveryMan dMan = new DeliveryMan(id, name, in, out);
        deliveryManList.add(dMan);
         //test area
//        System.out.println("size:"+deliveryManList.getNumberofSize());
//        System.out.println(deliveryManList.get(0));
//        System.out.println(deliveryManList.get(1));        
        staff.setStaffWorkStatus("Available");
//        System.out.println(staff.getStaffWorkStatus());                 
    }
    
    public void PersonalDetail(Staff staff, LinkList<DeliveryMan> deliveryManList){
        clear.clearScreen();
        System.out.println("===========Presonal information===========");
        System.out.println("ID           : " + staff.getStaffID());
        System.out.println("Name         : " + staff.getStaffName());
        System.out.println("Phone number : " + staff.getStaffPhone());
        System.out.println("Home address : " + staff.getStaffAddress());
        System.out.println("\n");
        System.out.println("=======Clock in & clock out record=======");
//        int i = deliveryManList.getNumberofSize();
//        int j = i - 1;
    
     System.out.println("Name                 ID                      Check In Date            Check out Date");
    
        for(int a = 0; a<deliveryManList.getNumberofSize(); a++){
            if(staff.getStaffName() == deliveryManList.get(a).getStaffName()){
                
            System.out.println(deliveryManList.get(a));
        }
        }
        

    }
    
    public void Break(Staff staff){
        clear.clearScreen();
        System.out.println("Do you want to set your work status to break?");
        System.out.println("1.Yes");
        System.out.println("2.No");
            int Selection;
        do{
              System.out.println("Please key in your selection(integer): ");
              try{
                  Selection = scanner.nextInt();
              }catch(Exception ex){
              System.out.println("The selection you key in must be an integer."); 
              System.out.println("Please enter your selection:");
              scanner.nextLine();
              Selection = 0;
              }
              if(Selection<1 || Selection>2){
                  System.out.println("Integer out of range!");
                  System.out.println("Please key in your selection");
              }
          }while(Selection<1 || Selection>2);
        if(Selection == 1){
            clear.clearScreen();
            staff.setStaffWorkStatus("Break");
            System.out.println("Work status change successful!");
            System.out.println(staff.getStaffWorkStatus());
            
        }else if(Selection == 2){
            clear.clearScreen();
            System.out.println("Back to previous page...");
        }
        
        
    }
    
    public void ClockOut(Staff staff, LinkList<DeliveryMan> deliveryManList){
        clear.clearScreen();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dateOut = new Date();
        clear.clearScreen();
        System.out.println("GoodBye "+ staff.getStaffName()+"!");
        System.out.println("Have a nice day...");
        System.out.println("You clock out at : "+dateFormat.format(dateOut));
        staff.setStaffWorkStatus("Not on duty");
        System.out.println("Work status changed to " + staff.getStaffWorkStatus() +"...");
        String checkOut = dateFormat.format(dateOut);        

        String status = "Pending";
        for(int a = 0; a<deliveryManList.getNumberofSize(); a++){

            if(staff.getStaffName() == deliveryManList.get(a).getStaffName() && status == deliveryManList.get(a).getCheckOut()){
                deliveryManList.get(a).setCheckOut(checkOut);
                
//                System.out.println("LOOK AT HERE");
            }
        
        }
        //        System.out.println(deliveryManList.get(0));
//        System.out.println(i);
//        System.out.println(deliveryManList.get(1));
//        System.out.println(i);


    }
    
    
    public void DisplayOrder(Staff staff, Queue<Orders> orderlist, LinkList<Customer> customer){
            clear.clearScreen();
            System.out.println("Order available!");
//            System.out.println("Order ID            : " + orderlist.getFront().getOrderID());
//            System.out.println("Customer ID         : " + orderlist.getFront().getOrderCustomerID());
//            System.out.println("Name of order       : " + orderlist.getFront().getOrderName());
//            System.out.println("Product ID          : " + orderlist.getFront().getOrderProductID());
//            System.out.println("Quantity of product : " + orderlist.getFront().getProductQuantity());
//            System.out.println("Name of Restaurant  : " + orderlist.getFront().getRestaurantName());

//            int cusID = orderlist.getFront().getOrderCustomerID();
//            System.out.println(cusID);
//              System.out.println(orderlist.getFront().getOrderCustomerID());
//              System.out.println(orderlist.getEntry(2).getOrderCustomerID());
              
              System.out.println("========================================================================================");
              System.out.println("Order ID   Customer ID    Order Item           Item ID      Quantity     Restaurant Name");
              if(orderlist.getSize()>1){
              for(int i = 1; i<orderlist.getSize(); i++){
                  if(orderlist.getFront().getOrderCustomerID() == orderlist.getEntry(i).getOrderCustomerID()){
                      System.out.println(orderlist.getEntry(i));
                  }
              }
              }else if(orderlist.getSize() == 1){
                  System.out.println(orderlist.getFront());
              }
              System.out.println("========================================================================================");

              
              for(int j = 0; j<customer.getNumberofSize(); j++){
                  if(orderlist.getFront().getOrderCustomerID() == customer.get(j).getCustomerID())
                      System.out.println("Customer address: " + customer.get(j).getCustomerAddress());                                       
              }              
    }
    
    public void DeliveryOrder(Staff staff, Queue<Orders> orderlist, LinkList<TrackOrder> trackOrderList){
        int id = orderlist.getFront().getOrderCustomerID();
        System.out.println(id);//for verify purpose
        
        
        
        if(orderlist.getSize()>1){
        do{
            orderlist.dequeue();
        }while(id == orderlist.getFront().getOrderCustomerID());
        }else if(orderlist.getSize() == 1){
            orderlist.dequeue();
        }
        System.out.println(orderlist.getFront());//for verify purpose
                      
        System.out.println("Please key in the distance of the route:");
        double route = scanner.nextDouble();
        double remainTime;
        remainTime = route * 2;
        TrackOrder tOrder = new TrackOrder(id, remainTime);
        trackOrderList.add(tOrder);                
        double totalRoute = 0;
        totalRoute = staff.getTotalDistance();       
        totalRoute = route + totalRoute;
        int totalDelivered = 0;
        totalDelivered = staff.getTotalDelivery();
        totalDelivered++;
        staff.setTotalDelivery(totalDelivered);
        staff.setTotalDistance(totalRoute);
        //System.out.println("Enter 1 if you picked up the order item: ");
            int Selection1;
            do{
                  System.out.println("Enter 1 if you picked up the order item: ");
                  try{
                      Selection1 = scanner.nextInt();
                  }catch(Exception ex){
                  System.out.println("The selection you key in must be an integer."); 
                  System.out.println("Please enter your selection:");
                  scanner.nextLine();
                  Selection1 = 0;
                  }
                  if(Selection1<1 || Selection1>1){
                      System.out.println("Integer out of range!");
                      System.out.println("Please key in your selection");
                  }
              }while(Selection1<1 || Selection1>1);
            if(Selection1 == 1){
                        //System.out.println("Enter 1 if you had delivered the order item: ");
                           int Selection;
                    do{
                          System.out.println("Enter 1 if you had delivered the order item: ");
                          try{
                              Selection = scanner.nextInt();
                          }catch(Exception ex){
                          System.out.println("The selection you key in must be an integer."); 
                          System.out.println("Please enter your selection:");
                          scanner.nextLine();
                          Selection = 0;
                          }
                          if(Selection<1 || Selection>1){
                              System.out.println("Integer out of range!");
                              System.out.println("Please key in your selection");
                          }
                      }while(Selection<1 || Selection>1);
                                if(Selection == 1){
                                    clear.clearScreen();
                                    System.out.println("******Order successful delivered******");
                                }
                
            }
        
//        System.out.println(staff.getStaffName());
//        System.out.println(staff.getTotalDistance());
//        System.out.println(staff.getTotalDelivery());                      
    }
    
   public void trackOrder(LinkList<TrackOrder> trackOrderList){
       int id;
       System.out.println("Please key in your Customer ID: ");
       id = scanner.nextInt();
       System.out.println("==================================");
       System.out.println("ID          Expect reach time(Min)");
       for(int i = 0; i <trackOrderList.getNumberofSize(); i++){
           if(id == trackOrderList.get(i).getCustomerID()){
               System.out.println(trackOrderList.get(i));
           }
       }
       
       
   } 
   
   public Staff DeliveryManLogin(DoubleLinkListADT<Staff> staffList){
//       clear.clearScreen();
       int successLogin = 0;
       int authorization = 0;
       while(successLogin == 0){
            System.out.println("Please key in your User ID: ");
            int userID = scanner.nextInt();
            System.out.println("Please key in your password: ");
            int pass = scanner.nextInt();
        int i= 0;
        for(i=0;i<staffList.getSize();i++){
            //if(authorization < 2){
             
                if(userID == staffList.GetEntry(i).getStaffID() && pass == staffList.GetEntry(i).getStaffPassword()){
                    System.out.println("Logged In"); 
                    user = staffList.GetEntry(i);
                    successLogin = 1;
                    authorization = 0;
                    
                }
//                else
//                    System.out.println("Invalid Input! Please try again.");
//                    authorization++;
//                  
//                }
//            else{
//                System.out.println("Your account has been suspended.\n");
//                MainMenu menu = new MainMenu();
//                menu.MainMenuFunctions();
//            }

        }
       }
       
       return user;
   }
   
    
   
}