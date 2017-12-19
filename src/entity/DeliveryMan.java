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
public class DeliveryMan {
    
    
    private int deliveryManID = 5000;
    private String deliveryManName = "";
    private String deliveryManAddress = "";
    private String deliveryManShift = "";
    private int deliveryCount;
   //private Calendar startTime;
  //  private Calendar arriveTime;
    private int deliveryManPhoneNumber;
    private int deliveryManAge;
  
    
    public DeliveryMan(){
        
    }
      public DeliveryMan(int deliveryManID, String deliveryManName, String deliveryManAddress, String deliveryManShift, int deliveryCount, int deliveryManPhoneNumber, int deliveryManAge ){
        this.deliveryManName = deliveryManName;
        this.deliveryManAddress = deliveryManAddress;
        this.deliveryManShift = deliveryManShift;
        this.deliveryCount = deliveryCount;
        this.deliveryManPhoneNumber = deliveryManPhoneNumber;
        this.deliveryManAge = deliveryManAge;
       
       
    }
       public int getDeliveryManID() {
        return deliveryManID;
       }
    public String getDeliveryManName() {
        return deliveryManName;
    }
    public String getDeliveryManAddress() {
        return deliveryManAddress;
    }
    public String getDeliveryManShift() {
        return deliveryManShift;
    }
    public int getDeliveryCount() {
        return deliveryCount;
    }
    //public Calendar getStartTime() {
      //  return startTime;
   // }
   // public void setStartTime(Calendar startTime) {
       // this.startTime = startTime;
    //}
    //public Calendar getArriveTime() {
      //  return arriveTime;
   // }
  //  public void setArriveTime(Calendar arriveTime) {
     //   this.arriveTime = arriveTime;
   // }
    public int getDeliveryManPhoneNumber() {
        return deliveryManPhoneNumber;
    }
    public int getDeliveryManAge() {
        return deliveryManAge;
    }   
    
  
    // public static String getTime(Calendar time) {
   // return String.format("%02d:%02d:%02d", time.get(Calendar.HOUR_OF_DAY),
      //      time.get(Calendar.MINUTE), time.get(Calendar.SECOND));
//  }
 // public int getWaitingTime() {
  //  return (int) ((startTime.getTimeInMillis() - arriveTime.getTimeInMillis()) / 1000);
 // }
 // public String toString() {
   // return String.format("%-12d", deliveryManName);
 // }
    
}
