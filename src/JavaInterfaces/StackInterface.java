/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

/**
 *
 * @author User
 */
public interface StackInterface<T> {

  public void push(T newEntry);

  public T pop();

  public T peek();

  public T view();

  public boolean isEmpty();

  public void clear();

}
