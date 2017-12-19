/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author leang
 */
import JavaInterfaces.*;
import entity.Customer;

public class CustomerAccADT<T> implements CustomerAccInterface<T>{

    @Override
    public ArrayListADT<Customer> RegisterCustomer(T Customer, ArrayListADT<Customer> customerlist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T LoginCustomer(T Customer, ArrayListADT<Customer> customerlist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayListADT<Customer> getCustomerList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeactivateAccount(T Customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
