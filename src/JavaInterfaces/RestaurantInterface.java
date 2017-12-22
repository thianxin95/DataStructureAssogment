/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

import ADT.*;
import entity.*;
/**
 *
 * @author Tarc
 */
public interface RestaurantInterface {
    LinkList<Restaurant> RegisterRestaurant(Restaurant newRestaurant,LinkList<Restaurant> restaurantList);
}
