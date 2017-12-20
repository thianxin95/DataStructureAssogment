/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Daniel
 */
public class FoodDelivered {
    //deliveryman
    private int OrderID;
    private int OrderCustomerID;
    private String OrderName;
    private String OrderProductID;
    private int ProductQuantity;
    private double DistanceTravelled;
    
    public FoodDelivered(){
        
    }

    public FoodDelivered(int OrderID, int OrderCustomerID, String OrderName, String OrderProductID, int ProductQuantity, double DistanceTravelled) {
        this.OrderID = OrderID;
        this.OrderCustomerID = OrderCustomerID;
        this.OrderName = OrderName;
        this.OrderProductID = OrderProductID;
        this.ProductQuantity = ProductQuantity;
        this.DistanceTravelled = DistanceTravelled;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getOrderCustomerID() {
        return OrderCustomerID;
    }

    public String getOrderName() {
        return OrderName;
    }

    public String getOrderProductID() {
        return OrderProductID;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public double getDistanceTravelled() {
        return DistanceTravelled;
    }

    public String toString() {
    return String.format("%-12d %-12s %-12s %-12s %12s %12s",
            OrderID, OrderCustomerID, OrderName, OrderProductID, ProductQuantity, DistanceTravelled);
  }
    
    
    
    
    
}
