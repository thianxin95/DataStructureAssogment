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
    ArrayListADT<Customer> RegisterCustomer(T Customer , ArrayListADT<Customer> customerlist);
    T LoginCustomer(T Customer, ArrayListADT<Customer> customerlist);
    ArrayListADT<Customer> getCustomerList();
    void DeactivateAccount(T Customer);
}
