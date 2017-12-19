/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

/**
 *
 * @author leang
 */
public interface ArrayListInterface<T> {
    void add(T newentry);
    T remove(int position);
    T getEntry(int position);
    T get(int index);
    boolean contains(T anENtry);

}
