package CoreFunctions;

import ADT.*;
import java.util.*;
import entity.*;
import JavaInterfaces.*;

/**
 *
 * @author User
 */
public class MaintainMenu{
    
    private Menu getmenu;
    
    public LinkList<Menu> RegisterMenu(LinkList<Menu> oldMenuList, String restaurantName){
        
        Scanner scan = new Scanner(System.in);
        Scanner scandouble = new Scanner(System.in);
        
        String answer;
        
        do{
            System.out.println("Menu ID (\"F\" as Food , \"D\" as Drink): ");
            String menuId = scan.nextLine();
            
            char checkFirstId = menuId.charAt(0);
            
            if(checkFirstId != 'F' && checkFirstId != 'D'){
                System.out.println("Please Enter Valid ID (\"F\" as Food , \"D\" as Drink)");
                RegisterMenu(oldMenuList,restaurantName);
                break;
            }
            
            System.out.println("Menu Name : ");
            String menuName = scan.nextLine();
            
            System.out.println("Menu Price : ");
            double menuPrice = scandouble.nextDouble();
            
            MenuADT menuadt = new MenuADT();
            Menu newMenu = new Menu(menuId,menuName,menuPrice,restaurantName);
            
            oldMenuList = menuadt.AddMenu(newMenu, oldMenuList);
            
            System.out.println("Any details more ? (Y/N)");
            answer = scan.nextLine();
            
        }while(answer.equals("y") || answer.equals("Y")); 
        
        return oldMenuList;
    }
    
   public LinkList<Menu> UpdateDetails(LinkList<Menu> oldMenuList, String restaurantName){
       
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        Scanner scanDouble = new Scanner(System.in);
        
        System.out.println("Please Select The Menu That You Wanted to Update : ");
                
        DisplayMenu(oldMenuList,restaurantName);
        
        int selectmenu = scanInt.nextInt();
        
        getmenu = oldMenuList.getEntry(selectmenu);
        
        System.out.println(getmenu);
        
        String id = getmenu.getMenuId();
        
        System.out.printf("Menu Name : ");
        String updatename = scanString.nextLine();
        
        System.out.printf("Menu Price : ");
        double updateprice = scanDouble.nextDouble();
        
        Menu updatemenu = new Menu(id,updatename,updateprice,restaurantName);       
        Menu removeItem = oldMenuList.getEntry(selectmenu);
        
        MenuADT menuadt = new MenuADT();
        menuadt.UpdateMenu(removeItem, updatemenu , oldMenuList);
        
        return oldMenuList;
    }
    
    public LinkList<Menu> DeleteDetails(LinkList<Menu> oldMenuList, String restaurantName){
        
        Scanner scanInt = new Scanner(System.in);
        
        System.out.println("Please Select The Menu That You Wanted to Delete : ");
        
        DisplayMenu(oldMenuList,restaurantName);
        
        int selectmenu = scanInt.nextInt();
        
        Menu removeItem = oldMenuList.getEntry(selectmenu);
        
        System.out.println(removeItem + "is removed");
        
        MenuADT menuadt = new MenuADT();
        menuadt.RemoveMenu(removeItem , oldMenuList);

        return oldMenuList;
    }
    
    
    public void DisplayMenu(LinkList<Menu> menuList,String restaurant){
    
        Menu displaymenu = new Menu();
        
        for(int i = 0; i < menuList.getNumberofSize(); i++){
            if(menuList.get(i).getRestaurantName().equals(restaurant)){
                displaymenu = menuList.get(i);
                System.out.println((i+1) + ". \n" + displaymenu);
            }         
        }
    }
}

