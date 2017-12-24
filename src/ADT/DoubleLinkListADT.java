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
      public void Add(T newEntry) {
      
        Node newNode = new Node(newEntry);    
        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            newNode.left = last;
            last.right = newNode;
        }
        last = newNode;
        size ++ ;
    }

    
    @Override
    public boolean deleteNode(T anEntry)
    {
   if(first == null){
            return false;
        }else if(first.data.equals(anEntry)){
            //remove first node
            first.left = null;
            first = first.right;
            size--;
            return true;
        }else if(last.data.equals(anEntry)){
            //remove last node
            last = last.left;
            last.right = null;
            size--;
            return true;
        }else{
            //remove middle node
            Node currentNode = first;
            while(currentNode != null){
                if(currentNode.data.equals(anEntry)){
                    currentNode.left.right = currentNode.right;
                    currentNode.right.left = currentNode.left;
                    return true;
                }else{
                    currentNode = currentNode.right;
                }
            }
            size--;
        }
        return false;
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
    
    public String toString(){
        return "";
    }
  
    @Override
   public String reverseString(){
       Node currentNode = last;
       String result = "";
       
       for(int hight = getSize()-1; hight >=0; hight--){
           result = result + currentNode.data + " ";
           currentNode = currentNode.left;
       }
       
       return result;
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
    
    

