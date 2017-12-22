/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

/**
 *
 * @author Student
 */
public interface DoublyLinkedList<T> {
    
    public int getSize();
    public boolean isEmpty();
    public void Add(T anEntry);
    public void deleteRecord(int id, T anEntry);
    public T GetEntry(int position);
    public T Update(int position, T entry);
         
    
}
