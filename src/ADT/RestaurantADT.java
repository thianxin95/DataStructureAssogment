/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.*;
import entity.*;

/**
 *
 * @author Tarc
 */
public class RestaurantADT<T> implements RestaurantInterface {

  @Override
  public LinkList<Restaurant> RegisterRestaurant(Restaurant newRestaurant, LinkList<Restaurant> restaurantList) {
    restaurantList.add(newRestaurant);
    return restaurantList;
  }
}
