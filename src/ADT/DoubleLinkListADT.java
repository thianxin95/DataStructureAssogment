/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;
import JavaInterfaces.*;
import entity.*;


public class DoubleLinkListADT<T> implements DoublyLinkedList<T> {

     private Node first = null;
     private Node last = null;
     private int size =0;

    @Override
    public int getSize() {
       return size;
    }

    public boolean isEmpty(){
        return (first == null);
    };
    @Override
    public void Add(T anEntry) {
        Node newNode = new Node(anEntry);
 if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    @Override
    public void deleteRecord(int id, T anEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T GetEntry(int index) {
      Node <T>  current= first;
        if(index <0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
      
            for (int i = 0; i < index; i++) {
                current = current.next;
               
            }
            return current.data;
        }
         
     
        
        
    }

   
     private class Node<T> {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
        }
    }

   
    public void addFirst(T data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;

        } else {
            first.prev = newNode;
            newNode.next = first;
            newNode.prev = null;
            first = newNode;
        }
    }

    

    public void removeFirst() {
        if (!isEmpty()) {
            Node temp = first;

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            System.out.println(temp.toString() + " is popped from the list");
        }
    }

    public void removeLast() {
        Node temp = last;

        if (!isEmpty()) {

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }
        }
        System.out.println(temp.toString() + " is popped from the list");
    }
    public static void main(String args[]){
        DoubleLinkListADT<Integer> test = new DoubleLinkListADT<Integer>();
        test.Add(1);
        test.Add(2);
        test.Add(3);
        System.out.println("Test get :" + test.GetEntry(0));
        System.out.println("Test get 2:"  + test.GetEntry(1));
        System.out.println("Test get 3: " + test.GetEntry(2));

}
    
    
    
}
    
    

