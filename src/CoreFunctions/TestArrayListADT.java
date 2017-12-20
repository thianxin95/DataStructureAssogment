/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;

/**
 *
 * @author leang
 */
import ADT.*;
import entity.*;

public class TestArrayListADT {
    
    
    public static void main(String args[]){
        ArrayListADT<Customer> customer = new ArrayListADT<Customer>();
     //   Customer customerob = new Customer(5001,"Chin", "PJ" , "0102872306");
     //   Customer customerob2 = new Customer(5002,"Chin", "PJ" , "0102872306");
     //   customer.add(customerob);
     //   customer.add(customerob2);
        System.out.print(customer.get(0).getCustomerID());
    }
    
    
}
