/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.*;

public class Staff {
     int staffID;
     String staffName;
     String staffPhone;
     String staffAddress;
     int staffAge;
     String staffStatus;
     int staffPassword;
     String staffWorkStatus;
     int totalDelivery;
     double totalDistance;
     
     public Staff(){}
     
     public Staff(int staffID, String staffName, String staffPhone, String address,int staffAge, String staffStatus, int staffPassword, String staffWorkStatus,int totalDelivery, double totalDistance)
     {
         this.staffID=staffID;
         this.staffName=staffName;
         this.staffPhone=staffPhone;
         this.staffAddress=address;
         this.staffAge= staffAge;
         this.staffStatus=staffStatus;
         this.staffPassword = staffPassword;
         this.staffWorkStatus= staffWorkStatus;
         this.totalDelivery=totalDelivery;
         this.totalDistance=totalDistance;
     }
     public Staff(int staffID, String staffName, String staffPhone, String address,int staffAge, String staffStatus)
     {
           this.staffID=staffID;
         this.staffName=staffName;
         this.staffPhone=staffPhone;
         this.staffAddress=address;
         this.staffAge= staffAge;
         this.staffStatus=staffStatus;
     }
     
    
    public int getStaffID(){
   return staffID;
}
    public void setStaffID( int staffID){
   this.staffID=staffID;
}
    public String getStaffName(){
        return staffName;
    }
    public void setStaffName(String staffName){
        this.staffName=staffName;
    }
    public String getStaffPhone(){
        return staffPhone;
    }
    public void setStaffPhone(String staffPhone){
        this.staffPhone=staffPhone;
    }
    public String getStaffAddress(){
        return staffAddress;
    }
    public void setStaffAddress(String Address){
        this.staffAddress=Address;
        
    }
    public int getStaffAge(){
        return staffAge;
    }
    public void setStaffAge(int staffAge){
        this.staffAge=staffAge;
    }
    public void setStaffStatus(String staffStatus){
        this.staffStatus=staffStatus;
    }
    public String getStaffStatus(){
        return staffStatus;
    }
     public String getStaffWorkStatus(){
        return staffWorkStatus;
    }
    public void setStaffWorkStatus(String staffWorkStatus){
        this.staffWorkStatus=staffWorkStatus;
    }
    
     public int getStaffPassword(){
   return staffPassword;
}
    public void setStaffPassword( int staffPassword){
   this.staffPassword=staffPassword;
}
    public int getTotalDelivery(){
   return totalDelivery;
}
    public void setTotalDelivery( int totalDelivery){
   this.totalDelivery=totalDelivery;
}
    public double getDistance(){
   return totalDistance;
}
    public void setDistance( int totalDistance){
   this.totalDistance=totalDistance;
}

     
     
    public String toString() {
        return String.format("Staff ID : %5d / Name : %-20s / Phone : %10d / Address : %-20s / Age : %2d   Status : %-20s\n",staffID,staffName,staffPhone,staffAddress,staffAge,staffStatus);
  }  
    public String toStringList() {
        return String.format("Staff ID : %5d / Name : %-20s / Total Delivery : %10d / Total Distance : %-20d \n",staffID,staffName,totalDelivery,totalDistance);
  }   
}
