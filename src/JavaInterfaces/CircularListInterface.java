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
public interface CircularListInterface<T> {

  void add(T newentry);

  void removehead();

  T get(int index);

  T getEntry(int index);

  int getNumberOfEntries();
}
