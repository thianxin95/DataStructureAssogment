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
    public T displayDescending(T anEntry) {
    Node current = last;
   // int data1;
    while (current.left != null) {
        if (current.data>current.left.data) {
            anEntry = (T) current.left.data;
            current.left.data = current.data;
            current.data = anEntry;
            current = current.left;
        }
    return  (T) current.data;
        
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
        System.out.println("Test get :" + test.GetEntry(0));
        System.out.println("Test get 2:"  + test.GetEntry(1));
        System.out.println("Test get 3: " + test.GetEntry(2));

}
    
    
    
}
    
    

