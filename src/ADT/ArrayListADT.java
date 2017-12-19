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

public class ArrayListADT<T> implements ArrayListInterface<T>{
    
    private T[] list; // array of list entries
    private int numberOfEntries;
    private static final int DEFAULT_INITIAL_CAPACITY = 25;
    public ArrayListADT(){
        this(DEFAULT_INITIAL_CAPACITY);
    }
    public ArrayListADT(int initialCapacity) {
        numberOfEntries = 0;
        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Object[initialCapacity];
        list = tempList;
    } // end constructor
    public void add(T newEntry) {
      if (isArrayFull()) {
        doubleArray();
      }

      list[numberOfEntries] = newEntry;
      numberOfEntries++;
    }

    public boolean add(int newPosition, T newEntry) {
      boolean isSuccessful = true;

      if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
        if (isArrayFull()) {
          doubleArray();
        }

        makeRoom(newPosition);
        list[newPosition - 1] = newEntry;
        numberOfEntries++;
      } else {
        isSuccessful = false;
      }

      return isSuccessful;
    }

    public void clear() {
      numberOfEntries = 0;
    }

    public boolean replace(int givenPosition, T newEntry) {
      boolean isSuccessful = true;

      if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
        list[givenPosition - 1] = newEntry;
      } else {
        isSuccessful = false;
      }

      return isSuccessful;
    }

    public T getEntry(int givenPosition) {
      T result = null;

      if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
        result = list[givenPosition - 1];
      }

      return result;
    }

    public boolean contains(T anEntry) {
      boolean found = false;
      for (int index = 0; !found && (index < numberOfEntries); index++) {
        if (anEntry.equals(list[index])) {
          found = true;
        }
      }

      return found;
    }

    public int getNumberOfEntries() {
      return numberOfEntries;
    }

    public boolean isEmpty() {
      return numberOfEntries == 0;
    }

    public boolean isFull() {
      return false;
    }

    public String toString() {
      String outputStr = "";
      for (int index = 0; index < numberOfEntries; ++index) {
        outputStr += list[index] + "\n";
      }

      return outputStr;
    }

    private boolean isArrayFull() {
      return numberOfEntries == list.length;
    }

    private void doubleArray() {
      T[] oldList = list; 
      int oldSize = oldList.length;

      list = (T[]) new Object[2 * oldSize];    

      for (int index = 0; index < oldSize; index++) {
        list[index] = oldList[index];
      }
    } 

    private void makeRoom(int newPosition) {
      int newIndex = newPosition - 1;
      int lastIndex = numberOfEntries - 1;
      for (int index = lastIndex; index >= newIndex; index--) {
        list[index + 1] = list[index];
      }
    }

    private void removeGap(int givenPosition) {
      int removedIndex = givenPosition - 1;
      int lastIndex = numberOfEntries - 1;

      for (int index = removedIndex; index < lastIndex; index++) {
        list[index] = list[index + 1];
      }
    }


      @Override
     public T remove(int position){
          T result = null;

      if ((position >= 1) && (position <= numberOfEntries)) {
        result = list[position - 1];

        if (position < numberOfEntries) {
          removeGap(position);
        }

        numberOfEntries--;
      }
      return result;
    }

    @Override
    public T get(int index) {
       T result = null;

       if ((index >= 0) && (index <= numberOfEntries)) {
         result = list[index];
        }

      return result;
    }
}
