/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;


import ADT.DeliveryManADT;
import ADT.LinkList;
import entity.DeliveryMan;
import entity.Orders;
import entity.Staff;
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
    //private LinkList<DeliveryMan> deliveryManList = new LinkList<DeliveryMan>();
    Scanner scanner = new Scanner(System.in);
    private DeliveryMan DeliveryManLoggedIn = new DeliveryMan();
    Staff staff = new Staff();
     //private LinkList<Staff> stafflist = new LinkList<Staff>();
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
        System.out.println("    Clock in at : "+dateFormat.format(dateIn));
        id = staff.getStaffID();
        name = staff.getStaffName();
        in = dateFormat.format(dateIn);
        DeliveryMan dMan = new DeliveryMan(id, name, in, out);
        deliveryManList.add(dMan);
         //test area
        System.out.println("size:"+deliveryManList.getNumberofSize());
        System.out.println(deliveryManList.get(0));
        System.out.println(deliveryManList.get(1));        
        staff.setStaffWorkStatus("Available");
        System.out.println(staff.getStaffWorkStatus());
  
       
        
    }
    
    public void ClockOut(Staff staff, LinkList<DeliveryMan> deliveryManList){
        clear.clearScreen();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dateOut = new Date();
        clear.clearScreen();
        System.out.println("GoodBye "+ staff.getStaffName()+"!");
        System.out.println("Have a nice day...");
        System.out.println("You clock out at : "+dateFormat.format(dateOut));
        staff.setStaffStatus("Not onDuty");
        System.out.println("Work status changed to " + staff.getStaffStatus() +"...");
        int i = deliveryManList.getNumberofSize();
        int j = i - 1;
        System.out.println(i);
        String checkOut = dateFormat.format(dateOut);
        
        //deliveryManList.get(i).setCheckOut(checkOut);
        deliveryManList.get(j).setCheckOut(checkOut);
      // deliveryManList.get().setCheckOut(checkOut);
        System.out.println(deliveryManList.get(0));
        System.out.println(i);
        System.out.println(deliveryManList.get(1));
        System.out.println(i);
//        System.out.println(deliveryManList.get(2));
//        System.out.println(i);

    }
    
    public void DisplayOrder(){
        System.out.println("NO ORDER YET");
    }
    
    
   
   public Staff DeliveryManLogin(LinkList<Staff> stafflist){
       //deliveryManList.add(0,new DeliveryMan (1000, "123456", "Lee Thian Xin", "0143468777", "Kuala Lumpur", 18, "", "", ""));
      // Staff staff1 = new Staff(1000, "Lee Thian Xin", 7774456, "Kuala Lumpur",18, "", 123456);
       //Staff staff2 = new Staff(1001, "Dicky", 7774456, "Kuala Kangsar",18, "", 122222);
       //stafflist.add(staff1);
       //stafflist.add(staff2);
       int successLogin = 0;
       int authorization = 0;
       while(successLogin == 0){
            System.out.println("Please key in your User ID: ");
            int userID = scanner.nextInt();
            System.out.println("Please key in your password: ");
            int pass = scanner.nextInt();
        int i= 0;
        for(i=0;i<stafflist.getNumberofSize();i++){
            //if(authorization < 2){
             
                if(userID == stafflist.get(i).getStaffID() && pass == stafflist.get(i).getStaffPassword()){
                    System.out.println("Logged In"); 
                    user = stafflist.get(i);
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
