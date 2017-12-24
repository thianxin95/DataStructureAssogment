/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;
import JavaInterfaces.*;
import entity.*;


public class DoubleLinkListADT<T> implements DoublyLinkedList<T> {

      Node first = null;
      Node last = null;
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
            last.right = newNode;
            newNode.left = last;
            last = newNode;
        }
        size++;
    }
    
    public void deleteNode (T key) {
     if(first == null)
            throw new RuntimeException("cannot delete");

        if( first.data.equals(key) )
        {
           first = first.right;
           return;
        }

        Node<T> cur  = first;
        Node<T> prev = null;

        while(cur != null && !cur.data.equals(key) )
        {
           prev = cur;
           cur = cur.right;
        }

        if(cur == null)
           throw new RuntimeException("cannot delete");

        
        prev.right = cur.right;
        size --;
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
                current = current.right;
               
            }
            return current.data;
        }
    }
  
   


   
     private class Node<T> {
        private T data;
         Node right;
         Node left;

        public Node(T data) {
            this.data = data;
        }
    }

   
   

    

    

    
    public static void main(String args[]){
        DoubleLinkListADT<Integer> test = new DoubleLinkListADT<Integer>();
        test.Add(1);
        test.Add(2);
        test.Add(3);
        test.deleteNode(2);
        System.out.println("Test get :" + test.GetEntry(0));
        System.out.println("Test get 2:"  + test.GetEntry(1));
        System.out.println("Test get 3: " + test.GetEntry(2));

}
    
    
    
}
    
    

