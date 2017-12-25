/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DeliveryManUi {
      ClearScreen clear = new ClearScreen();
      Scanner scanner = new Scanner(System.in);
      
      public DeliveryManUi(){
          
      }
      
      public int MenuDisplay(){
          clear.clearScreen();
          System.out.println("Staff only!! Unauthorized access prohibited.");
          System.out.println("====Delivery Man Menu====");
          System.out.println("1.Log in.");
          System.out.println("2.Exit.");
          int answer;
          do{
              System.out.println("Please key in your selection(integer): ");
              try{
                  answer = scanner.nextInt();
              }catch(Exception ex){
              System.out.println("The selection you key in must be an integer."); 
              System.out.println("Please enter your selection:");
              scanner.nextLine();
              answer = 0;
              }
              if(answer<1 || answer>2){
                  System.out.println("Integer out of range!");
                  System.out.println("Please key in your selection");
              }
          }while(answer<1 || answer>2);
          return answer;
      }
      
    
}
