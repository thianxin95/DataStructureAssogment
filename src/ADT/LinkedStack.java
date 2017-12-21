/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.*;
/**
 *
 * @author User
 */
public class LinkedStack<T> implements StackInterface<T> {
    
    private Node firstNode;
    
    public LinkedStack(){
        firstNode = null;
    }

    @Override
    public void push(T newEntry) {
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;
        firstNode = newNode;
    }

    @Override
    public T pop() {
         T pop = peek();

        if (firstNode != null) {
            firstNode = firstNode.next;
        }

        return pop;
    }

    @Override
    public T peek() {
        T top = null;

        if (!isEmpty()) {
            top = firstNode.data;
        }

        return top;
    }
    
    @Override
    public T view() {
        T top = null;
        
        if(!isEmpty()){
            
            top = firstNode.data;
            firstNode = firstNode.next;
        }
        
        return top;
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null);
    }

    @Override
    public void clear() {
        firstNode = null;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        } // end constructor

        private Node(T data, Node link) {
            data = data;
            next = link;
        } // end constructor
    }   
}
