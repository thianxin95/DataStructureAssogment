/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.*;
import entity.*;
/**
 *
 * @author Leang <leang_97@hotmail.com>
 */
public class LinkList<T> implements LinkListInterface<T> {

    @Override
    public int getNumberofSize() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return size;
    }
    /* Author : leang
    A drawing of the node to get a CLEARER VIEW
    [ Head ] --- > [  ] ---> [ Tail ]
    
    Add Method(), In example add 1 into the Node
    [1]
    and then, add 2
Index    
    0         1  
    [2] ---> [1]
    At this point if get(0), it will return 2
    
    Add 3
    0         1        2
    [3] ---> [2] ---> [1]
    At this point, get(0) will return 3, get(1) will return 2 , get(3) will return 1
    
    
    
    UPDATE:
    Reversed ADD METHOD
    So it will add at NODE LAST instead of HEAD!!!! BEWARE
    */

    @Override
    public T getEntry(int getEntry) {
        
        getEntry --;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if (head == null) throw new IndexOutOfBoundsException();

         Node<T> tmp = head;
         for (int k = 0; k < getEntry; k++) tmp = tmp.next;
        ////
         if( tmp == null) throw new IndexOutOfBoundsException();
            return tmp.data;
    
    
    
    }
    
    private static class Node<T>
    {
       private T data;
       private Node<T> next;

       public Node(T data, Node<T> next)
       {
          this.data = data;
          this.next = next;
       }
    }
    private Node<T> head;
    int size =0;
    public LinkList(){
        head = null;
    }
     @Override
    public void add(T anEntry) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if( head == null)
            addNodeFirst(anEntry);
        else
        {
           Node<T> tmp = head;
           while(tmp.next != null) tmp = tmp.next;

           tmp.next = new Node<T>(anEntry, null);
           size++;
        }
    }
    @Override
    public void addNodeFirst(T anEntry) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          head = new Node<T>(anEntry, head);
          size ++;
    
    }

    @Override
    public void addNodeLast(T anEntry) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if( head == null)
         addNodeFirst(anEntry);
      else
      {
         Node<T> tmp = head;
         while(tmp.next != null) tmp = tmp.next;

         tmp.next = new Node<T>(anEntry, null);
         size ++;
      }
      
    }

    @Override
    public void addNodeAfter(T NodeBefore, T NodeAfter) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Node<T> tmp = head;

      while(tmp != null && !tmp.data.equals(NodeBefore)) tmp = tmp.next;

      if(tmp != null)
         tmp.next = new Node<T>(NodeAfter, tmp.next);
    }

    @Override
    public void addNodeBefore(T NodeAfter, T NodeBefore) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(head == null) return;

        if(head.data.equals(NodeAfter))
        {
           addNodeFirst(NodeBefore);
           return;
        }

        Node<T> prev = null;
        Node<T> cur = head;

        while(cur != null && !cur.data.equals(NodeAfter))
        {
           prev = cur;
           cur = cur.next;
        }
        //insert between cur and prev
        if(cur != null)
           prev.next = new Node<T>(NodeBefore, cur);
    
    
    
    }

    @Override
    public void remove(T anENtry) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(head == null)
            throw new RuntimeException("cannot delete");

        if( head.data.equals(anENtry) )
        {
           head = head.next;
           return;
        }

        Node<T> cur  = head;
        Node<T> prev = null;

        while(cur != null && !cur.data.equals(anENtry) )
        {
           prev = cur;
           cur = cur.next;
        }

        if(cur == null)
           throw new RuntimeException("cannot delete");

        //delete cur node
        prev.next = cur.next;
        size --;
    }
    
    
    
    @Override
    public T get(int index) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if (head == null) return null;

      Node<T> tmp = head;
      for (int k = 0; k < index; k++) tmp = tmp.next;
        ////
      if( tmp == null) return null;
            return tmp.data;
    }
    
    
    
 /*  public static void main(String args[]){
       LinkList list = new LinkList();
       list.addNodeLast(1);
       list.addNodeLast(2);
       list.addNodeLast(3);
       
       System.out.print(list.get(0));
              System.out.print(list.get(1));
                     System.out.print(list.get(2));
                     System.out.println("Size :" + list.getNumberofSize());
       list.remove(list.get(0));
        System.out.print(list.get(0));

   }*//////
    
}
