package entity;

import java.io.Serializable;
import java.util.Objects;

public class Restaurant implements Serializable{
    
    private int IdNumber;
    private static int RestaurantID = 1000; 
    private String RestaurantName;
    private String RestaurantLocation;
    private String OwnerName;
    private String RestaurantPhone;
    
    public Restaurant(){
        
    }
    
    public Restaurant(int IdNumber){
        this.IdNumber = IdNumber;
    }
    
    public Restaurant(String RestaurantName, String RestaurantLocation, String OwnerName, String RestaurantPhone) {
        this.IdNumber = RestaurantID++;
        this.RestaurantName = RestaurantName;
        this.RestaurantLocation = RestaurantLocation;
        this.OwnerName = OwnerName;
        this.RestaurantPhone = RestaurantPhone;
    }
    
    public int getIdNumber(){
        return IdNumber;
    }
    
    public void setIdNumber(int IdNumber){
        this.IdNumber = IdNumber;
    }
    
    public static int getRestaurantID(){
        return RestaurantID;
    }
    
    public static void setRestaurantID(int RestaurantID){
        Restaurant.RestaurantID = RestaurantID;
    }
    
    public String getRestaurantName(){
        return RestaurantName;
    }
    
    public void setRestaurantName(String RestaurantName){
        this.RestaurantName = RestaurantName;
    }
    
    public String getRestaurantLocation(){
        return RestaurantLocation;
    }
    
    public void setRestaurantLocation(String RestaurantLocation){
        this.RestaurantLocation = RestaurantLocation;
    }
    
    public String getOwnerName(){
        return OwnerName;
    }
    
    public void setOwnerName(String OwnerName){
        this.OwnerName = OwnerName;
    }
    
    public String getRestaurantPhone(){
        return RestaurantPhone;
    }
    
    public void setRestaurantPhone(String RestaurantPhone){
        this.RestaurantPhone = RestaurantPhone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restaurant other = (Restaurant) obj;
        if (!Objects.equals(this.RestaurantName, other.RestaurantName)) {
            return false;
        }
        if (!Objects.equals(this.RestaurantLocation, other.RestaurantLocation)) {
            return false;
        }
        if (!Objects.equals(this.OwnerName, other.OwnerName)) {
            return false;
        }
        return Objects.equals(this.RestaurantPhone, other.RestaurantPhone);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.RestaurantName);
        hash = 47 * hash + Objects.hashCode(this.RestaurantLocation);
        hash = 47 * hash + Objects.hashCode(this.OwnerName);
        hash = 47 * hash + Objects.hashCode(this.RestaurantPhone);
        return hash;
    }
    
    @Override
    public String toString() {
        return String.format("No : %10d / Name : %-20s / Location : %-20s / Owner Name : %-20s / Phone : %-20s \n",IdNumber,RestaurantName,RestaurantLocation,OwnerName,RestaurantPhone);
  }   
}
