package CoreFunctions;

import entity.Restaurant;
import java.util.*;
import ADT.*;

/**
 *
 * @author User
 */

public class RestaurantRegister{
    
    public LinkList<Restaurant> RestaurantRegistration(LinkList<Restaurant> oldRestaurantList){
        
        Scanner scan = new Scanner(System.in);
        String answer;
        
        do{
            System.out.println("Your Restaurant Name : ");
            String restaurantName = scan.nextLine();
            
            System.out.println("Your Restaurant Location : ");
            String restaurantLocation = scan.nextLine();
            
            System.out.println("The Owner Name : ");
            String OwnerName = scan.nextLine();
            
            System.out.println("You Restaurant Phone Number : ");
            String restaurantPhone = scan.nextLine();
            
            RestaurantADT restaurantadt = new RestaurantADT();
            Restaurant newRestaurant  = new Restaurant(restaurantName , restaurantLocation, OwnerName, restaurantPhone);
            oldRestaurantList = restaurantadt.RegisterRestaurant(newRestaurant,oldRestaurantList);
            
            System.out.println("Any details more ? (Y/N)");
            answer = scan.nextLine();
            
        }while( answer.equals("y") || answer.equals("Y")); 
        return oldRestaurantList;
    }
}
