/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.DeliveryManInterface;
import entity.DeliveryMan;

/**
 *
 * @author Daniel
 */
public class DeliveryManADT<T> implements DeliveryManInterface<T>{
    private Node<T> firstNode;
  private int numberOfEntries;

    @Override
    public T getEntry(int givenPosition) {
         T result = null;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      result = getNodeAt(givenPosition).getData();
    }

    return result;
    }
     private Node<T> getNodeAt(int givenPosition) {
    Node<T> currentNode = firstNode;

    // traverse the list to locate the desired node
    for (int counter = 1; counter < givenPosition; counter++) {
      currentNode = currentNode.getNext();
    }

    return currentNode;
  }
     public int getNumberOfEntries() {
    return numberOfEntries;
  }

    public boolean isEmpty() {
    boolean result;

    if (numberOfEntries == 0) {
      result = true;
    } else {
      result = false;
    }

    return result;
  }

    @Override
    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessful = true;

    if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
      Node<T> newNode = new Node<T>(newEntry);

      if (isEmpty() || (newPosition == 1)) {     // case 1: add to beginning of list
        newNode.setNext(firstNode);
        firstNode = newNode;
      } else {								                      // case 2: list is not empty and newPosition > 1
        Node nodeBefore = getNodeAt(newPosition - 1);
        Node nodeAfter = nodeBefore.getNext();
        newNode.setNext(nodeAfter);
        nodeBefore.setNext(newNode);
      }

        numberOfEntries++;
      } else {
        isSuccessful = false;
      }
    return isSuccessful;
    }

    @Override
    public boolean add(T newEntry) {
        Node<T> newNode = new Node<>(newEntry);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node<T> lastNode = getNodeAt(numberOfEntries);
            lastNode.setNext(newNode);
        }
        numberOfEntries++;
        return true;
    }
}
