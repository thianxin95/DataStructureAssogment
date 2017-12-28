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

public class CircularList<T> implements CircularListInterface<T> {

  public int size = 0;
  public Node head = null;
  public Node tail = null;

  @Override
  public T getEntry(int index) {
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    index = index - 1;
    Node n = head;
    while (index - 1 != 0) {
      n = n.next;
      index--;
    }
    return n.data;

  }

  class Node {

    T data;
    Node next;

    public Node(T anEntry) {
      this.data = anEntry;
    }
  }

  @Override
  public void add(T newentry) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    Node n = new Node(newentry);
    if (size == 0) {
      head = n;
      tail = n;
      n.next = head;
    } else {
      Node temp = head;
      n.next = temp;
      head = n;
      tail.next = head;
    }
    size++;

  }

  @Override
  public void removehead() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (size == 0) {
      System.out.println("\nList is Empty");
    } else {
      System.out.println("\ndeleting node " + head.data + " from start");
      head = head.next;
      tail.next = head;
      size--;
    }
  }

  @Override
  public T get(int index) {
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Node n = head;
    while (index - 1 != 0) {
      n = n.next;
      index--;
    }
    return n.data;
  }

  @Override
  public int getNumberOfEntries() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return size;
  }

}
