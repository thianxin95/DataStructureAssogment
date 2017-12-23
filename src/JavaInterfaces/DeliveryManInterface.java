/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

import ADT.LinkList;
import entity.Staff;

/**
 *
 * @author Daniel
 */
public interface DeliveryManInterface {
      Staff LoginDeliveryMan(int ID, int Password, LinkList<Staff> staffList);

}
