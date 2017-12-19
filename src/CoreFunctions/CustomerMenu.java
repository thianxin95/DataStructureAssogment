/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;



import CoreFunctions.*;
import entity.*;
import ADT.*;
import java.util.Scanner;
/**
 *
 * @author leang
 */
public class CustomerMenu {
    
    

    
    Scanner scan = new Scanner(System.in);
    ArrayListADT<Items> itemlist = new ArrayListADT<Items>(); 
    public void CustomerMenu(Customer customer, ArrayListADT<Restaurant> restaurantList){
        String details = "";
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Welcome back,"+ customer.getCustomerName() );
        System.out.println();
        if(restaurantList.getNumberOfEntries()!=0){
            System.out.println("Here is a list of our current restaurant");
            for(int i = 0; i < restaurantList.getNumberOfEntries(); i ++){
                details += (i + 1) + ". " + restaurantList.get(i) + "\n";
            }
                System.out.println(details);
                System.out.print("Please choose your desired restaurant:");
                int answer = scan.nextInt();
                if(answer <= restaurantList.getNumberOfEntries()+ 1 && answer>=0 ){
                    int choice = answer-1;
                    //System.out.println(restaurantList.get(choice) + "\n");
                    System.out.print("You have choosed : " + restaurantList.get(choice).getRestaurantName() + "\n\n");
                    System.out.println("Getting Food List......");
                    int continuechoice = 1;
                    while(continuechoice == 1){
                        CategoryList();
                        System.out.print("Added Succesfully, Continue? (1 = y, 2 = no) ?:");
                        continuechoice = scan.nextInt();
                    }
                    String OrderList = "";
                    System.out.println("\nThank You for order");
                    for(int i = 0; i < itemlist.getNumberOfEntries(); i ++){
                        OrderList += (i + 1) + ". " + itemlist.get(i) + "\n";
                    }
                    System.out.println("Here is a list of your order");
                    System.out.println(OrderList);
                }else{
                    System.out.println("Sorry, incorrect input.");
                }
        }else{
            System.out.println("At this time, there is no restaurant in the system.\nPlease wait for Restaurant Owners to add theirs.\nReturning....");
        }

        
        // incomplete method, should have print all the registered restaurant and return back to main menu
    }
    
    public void CategoryList(){
        int quantity = 0;
        System.out.print("Category");
        System.out.println("===================");
        System.out.println("1. Food");
        System.out.println("2. Beverage");
        System.out.println("3. Desserts");
        System.out.println("Please enter your choice");
        int catchoice = scan.nextInt();
        if (catchoice == 1 ){
            //Food
            System.out.println("\n\nFood");
            System.out.println("==============");
            System.out.println("1. Nasi Lemak   RM1");
            System.out.println("2. Ayam Goreng  RM2");
            System.out.println("3. Mee Goreng   RM2");
            System.out.println("4. Pizza        RM5");
            System.out.println("5. Nasi Ayam    RM5");
            System.out.println("Please enter your choice");
            int foodChoice = 0;
            if(scan.hasNext()){
                foodChoice = scan.nextInt();
            }else{
                System.out.println("Sorry, incorrect input.");
            }
            //String ItemName, String Category, int itemPrice , int quantity
            if(foodChoice == 1 ){
                System.out.println("\n\nSelected Food : Nasi Lemak");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Nasi Lemak" , "Food" , 1 , quantity);
                itemlist.add(item);
            }if(foodChoice == 2 ){
                System.out.println("\n\nSelected Food : Ayam Goreng");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Ayam Goreng" , "Food" , 2 , quantity);
                itemlist.add(item);
            }if(foodChoice == 3 ){
                System.out.println("\n\nSelected Food : Mee Goreng");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Mee Goreng" , "Food" , 2 , quantity);
                itemlist.add(item);
            }if(foodChoice == 4 ){
                System.out.println("\n\nSelected Food : Pizza");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Pizza" , "Food" , 5 , quantity);
                itemlist.add(item);
            }if(foodChoice == 5 ){
                System.out.println("\n\nSelected Food : Nasi Ayam");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Nasi Ayam" , "Food" , 5 , quantity);
                itemlist.add(item);
            }if(foodChoice <= 0 || foodChoice >= 6){
                    System.out.println("Sorry, incorrect input.");
                    CategoryList();
                }
        }if(catchoice ==  2){
            //Beverages
            System.out.println("\n\nBeverages");
            System.out.println("==============");
            System.out.println("1. Coke        RM2");
            System.out.println("2. 7up         RM2");
            System.out.println("3. Kikapo      RM2");
            System.out.println("4. Teh Tarik   RM2");
            System.out.println("5. Kopi        RM2");
            System.out.println("Please enter your choice");
            int beverageChoice = scan.nextInt();
            if(beverageChoice == 1){
                System.out.println("\n\nSelected Beverages : Coke");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Coke" , "Beverages" , 2 , quantity);
                itemlist.add(item);
            }
            if(beverageChoice == 2){
                System.out.println("\n\nSelected Beverages : 7up");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("7up" , "Beverages" , 2 , quantity);
                itemlist.add(item);
            }
            if(beverageChoice == 3){
                System.out.println("\n\nSelected Beverages : Kikapo");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Kikapo" , "Beverages" , 2 , quantity);
                itemlist.add(item);
            }
            if(beverageChoice == 4){
                System.out.println("\n\nSelected Beverages : Teh Tarik");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Teh Tarik" , "Beverages" , 2 , quantity);itemlist.add(item);
                
            }
            if(beverageChoice == 5){
                System.out.println("\n\nSelected Beverages : Kopi");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Kopi" , "Beverages" , 2 , quantity);itemlist.add(item);
            }if(beverageChoice <= 0 || beverageChoice >= 6){
                    System.out.println("Sorry, incorrect input.");
                    CategoryList();
                }
        }if(catchoice == 3){
            //Side Dishes
            System.out.println("\n\nDesserts");
            System.out.println("==============");
            System.out.println("1. Chocolate Ice Cream  RM2");
            System.out.println("2. Vanilla Ice Cream    RM2");
            System.out.println("3. GreenTea Ice Cream   RM2");
            System.out.println("4. Durian Ice Cream     RM2");
            System.out.println("5. KitKat Ice Cream     RM2");
            System.out.println("Please enter your choice");
            int dessertchoice = scan.nextInt();
            
            if(dessertchoice == 1){
                System.out.println("\n\nSelected Desserts :Chocolate Ice Cream ");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("Chocolate Ice Cream" , "Desserts" , 2 , quantity);itemlist.add(item);
            }
            if(dessertchoice == 2){
                System.out.println("\n\nSelected Desserts : Vanilla Ice Cream");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                  Items item = new Items("Vanilla Ice Cream" , "Desserts" , 2 , quantity);itemlist.add(item);

            }
            if(dessertchoice == 3){
                System.out.println("\n\nSelected Desserts : GreenTea Ice Cream");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                  Items item = new Items("GreenTea Ice Cream" , "Desserts" , 2 , quantity);itemlist.add(item);

            }
            if(dessertchoice == 4){
                System.out.println("\n\nSelected Desserts : Durian Ice Cream");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                  Items item = new Items("Durian Ice Cream" , "Desserts" , 2 , quantity);itemlist.add(item);

            }
            if(dessertchoice == 5){
                System.out.println("\n\nSelected Desserts :KitKat Ice Cream ");
                System.out.println("Please enter quatity: ");
                quantity = scan.nextInt();
                Items item = new Items("KitKat Ice Cream" , "Desserts" , 2 , quantity);itemlist.add(item);
            }if(dessertchoice <= 0 || dessertchoice >= 6){
                    System.out.println("Sorry, incorrect input.");
                    CategoryList();
                }
        }if(catchoice <= 0 || catchoice >= 4){
                    System.out.println("Sorry, incorrect input.");
                    CategoryList();
        }
        
    }
    
    
    
}
