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
    private int StaffID;
    private int OrderID;
    private int OrderCustomerID;
    private String OrderName;
    private String OrderProductID;
    private int ProductQuantity;
    private double DistanceTravelled;
    private double RemainTime;
    //exampls 1000, 2000, 3000, fried nooddle, 5, 6, 20
    public FoodDelivered(){
        
    }

    public FoodDelivered(int StaffID, int OrderID, int OrderCustomerID, String OrderName, String OrderProductID, int ProductQuantity, double DistanceTravelled, double RemainTime) {
        this.StaffID = StaffID;
        this.OrderID = OrderID;
        this.OrderCustomerID = OrderCustomerID;
        this.OrderName = OrderName;
        this.OrderProductID = OrderProductID;
        this.ProductQuantity = ProductQuantity;
        this.DistanceTravelled = DistanceTravelled;
        this.RemainTime = RemainTime;
    }

    public int getStaffID() {
        return StaffID;
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

    public double getRemainTime() {
        return RemainTime;
    }



    public String toString() {
    return String.format("%-12d %-12s %-12s %-12s %12s %12s %12s %12s",
            StaffID, OrderID, OrderCustomerID, OrderName, OrderProductID, ProductQuantity, DistanceTravelled, RemainTime);
  }
    
    
    
    
    
}
