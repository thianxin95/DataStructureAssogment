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
public class Items {
    String ItemName;
    String Category;
    double itemPrice;
    int quantity;
    String productID;
    public Items(){
        
    }
    
    public Items(String ItemName, String Category, double itemPrice , int quantity, String ProductID ){
        this.ItemName = ItemName;
        this.Category = Category;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.productID = ProductID;
        
    }
    
    public String getItemName(){
        return ItemName;
    }
    public String getCategory(){
        return Category;
    }
    public double getitemPrice(){
        return itemPrice;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public String getProductID(){
        return productID;
    }
     public String toString() {
        return String.format("Item Name : %-20s Category : %-20s  Price : %10.2f  Quantity : %10d\n",ItemName, Category , itemPrice , quantity);
     }
    
    
    
}
