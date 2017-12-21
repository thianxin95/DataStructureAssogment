/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;

/**
 *
 * @author Tarc
 */

import ADT.*;
import entity.*;
import java.util.*;

public class MenuDisplay {
    
    public void DisplayMainMenu(CircularList<Menu> menuList) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Display All Menu Items");
        System.out.println("2. Display Newest Items");
        System.out.printf("Choice : ");
        
        int choice = scan.nextInt();
        
        if(choice == 1){
            DisplayMenu(menuList);
        }else if(choice == 2){
            DisplayNewestItems(menuList);
        }else{
            System.out.println("Please Select Existed Options");
            DisplayMainMenu(menuList);
        }
    }
    
    public void DisplayMenu(CircularList<Menu> menuList){
        
        Menu displaymenu = new Menu();
        
        for(int i = 0; i < menuList.getNumberOfEntries(); i++){
            displaymenu = menuList.get(i);
            System.out.println((i+1) + ". \n" + displaymenu);
        }
    }
    
     public void DisplayNewestItems(CircularList<Menu> menuList){
         
        Menu getmenu = new Menu();
        
        LinkedStack<Menu> stack = new LinkedStack<>();
        
        int i;
        
        for(i = 0; i < menuList.getNumberOfEntries(); i++){            
            getmenu = menuList.get(i);
            stack.push(getmenu);
        }      
        
        while(stack.isEmpty() == false){
            System.out.println(stack.view());
        }
    }
}
