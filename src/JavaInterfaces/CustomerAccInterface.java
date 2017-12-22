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
    LinkList<Customer> RegisterCustomer(Customer newCustomer, LinkList<Customer> customerlist);
    Customer LoginCustomer(String ID, String Password, LinkList<Customer> customerlist);
}
