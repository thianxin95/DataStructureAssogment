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
    private int staffID;   
    private String staffName;    
    //private  String staffStatus;
    private String checkIn;
    private String checkOut;
    
    
    
    public DeliveryMan(){
        
    }

    public DeliveryMan(int staffID, String staffName, String checkIn, String checkOut) {
        this.staffID = staffID;
        this.staffName = staffName;
        
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    
    public String toString(){
        String output = String.format("%-20s %-23s %-23s %-23s", this.getStaffName(), this.getStaffID(), this.getCheckIn(), this.getCheckOut());
        return output;
    }
    
}
