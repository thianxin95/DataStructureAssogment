/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;
import ADT.*;
import java.util.*;
import entity.*;



import entity.*;
import java.util.Scanner;
import CoreFunctions.*;
import ADT.*;
/**
 *
 * @author leang
 */
public class MainMenu {
    
    
    Scanner scan = new Scanner(System.in);
    private String LoggedInID = "";
    private LinkList<Restaurant> restaurantList = new LinkList<Restaurant>();
    private LinkList<Menu> menuList = new LinkList<Menu>();
    private LinkList<Customer> customer = new LinkList<Customer>();
    private Customer CustomerLoggedIn = new Customer();
    public void MainMenuFunctions(){
        ///Defining Entity Objects

        int loop = 1;
        
        while(loop == 1){
            System.out.println("Main Menu");
            System.out.println("==========================");
            System.out.println("1.Login to Customer Area");
            System.out.println("2.Login to Restaurant Onwer Area");
            System.out.println("3.Login to Staff Area");
            System.out.println("4.Register an Account");
            System.out.println("5.Exit");
            System.out.println("==========================");
            System.out.print("Enter Your Choice : ");
            int answer = scan.nextInt();
            if(answer == 1 | answer == 2 | answer == 3 | answer == 4 | answer == 5){
                switch(answer){
                    case 1:
                        Login login = new Login();
                        System.out.println("Customer Area");
                        System.out.println("====================");
                        System.out.println("1.Login To Customer Area");
                        System.out.println("2.Register a New Account");
                        System.out.print("Please Enter your Option : ");
                        int loginChoice = scan.nextInt();
                        if(loginChoice == 1){
                            CustomerLoggedIn = login.MainLogin(customer); // Initiate the method of LOGIN, if no success, it suppose to give empty object of CUSTOMER. Please Refer to ADT.
                             if(CustomerLoggedIn.getCustomerName() != ""){ // Check for Login Succesfull
                                    // parse it to Customer choose restaurant.
                                    CustomerMenu cmenu = new CustomerMenu();
                                    //System.out.print("Test Restaurant return : " + restaurantList.get(0).getOwnerName()); 
                                    Restaurant restaurant  = new Restaurant("Restaurant1" , "Petaling Jaya", "Chin", "0102872306");
                                    restaurantList.add(restaurant);
                                    cmenu.CustomerMenu(CustomerLoggedIn, restaurantList); // RestaurantList does not goes to the method, printing nothing atm.
                                    break;
                            }else{
                                 System.out.println("Login Unsuccesful\n\n\n");
                                 break;
                             }
                        }if(loginChoice == 2){
                            customer=login.RegisterAccount(customer);
                            System.out.println("Registration Sucessful");
                            System.out.println(customer.getNumberofSize());
                            int i = customer.getNumberofSize() + 5000;
                            System.out.println("Please REMEMBER that your ID is " + i + "\n\n\n");
                            break;
                        }
                    case 2://Restaurant Area
                        System.out.println("Login to Restaurant Owner Area");
                        //incomplete login function....bypass to RestaurantRegister
                        System.out.println("1. Register Restaurant");
                        System.out.println("2. Add Menu");
                        System.out.println("3. Display Menu");
                        System.out.println("4. Update Menu");
                        System.out.println("5. Delete Menu");
                        System.out.printf("Choice : ");
                        int choice = scan.nextInt();
                        RestaurantRegister RR = new RestaurantRegister();
                        MaintainMenu MM = new MaintainMenu();
                        MenuDisplay MD = new MenuDisplay();
                        if(choice == 1){
                            restaurantList = RR.RestaurantRegistration(restaurantList);
                        }else if(choice == 2){
                            menuList = MM.RegisterMenu(menuList);
                        }else if(choice == 3){
                            MD.DisplayMainMenu(menuList);
                        }else if(choice == 4){
                            menuList = MM.UpdateDetails(menuList);
                        }else if(choice == 5){
                            menuList = MM.DeleteDetails(menuList);
                        }else{
                            System.out.println("Please Select Existed Choice");
                            MainMenuFunctions();
                        }
                        //probably bugged. Wont return List
                        break;
                    case 3:
                        DeliveryManUi dUI = new DeliveryManUi();
                        switch(dUI.MenuDisplay()){
                            case 1:
                                DeliveryManMenu dMenu = new DeliveryManMenu();
                                switch(dMenu.DeliveryManFunctionMenu()){
                                    case 1:
                                        break;
                                    default:
                                        MainMenuFunctions();
                                }
                                loop = 2;
                                break;
                            default:
                                MainMenuFunctions();
                                
                        }
                        
                        
                                
                        break;
 
                        
               /*     
                    case 3:
                        System.out.println("Staff Area");
                        System.out.println("======================");
                        System.out.println("1.Login to Delivery Man Area");
                        System.out.println("2.Login to Staff Management Area");
                        System.out.println("======================\nEnter your choice:");
                        int answer3 = scan.nextInt();
                        if(answer3 == 1){
                              Orders order = new Orders(8001, 5001 , "Fodd" , "aedasd" , 5 , "Paid"); // Fake Object TEST ONLY
                              Orders order2 = new Orders(8002, 5001 , "Fodd" , "aedasd" , 5 , "Paid"); // Fake Object TEST ONLY
                              CircularList<Orders> orderlist = new CircularList<Orders>(); // Fake Object TEST ONLY
                              orderlist.add(order); // Fake Object TEST ONLY
                              orderlist.add(order2); // Fake Object TEST ONLY
                              DeliveryMan logged_DeliveryMan = new DeliveryMan(5001,"Lee", "PUCHONG" , "NIGHT", 3, 0143333333, 24); // Fake Object TEST ONLY
                              DeliveryManMenu delman_menu = new DeliveryManMenu();
                              delman_menu.showDeliveryMenu(logged_DeliveryMan, orderlist); // Pass in FAKE OBJECT
                        }else if(answer3 == 2){
                            // Human Resources department
                                checkStaffInfo staffInfo = new checkStaffInfo();
                                System.out.println("Welcome to Human Resources");
                                System.out.println("===========================");
                                System.out.println("1.View Staff Information");
                                System.out.println("2.Update Staff Record");
                                System.out.println("3.View Pending Order");
                                System.out.println("4.View Transaction Report");
                                System.out.println("Please enter you selection:");
                                int answer5= scan.nextInt();
                                if(answer5 ==1){
                                    
                                staffInfo.checkStaffInfo();
                                }
                                else if(answer5==2){
                                    System.out.println("Hi");
                                }
                                else if(answer5==3)
                                {
                                    Orders order = new Orders(8001, 5001 , "Fodd" , "aedasd" , 5 , "Pending"); 
                                    Orders order2 = new Orders(8002, 5001 , "Fodd" , "aedasd" , 5 , "Pending"); 
                                    List<Orders> orderlist = new ArrayList<Orders>();
                                    orderlist.add(order); 
                                    orderlist.add(order2); 
                                    staffInfo.RetrievePendingOrder(orderlist);
                                }
                                else if(answer5==4){
                                    System.out.println("Hi");
                                }
                               
                              
                        }
                        //incomplete
                        break;
                    case 4:
                        System.out.println();
                        System.out.println();
                        System.out.println("Registration Area");
                        System.out.println("========================");
                        System.out.println("1.Customer Registration");
                        System.out.println("2.Restaurant Owner Registration");
                        System.out.println("Enter Your Choice :");
                        int answer2 = scan.nextInt();
                        if(answer2 == 1){
                            System.out.println("Customer Registration Area");
                            //Customer Registration
                            //1. Call Registration Method
                            //2. Ask Information
                            //3. Return Data back here.(ADD ArrayList)
                        }else if(answer2 == 2){
                            System.out.println("Restaurant Owner Registration Area");
                            //Restaurant Owner Registration Additional Information.
                            //1. Call Registration Method
                            //2. Ask Information
                            //3. Return Data back here.(ADD ArrayList)
                        }else{
                            break;
                        }
                        // Incomplete method. incomplete AccountRegistration methods. */
                    case 5:
                        GoodBye();
                        break;
                }

            }else{
                System.out.println("");
                System.out.println("");
                System.out.println("Sorry, Input Incorrect. Please try again.");
                this.MainMenuFunctions();
            }
        }
    }
    public void GoodBye(){
            System.out.println("Thank you for using the System. Goodbye.");
            System.exit(0);
    }
    
    
    
    public static void main(String args[]){
       MainMenu mainmenu = new MainMenu();
       mainmenu.MainMenuFunctions();
       
    }
}
