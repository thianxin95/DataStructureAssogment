/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

/**
 *
 * @author Daniel
 */
public interface DeliveryManInterface<T> {
    public boolean add(T newEntry);
   public boolean add(int newPosition, T newEntry);
    public T getEntry(int givenPosition);
    public int getNumberOfEntries();
    public boolean isEmpty();
}
