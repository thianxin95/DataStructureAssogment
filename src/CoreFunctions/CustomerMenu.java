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
    LinkList<Items> itemlist = new LinkList<Items>(); 
    Queue<Orders> orderQueue = new Queue<Orders>();
    public Queue<Orders> CustomerMenu(Customer customer, LinkList<Restaurant> restaurantList, LinkList<Menu> menulist){
        String details = "";
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Welcome back,"+ customer.getCustomerName() );
        System.out.println();
        if(restaurantList.getNumberofSize()!=0){
            System.out.println("Here is a list of our current restaurant");
            for(int i = 0; i < restaurantList.getNumberofSize(); i ++){
                details += (i + 1) + ". " + restaurantList.get(i) + "\n";
            }
                System.out.println(details);
                System.out.print("Please choose your desired restaurant:");
                int answer = scan.nextInt();
                if(answer <= restaurantList.getNumberofSize()+ 1 && answer>=0 ){
                    int choice = answer-1;
                    //System.out.println(restaurantList.get(choice) + "\n");
                    System.out.print("You have choosed : " + restaurantList.get(choice).getRestaurantName() + "\n\n");
                    System.out.println("Getting Food List......");
                    int continuechoice = 1;
                    while(continuechoice == 1){
                        CategoryList(menulist, restaurantList.get(choice).getRestaurantName());
                        System.out.print("Continue making Order? (1 = yes, 2 = no) ?:");
                        continuechoice = scan.nextInt();
                    }
                    String OrderList = "";
                    System.out.println("\nThank You for order");
                    double totalprice=0;
                    for(int i = 0; i < itemlist.getNumberofSize(); i ++){
                        totalprice =( itemlist.get(i).getQuantity() * itemlist.get(i).getitemPrice() ) + totalprice;
                        OrderList += (i + 1) + ". " + itemlist.get(i) + "\n";
                    }
                    if(OrderList != ""){
                        System.out.println("Here is a list of your order");
                        System.out.println(OrderList);

                        System.out.print("");
                         System.out.println("Total Amount: RM" + totalprice);
                        System.out.print("Make Payment now? (1 = yes / 2 = no)");
                        int makePayment = scan.nextInt();
                        int orderID = customer.getCustomerID();
                        if(makePayment == 1){
                            System.out.println("Payment Accepted. Thank you for your purchase and please come again!");
                            for(int i = 0 ; i < itemlist.getNumberofSize(); i ++){
                                Orders order = new Orders(orderID, orderID, itemlist.get(i).getItemName(), itemlist.get(i).getProductID() ,itemlist.get(i).getQuantity(), "Paid", restaurantList.get(choice).getRestaurantName());
                                orderQueue.enqueue(order);
                            }
                            try{
                                Thread.sleep(3000);
                            }catch(Exception e){

                            }
                        }if(makePayment == 2){
                            System.out.println("Order Canceled. Come again next time");
                            try{
                                Thread.sleep(3000);
                            }catch(Exception e){

                            }
                        }
                    }else{
                    System.out.println("Sorry, incorrect input or Empty checkout item, abort.");
                    }
                    
                }else{
                    System.out.println("Sorry, incorrect input.");
                }
                
        }else{
            System.out.println("At this time, there is no restaurant in the system.\nPlease wait for Restaurant Owners to add theirs.\nReturning....");
        }

        
        return orderQueue;
    }
    
    public void CategoryList(LinkList<Menu> menulist, String RestuarantName){
        int quantity = 0;
        LinkList<Items> listItem = new LinkList<Items>();
        System.out.print("Category");
        System.out.println("===================");
        System.out.println("1. Food");
        System.out.println("2. Beverage");
  //      System.out.println("3. Desserts");
        int Emptymenu = 1;
        System.out.println("Please enter your choice :");
        int catchoice = scan.nextInt();
        if (catchoice == 1 ){
            //Food
            System.out.println("\n\nFood");
            System.out.println("==============");
            System.out.println("MenuID  MenuName    MenuPrice");
            
            for(int i = 0; i< menulist.getNumberofSize(); i ++){
                if(menulist.get(i).getRestaurantName() == RestuarantName){
                      if(menulist.get(i).getMenuId().charAt(0) == 'F'){
                          System.out.printf("%-6s %-12s %-12s\n", menulist.get(i).getMenuId(), menulist.get(i).getMenuName() , menulist.get(i).getMenuPrice());
                          Emptymenu =0;
                      } 
                }
            }
            if(Emptymenu == 0){
                scan.nextLine(); // Consumes \n after nextINT
                System.out.println("Please enter MenuID you desire :");
                String foodChoice = "";
                if(scan.hasNext()){
                    foodChoice = scan.nextLine();
                    if(foodChoice.charAt(0) == 'F'){
                        for(int i = 0; i< menulist.getNumberofSize(); i++){
                            if(menulist.get(i).getMenuId().equals(foodChoice)){ //bugged start
                                System.out.print("Please enter the Quantity : ");
                                quantity = scan.nextInt();
                                Items items = new Items(menulist.get(i).getMenuName(), "Food" , menulist.get(i).getMenuPrice(), quantity , foodChoice);
                                itemlist.add(items);
                            } // bugged
                        }



                    }else{
                        System.out.println("Sorry, incorrect input.");
                    }

                }else{
                    System.out.println("Sorry, incorrect input.");
                }
            }else{
                System.out.println("Sorry, Empty Menu");
            }
                   
            //String ItemName, String Category, int itemPrice , int quantity

        }if(catchoice ==  2){
            //Beverages
            int EmptyMenuB = 1;
            System.out.println("\n\nBeverages");
            System.out.println("==============");
             System.out.println("MenuID  MenuName    MenuPrice");
            for(int i = 0; i< menulist.getNumberofSize(); i ++){
                if(menulist.get(i).getRestaurantName() == RestuarantName){
                      if(menulist.get(i).getMenuId().charAt(0) == 'D'){
                          System.out.printf("%-6s %-12s %-12s\n", menulist.get(i).getMenuId(), menulist.get(i).getMenuName() , menulist.get(i).getMenuPrice() );
                          EmptyMenuB = 0;
                      } 
                }
            }
            if(EmptyMenuB==0){
                scan.nextLine(); // Consumes \n after nextINT
                System.out.println("Please enter MenuID you desire :");
                String foodChoice = "";
                if(scan.hasNext()){
                    foodChoice = scan.nextLine();
                    if(foodChoice.charAt(0) == 'D'){
                        for(int i = 0; i< menulist.getNumberofSize(); i ++){
                            if(menulist.get(i).getMenuId().equals(foodChoice)){
                                System.out.print("Please enter the Quantity : ");
                                quantity = scan.nextInt();
                                Items items = new Items(menulist.get(i).getMenuName(), "Drinks" , menulist.get(i).getMenuPrice(), quantity, foodChoice);
                                itemlist.add(items);
                            }
                        }



                    }else{
                        System.out.println("Sorry, incorrect input.");
                    } 
                }
            }else{
                System.out.println("Sorry, Empty Menu");
            }
        }
    }
}
