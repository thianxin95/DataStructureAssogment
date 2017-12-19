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
    int itemPrice;
    int quantity;
    public Items(){
        
    }
    
    public Items(String ItemName, String Category, int itemPrice , int quantity){
        this.ItemName = ItemName;
        this.Category = Category;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        
    }
    
    public String getItemName(){
        return ItemName;
    }
    public String getCategory(){
        return Category;
    }
    public int getitemPrice(){
        return itemPrice;
    }
    public int getQuantity(){
        return quantity;
    }
     public String toString() {
        return String.format("Item Name : %-20s Category : %-20s  Price : %10d  Quantity : %10d\n",ItemName, Category , itemPrice , quantity);
     }
    
    
    
}
