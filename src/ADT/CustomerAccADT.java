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

public class CustomerAccADT<T> implements CustomerAccInterface{

    @Override
    public CircularList<Customer> RegisterCustomer(Customer newCustomer, CircularList<Customer> customerlist) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        newCustomer.setCustomerID(customerlist.getNumberOfEntries() + 5001); // setting customer ID
        customerlist.add(newCustomer);
        return customerlist;
    
    }

    @Override
    public Customer LoginCustomer(String ID, String Password, CircularList<Customer> customerlist) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            int i = Integer.parseInt(ID) - 5000;
            if(customerlist.get(i).getPassword().equals(Password) & customerlist.get(i).getCustomerID() == Integer.parseInt(ID)){
                return customerlist.get(i);
            }else{
                Customer logincustomer = new Customer(); // setting everything to null
                return logincustomer;
            }
    
    }



 /*   @Override
    public boolean DeactivateAccount(Customer accdeactivate, CircularList<Customer> customerlist) {
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
    }*/

 

   
}
