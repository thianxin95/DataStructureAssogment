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
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date dateIn = new Date();
//        int id;
//        String name;
//        String in;
//        String out = "Pending";
        
        clear.clearScreen();
        System.out.println("        Hello "+ staff.getStaffName()+"!");
        System.out.println("       Welcome to delivery man area");
        System.out.println("            Have a nice day...");
       // System.out.println("    Clock in at : "+dateFormat.format(dateIn));
//        System.out.println("================Functions===================");
//        System.out.println("1.Clock in");
//        System.out.println("2.Check order detail");
//        System.out.println("3.Clock out.");
        
        
//        id = staff.getStaffID();
//        name = staff.getStaffName();
//        in = dateFormat.format(dateIn);
//        DeliveryMan dMan = new DeliveryMan(id, name, in, out);
//        deliveryManList.add(dMan);
//        //test area
//       // System.out.println("size:"+deliveryManList.getNumberofSize());
//        //System.out.println(deliveryManList.get(1));
//        //System.out.println(deliveryManList.get(1));
//       // System.out.println(staff.getStaffStatus());
//        System.out.println(stafflist.getNumberofSize());
//        for(int a = 1;a<=stafflist.getNumberofSize();a++){
//            System.out.println("here"+stafflist.get(a).getStaffName());
//            System.out.println("here"+staff.getStaffName());
//            if(stafflist.get(a).getStaffName().equals(staff.getStaffName())){
//                stafflist.get(a).setStaffStatus("Available");
//                System.out.println(stafflist.get(a).getStaffStatus());
//            }
//        }
//        System.out.println(staff.getStaffStatus());
       
//        int Selection;
//        do{
//              System.out.println("Please key in your selection(integer): ");
//              try{
//                  Selection = scanner.nextInt();
//              }catch(Exception ex){
//              System.out.println("The selection you key in must be an integer."); 
//              System.out.println("Please enter your selection:");
//              scanner.nextLine();
//              Selection = 0;
//              }
//              if(Selection<1 || Selection>3){
//                  System.out.println("Integer out of range!");
//                  System.out.println("Please key in your selection");
//              }
//          }while(Selection<1 || Selection>3);
//          return Selection;                           
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
        System.out.println(staff.getStaffStatus());
        staff.setStaffStatus("Available");
//        System.out.println(staffList.getNumberofSize());
//        for(int a = 1;a<=staffList.getNumberofSize();a++){
//            System.out.println("here "+staffList.get(a).getStaffName());
//            System.out.println("here "+staff.getStaffName());
//            if(staffList.get(a).getStaffName().equals(staff.getStaffName())){
//                staffList.get(a).setStaffStatus("Available");
//                System.out.println(staffList.get(a).getStaffStatus());
//            }
//        }
        System.out.println(staff.getStaffStatus());
//        int Selection;
//        do{
//              System.out.println("Enter 1 to continue... ");
//              try{
//                  Selection = scanner.nextInt();
//              }catch(Exception ex){
//              System.out.println("The selection you key in must be an integer."); 
//              System.out.println("Please enter your selection:");
//              scanner.nextLine();
//              Selection = 0;
//              }
//              if(Selection<1 || Selection>1){
//                  System.out.println("Integer out of range!");
//                  System.out.println("Please key in your selection");
//              }
//          }while(Selection<1 || Selection>1);
//          return Selection;
        
    }
    
    public void ClockOut(Staff staff, LinkList<DeliveryMan> deliveryManList){
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
