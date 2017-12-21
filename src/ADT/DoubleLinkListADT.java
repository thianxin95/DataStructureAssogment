/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;
import JavaInterfaces.*;
import entity.*;


public class DoubleLinkListADT<T> implements DoublyLinkedList<T> {
    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Add(T anEntry) {
        Node newNode = new Node(anEntry);
        if(firstNode == null){
            firstNode = newNode;
        }else{
            // make new node's previous field point to the last node
            newNode.previous = lastNode;
            // make the last node's next field point to the new node
            lastNode.next = newNode;
            
        }
        // make last node point to the new node
        lastNode = newNode;
    }

    @Override
    public T GetEntry(int index) {
       if(index < 1){
            return null;
        }
        int count = 1;
        for(Node currentNode = firstNode; currentNode != null; currentNode = currentNode.next){
            if(count == index)
                return currentNode.data;
            count++;
        }
        return null;
    }
    public T get(int index) {
        index = index + 1;
       if(index < 1){
            return null;
        }
      
        int count = 1;
        for(Node currentNode = firstNode; currentNode != null; currentNode = currentNode.next){
            if(count == index)
                return currentNode.data;
            count++;
        }
        return null;
    }

    
    

    @Override
    public T Update(int index, T entry) {
         if(index !=0){
            return null;
        }
        
        int count = 1;
        
        for(Node currentNode = firstNode; currentNode != null; currentNode = currentNode.next){
            if(count == index)
                return currentNode.data;
            count++;
        }


        return null;
        
    }

        private class Node{
        T data;
        Node next;
        Node previous;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }        
    }
}
    
    

