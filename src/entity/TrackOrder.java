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
public class TrackOrder {

  private int customerID;
  private double predictReachTime;

  public TrackOrder() {

  }

  public TrackOrder(int customerID, double predictReachTime) {
    this.customerID = customerID;
    this.predictReachTime = predictReachTime;
  }

  public int getCustomerID() {
    return customerID;
  }

  public double getPredictReachTime() {
    return predictReachTime;
  }

  public String toString() {
    return String.format("%-12d %-12s ", customerID, predictReachTime
    );
  }

}
