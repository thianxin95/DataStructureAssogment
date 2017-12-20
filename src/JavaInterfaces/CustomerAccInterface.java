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

public interface CustomerAccInterface<T> {
    ArrayListADT<Customer> RegisterCustomer(Customer newCustomer, ArrayListADT<Customer> customerlist);
    Customer LoginCustomer(Customer logincustomer, ArrayListADT<Customer> customerlist);
    boolean DeactivateAccount(Customer accdeactivate, ArrayListADT<Customer> customerlist);
}
