package CoreFunctions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leang
 */


import CoreFunctions.*;
import entity.*;


public class Login {
        
    public Customer MainLogin(){
        //return String AccountID that valids
        //int CustomerID, String CustomerName, String CustomerAddress, String CustomerPhone
        Customer logged_customer = new Customer(5001,"Chin", "PJ" , "0102872306");
        // Code for Verifying Account
        //Code for Verifying Accoutn ends here.
        System.out.println("Logged In(System Test, fake Login)"); // Fake Login
        
        // fake empty method
        return logged_customer;
    }
}
