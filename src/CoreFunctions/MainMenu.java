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
    private LinkList<Staff> staffList = new LinkList<Staff>();
    private LinkList<DeliveryMan> deliveryManList = new LinkList<DeliveryMan>();
    private LinkedStack<FoodDelivered> foodDeliveredList = new LinkedStack<FoodDelivered>();
    //private Queue<Orders> orderList = new Queue<Orders>();
    
    ClearScreen clear = new ClearScreen();
    
    Staff loggedinstaff = new Staff();
    DeliveryManMenu dMenu = new DeliveryManMenu();
    //DeliveryManADT dADT = new DeliveryManADT();
    private void DefaultData(){

        staffList.add(new Staff(1000, "Lee Thian Xin", "0147774456", "Kuala Lumpur",18, "", 123456, ""));
        staffList.add(new Staff(1001, "Dicky", "0177774456", "Kuala Kangsar",18, "", 122222, ""));
    }
    
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
                        System.out.println("2. Login Restaurant");
                        System.out.println("3. Back to Main Menu");
                        System.out.printf("Choice : ");
                        int choice = scan.nextInt();
                        
                        RestaurantRegister RR = new RestaurantRegister();
                        MaintainMenu MM = new MaintainMenu();
                        MenuDisplay MD = new MenuDisplay();
                        
                        if(choice == 1){
                            restaurantList = RR.RestaurantRegistration(restaurantList);
                        }else if(choice == 2){
                            System.out.printf("Log in ID : R");
                            Scanner scanner = new Scanner(System.in);
                            int id = scanner.nextInt();
                            
                            for(int i = 0 ; i < restaurantList.getNumberofSize() ; i++){
                                if(id == restaurantList.get(i).getIdNumber()){
                                    System.out.println("Currently Log In : " + restaurantList.get(i).getRestaurantName());
                                    System.out.println("1. Add Menu");
                                    System.out.println("2. Display Menu");
                                    System.out.println("3. Update Menu");
                                    System.out.println("4. Delete Menu");
                                    System.out.println("5. Log Out");
                                    choice = scan.nextInt();
                                    
                                    if(choice == 1){
                                        menuList = MM.RegisterMenu(menuList,restaurantList.get(i).getRestaurantName());
                                    }else if(choice == 2){
                                        MD.DisplayMainMenu(menuList,restaurantList.get(i).getRestaurantName());
                                    }else if(choice == 3){
                                        menuList = MM.UpdateDetails(menuList,restaurantList.get(i).getRestaurantName());
                                    }else if(choice == 4){
                                        menuList = MM.DeleteDetails(menuList,restaurantList.get(i).getRestaurantName());
                                    }else if(choice == 5){
                                        MainMenuFunctions();
                                    }else{
                                        System.out.println("Please Select Existed Choice");
                                        MainMenuFunctions();
                                    }
                                }
                            }
                        }else if(choice == 3){
                            MainMenuFunctions();
                        }else{
                            System.out.println("Please Select Existed Choice");
                            MainMenuFunctions();
                        }
                        //probably bugged. Wont return List
                        break;
                    case 3:
                        System.out.pri
                        DeliveryManUi dUI = new DeliveryManUi();
                        switch(dUI.MenuDisplay()){
                            case 1:                                                   
                                loggedinstaff = dMenu.DeliveryManLogin(staffList);
                                dMenu.DeliveryManFunctionMenu(loggedinstaff);
                                int couter = 1;
                                while(couter ==1){
                                System.out.println("================Functions===================");
                                System.out.println("1.Clock in");
                                System.out.println("2.Check order detail");
                                System.out.println("3.Clock out");
                                System.out.println("4.Log out");
                                int Selection;
                                    do{
                                          System.out.println("Please key in your selection(integer): ");
                                          try{
                                              Selection = scan.nextInt();
                                          }catch(Exception ex){
                                          System.out.println("The selection you key in must be an integer."); 
                                          System.out.println("Please enter your selection:");
                                          scan.nextLine();
                                          Selection = 0;
                                          }
                                          if(Selection<1 || Selection>4){
                                              System.out.println("Integer out of range!");
                                              System.out.println("Please key in your selection");
                                          }
                                      }while(Selection<1 || Selection>4);

                                    if(Selection ==1){
                                        String wStatus = "Available";
                                        if(wStatus!= loggedinstaff.getStaffWorkStatus()){                                                                                    
                                        dMenu.ClockIn(loggedinstaff, deliveryManList);
                                        }else{
                                            clear.clearScreen();
                                            System.out.println("Operation denied!");
                                            System.out.println("You had already logged in.");
//                                            System.out.println(deliveryManList.get(0));         
//                                            System.out.println(deliveryManList.get(1));
                                        }
                                                                               
                                    }else if(Selection == 2){
                                        
                                        dMenu.DisplayOrder();                                        
                                    }else if(Selection == 3){
                                        String wStatus = "Available";
                                        String wStatus1= "Break";
                                        if(wStatus == loggedinstaff.getStaffWorkStatus() || wStatus1 == loggedinstaff.getStaffWorkStatus() ){
                                        dMenu.ClockOut(loggedinstaff, deliveryManList);
                                        }else{
                                            clear.clearScreen();
                                            System.out.println("Operation denied!");
                                            System.out.println("You did not logged in.");
                                        }
                                        
                                        
                                    }else if(Selection == 4){
                                        couter = 2;
                                        System.out.println("You had logged out the system.");
                                        MainMenuFunctions();
                                    }
                                    
                                }                                
                                break;
                                
                            case 2:
//                                DeliveryManMenu dMenu1 = new DeliveryManMenu();
//                                dMenu1.test();
                                
                                break;
                            default:
                                MainMenuFunctions();
                                
                                break;
                                
                        }
                        break;

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
       mainmenu.DefaultData();
       mainmenu.MainMenuFunctions();
       
    }
}
