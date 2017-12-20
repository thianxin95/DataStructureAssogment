/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;

import entity.DeliveryMan;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DeliveryManLogin {
    public DeliveryMan DeliveryManLogin(){
       Scanner scan = new Scanner(System.in);
        int authorization = 0;
        DeliveryMan logged_DeliveryMan = new DeliveryMan(5001,"Lee Thian Xin", "PUCHONG" , "NIGHT", 3, 0143333333, 24, "thianxin95", "1123456");
        // Code for Verifying Account
        //Code for Verifying Accoutn ends here.
        
        /*System.out.println("Login To DeliveryMan Area");
        System.out.println("===============================");
        System.out.print("Login ID:");
        String DeliveryManID = scan.next();
        System.out.print("")*/
        System.out.println("");
        System.out.println("");
        System.out.println("Clock in.\n");
        int succeslogin = 0 ;
        while(succeslogin == 0){
            System.out.println("Please key in your User name: ");
            String user = scan.nextLine();
            System.out.println("Please key in your password: ");
            String pass = scan.nextLine();
        
            if(authorization < 2){
                if(user.equals(logged_DeliveryMan.getUserName()) && pass.equals(logged_DeliveryMan.getUserPassword())){
                    System.out.println("Logged In"); 
                    succeslogin = 1;
                    authorization = 0;
                }//add while loop
                else
                    System.out.println("Invalid Input! Please try again.");
                    authorization++;
                }
            else{
                System.out.println("Your account has been suspended.\n");
                MainMenu menu = new MainMenu();
                menu.MainMenuFunctions();
            }
        }
        // fake empty method
        return logged_DeliveryMan;
    }
}
