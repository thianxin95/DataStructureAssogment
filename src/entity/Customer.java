/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author leang
 */
public class Customer {
    private int CustomerID = 5000;
    private String CustomerName = "";
    private String CustomerAddress = "";
    private String CustomerPhone = "";
    
    public Customer(){
        
    }
    public Customer(int CustomerID, String CustomerName, String CustomerAddress, String CustomerPhone){
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerAddress = CustomerAddress;
        this.CustomerPhone = CustomerPhone;
    }
    public int getCustomerID(){
        return CustomerID;
    }
    public String getCustomerName(){
        return CustomerName;
    }
    public String getCustomerAddress(){
        return CustomerAddress;
    }
    public String getCustomerPhone(){
        return CustomerPhone;
    }
    
}
