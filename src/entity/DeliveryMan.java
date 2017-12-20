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
    private String password;
    private String staffName;
    private String staffPhone;
    private String staffAddress;
    private int staffAge;
    private  String staffStatus;
    private String checkIn;
    private String checkOut;
    
    
    
    public DeliveryMan(){
        
    }

    public DeliveryMan(int staffID, String password, String staffName, String staffPhone, String staffAddress, int staffAge, String staffStatus, String checkIn, String checkOut) {
        this.staffID = staffID;
        this.password = password;
        this.staffName = staffName;
        this.staffPhone = staffPhone;
        this.staffAddress = staffAddress;
        this.staffAge = staffAge;
        this.staffStatus = staffStatus;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }
    
    public String toString(){
        String output = String.format("%-20s %-23s", this.getStaffName(), this.getStaffID());
        return output;
    }
    
}
