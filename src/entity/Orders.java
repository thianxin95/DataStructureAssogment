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
public class Orders {
    private int OrderID = 2000;
    private int OrderCustomerID = 5000;
    private String OrderName = "";
    private String OrderProductID = "";
    private int ProductQuantity;
    private String PaymentStatus = "";
    
    public Orders(){
    
}
     public Orders(int OrderID, int OrderCustomerID, String OrderName, String OrderProductID, int ProductQuantity, String PaymentStatus){
        this.OrderID = OrderID;
        this.OrderCustomerID = OrderCustomerID;
        this.OrderName = OrderName;
        this.OrderProductID = OrderProductID;
        this.ProductQuantity = ProductQuantity;
        this.PaymentStatus = PaymentStatus;
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

    public String getPaymentStatus() {
        return PaymentStatus;
    }
    
      public String toString() {
    return String.format("%-12d %-12s %-12s %-12s %12s %12s",
            OrderID, OrderCustomerID, OrderName, OrderProductID, ProductQuantity, PaymentStatus);
  }
     
}
