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
import java.util.Scanner;
import ADT.*;
public class Login {
        
    public Customer MainLogin(LinkList<Customer> CustomerList){
        //return String AccountID that valids
        //int CustomerID, String CustomerName, String CustomerAddress, String CustomerPhone
        CustomerAccADT caccadt = new CustomerAccADT();
        Scanner scan = new Scanner(System.in);
        System.out.println("Login to Customer Area");
        System.out.println("============================");
        System.out.print("Enter Login ID (Enter 0 to cancel):");
        String Login = scan.nextLine();
        System.out.print("Enter Password : ");
        String Password = scan.nextLine();
        
        Customer logged_customer = new Customer();
        logged_customer = caccadt.LoginCustomer(Login, Password, CustomerList);
        
        
        return logged_customer;
       // Customer logged_customer = new Customer(5001, "140397", "Chin", "PJ" , "0102872306");
        // Code for Verifying Account
        //Code for Verifying Accoutn ends here.
        //System.out.println("Logged In(System Test, fake Login)"); // Fake Login
        
        // fake empty method
        
    }
    public LinkList<Customer> RegisterAccount(LinkList<Customer> oldCustomerList){
        //int CustomerID, String Password, String CustomerName, String CustomerAddress, String CustomerPhone
        LinkList<Customer> newCustomerList = new LinkList<Customer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Register to Customer Area");
        System.out.println("==============================");
        System.out.print("Please enter your Name :");
        String Name = scan.nextLine();
        System.out.print("Please enter your password:");
        String Password = scan.nextLine();
        System.out.print("Please enter your address");
        String Address = scan.nextLine();
        System.out.print("Please enter your phone number");
        String CustomerPhone = scan.nextLine();
        
        CustomerAccADT caccadt = new CustomerAccADT();
        Customer newCustomer = new Customer(0, Password, Name, Address, CustomerPhone);
        oldCustomerList = caccadt.RegisterCustomer(newCustomer, oldCustomerList);
        return oldCustomerList;
    }
    
}
