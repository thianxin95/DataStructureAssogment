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
    public ArrayListADT<Customer> RegisterCustomer(Customer newCustomer, ArrayListADT<Customer> customerlist) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        customerlist.add(newCustomer);
        return customerlist;
    
    }

    @Override
    public Customer LoginCustomer(Customer logincustomer, ArrayListADT<Customer> customerlist) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(customerlist.contains(logincustomer)){
            return logincustomer;
        }
        else{
            logincustomer = new Customer(); // setting everything to null
            return logincustomer;
        }
    }



    @Override
    public boolean DeactivateAccount(Customer accdeactivate, ArrayListADT<Customer> customerlist) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(customerlist.contains(accdeactivate)){
          for(int i = 0; i<customerlist.getNumberOfEntries(); i++){
              if(accdeactivate.getCustomerID() == customerlist.get(i).getCustomerID()){
                  customerlist.remove(i);
                  return true;
              }
          }
       }else{
           return false;
       }
       return false;
    }

 

   
}
