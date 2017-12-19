package entity;

import java.io.Serializable;

/**
 *
 * @author User
 */

public class Menu implements Serializable{
    
    private String MenuId;
    private String MenuName;
    private double MenuPrice;
    
    public Menu(){
        
    }
    
    public Menu(String MenuId, String MenuName, double MenuPrice) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.MenuPrice = MenuPrice;
    }
    
    public String getMenuId(){
        return MenuId;
    }
    
    public void setMenuId(String MenuId){
        this.MenuId = MenuId;
    }
    
    public String getMenuName(){
        return MenuName;
    }
    
    public void setMenuName(String MenuName){
        this.MenuName = MenuName;
    }
    
    public double getMenuPrice(){
        return MenuPrice;
    }
    
    public void setMenuPrice(double MenuPrice){
        this.MenuPrice = MenuPrice;
    }
    
    @Override
    public String toString() {
        return String.format("Menu ID : %-10s \n"
                           + "Menu Name : %-10s \n"
                           + "Menu Price : %.2f \n",MenuId,MenuName,MenuPrice);
    }   
}
