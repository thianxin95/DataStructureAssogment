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
 * @author leang
 */

public interface CustomerAccInterface {
    CircularList<Customer> RegisterCustomer(Customer newCustomer, CircularList<Customer> customerlist);
    Customer LoginCustomer(String ID, String Password, CircularList<Customer> customerlist);
}
