/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;


import ADT.DeliveryManADT;
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
    private DeliveryManADT<DeliveryMan> deliveryManList = new DeliveryManADT<DeliveryMan>();
    Scanner scanner = new Scanner(System.in);
    private DeliveryMan DeliveryManLoggedIn = new DeliveryMan();
    
    public DeliveryManMenu(){
        
    }

    public int DeliveryManFunctionMenu(){
        
        Staff staff = new Staff(1000, "Lee Thian Xin", 7774456, "Kuala Lumpur",18, "", 123456);//Temporary Code
        
        clear.clearScreen();
        System.out.println("        Hello "+ staff.getStaffName()+"!");
        System.out.println("       Welcome to delivery man area");
        System.out.println("            Have a nice day...");
        System.out.println("================Functions===================");
        System.out.println("1.Check order detail");
        System.out.println("2.Exit");
        
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
          return Selection;
        
        
        
        
    }
    
   public void showDeliveryMenu(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        boolean validation = true;
        String workStatus = "";
          do{ 
         //System.out.println("My Size:>>>"+DeliveryMan.size());
         System.out.println("|****************************************************|");
         System.out.println("");
         //System.out.println(deliveryManList.getEntry(1));
         System.out.println("    Welcome       "+deliveryManList.getEntry(0).getStaffName()+ "! ");
         //System.out.println("    Status      : "+DeliveryMan.getEntry(0).getStaffStatus());
         System.out.println("    Clock in at : "+dateFormat.format(date));
         //DeliveryMan.get(0).setCheckIn(dateFormat.format(date));
         //System.out.println("    Status      : "+ workStatus);
         System.out.println("");
         System.out.println("|****************************************************|");      
        System.out.println("Food Delivery Menu Function List: ");
        System.out.println("1.View Current Food Order");
        System.out.println("Delivery Man Function List: ");
        System.out.println("2.View Working hour");
        System.out.println("3.Change Working Status");
        System.out.println("4.Clock out");
        System.out.println("5.Return to main menu");
        
        System.out.print("Enter Your Choice: ");
        int answer = scanner.nextInt();
        if(answer == 1 | answer == 2 | answer == 3 | answer == 4 | answer == 5){
            switch(answer){
//                case 1:
//                      System.out.println("");
//                      System.out.println("");
//                      System.out.println("List of ordered food detail: \n");
//                    
//                    System.out.println(String.format("%-10s %-12s %-12s %-12s %-12s %-12s\n", "Order ID", "Customer ID", "Order Name", "Order Product ID", "Product Quantity", "Payment Status"));
//                  for (int i = 0; i < orderlist.size(); i++){
//                          System.out.println(orderlist.get(i));
//
//                  }
//                  System.out.println("1.Back to Food Delivery Menu");
//                  System.out.print("Enter Your Choice: ");
//                  int answer1 = scan.nextInt();
//                  if(answer1 == 1){
//               
//                      validation = false;
//                      System.out.println("\n\n");
//                      break;
//                  }else
//                      
//                    break;
//                case 2:
//                    StaffWorkingHour hour = new StaffWorkingHour();
//                    hour.StaffWorkingHourFunction();
//                    break;
                case 3:
                    int counter1 = 0;
                    while(counter1 == 0){                                        
                    System.out.println("Change current work status");
                    System.out.println("1.Available");
                    System.out.println("2.Delivery");
                    System.out.println("3.Break");
                    System.out.println("Enter Your Choice: ");
                    int answer3 = scanner.nextInt();
                    if(answer3 == 1 ){                   
                    workStatus = "Avalilable";
                    System.out.println("\n\nWork status change successful!");
                    counter1 = 1;
                    validation = false;
                    }else if(answer3 == 2){
                        
                    workStatus = "Delivery";
                    System.out.println("\n\nWork status change successful!");
                    counter1 = 1;
                    validation = false;
                    }else if(answer3 == 3){

                    workStatus = "Break";
                    System.out.println("\n\nWork status change successful!");
                    counter1 = 1;
                    validation = false;
                                                              
                    }else{
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Sorry, Input Incorrect. Please try again.");
                    
                    
                }       
                    }
                    break;
                case 4:
                    DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date1 = new Date();
                    int couter = 0;
                    
                    while(couter == 0){
                    System.out.println("Clocking out the system. Are you sure?");
                    System.out.println("1.Yes");
                    System.out.println("2.Undo");
                    System.out.print("Enter Your Choice: ");
                    int answer2 = scanner.nextInt();
                    if(answer2 == 1){
                        System.out.println("|****************************************************|");
                        System.out.println("");
                       // System.out.println("    Good Bye "+DeliveryMan.get(0).getStaffName()+ "! ");
                        //System.out.println("    Shift : "+DeliveryMan.get(0).getDeliveryManShift());
                        System.out.println("    Clock out at : " + dateFormat1.format(date1));
                       // deliveryMan.setCheckOut(dateFormat1.format(date1));
                        System.out.println("");
                        System.out.println("|****************************************************|\n\n");
                        
                        couter = 1;
                    
                    
                     MainMenu menu = new MainMenu();
                       menu.MainMenuFunctions();
                    
                    }else if(answer2 == 2){
                        validation = false;
                        System.out.println("\n\n");
                        couter = 1;
                    }
                    }
                    
                    break;
                    case 5:
                       MainMenu menu = new MainMenu();
                       menu.MainMenuFunctions();
                        
                    break;
            }
            
            
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Sorry, Input Incorrect. Please try again.");
            validation = false;
        }
        }while(!validation);

    }
   
   public void DeliveryManLogin(){
       //deliveryManList.add(0,new DeliveryMan (1000, "123456", "Lee Thian Xin", "0143468777", "Kuala Lumpur", 18, "", "", ""));
       deliveryManList.add(1,new DeliveryMan (1001, "122222", "Dicky", "0143468777", "Kuala Lumpur", 18, "", "", ""));
       int successLogin = 0;
       int authorization = 0;
       while(successLogin == 0){
            System.out.println("Please key in your User ID: ");
            String userID = scanner.nextLine();
            System.out.println("Please key in your password: ");
            String pass = scanner.nextLine();
        int i= 0;
            if(authorization < 2){
                for(i=0;i<deliveryManList.getNumberOfEntries();i++){
                    if (deliveryManList.getEntry(i)==null){
                        break;
                    }
                if(userID.equals(deliveryManList.getEntry(i).getStaffID()) && pass.equals(deliveryManList.getEntry(i).getPassword())){
                    System.out.println("Logged In"); 
                    successLogin = 1;
                    authorization = 0;
                    showDeliveryMenu();
                }
                else
                    System.out.println("Invalid Input! Please try again.");
                    authorization++;
                  }
                }
            else{
                System.out.println("Your account has been suspended.\n");
                MainMenu menu = new MainMenu();
                menu.MainMenuFunctions();
            }

           
       }
       
       
   }
}
