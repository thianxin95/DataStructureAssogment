/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import JavaInterfaces.QueueInterface;

/**
 *
 * @author Daniel
 */
public class Queue<T> implements QueueInterface<T> {
    
    private Node front;
    private Node back;
    private int numberOfItem = 0;
    
    public Queue(){
        front = null;
        back = null;
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry, null);
        
        if(isEmpty()){
            front = newNode;
        }else{
            back.next = newNode;
        }
        back = newNode;
        numberOfItem++;
    }

    @Override
    public T dequeue() {
        T temp = null;
        if(!isEmpty()){
            temp = front.item;
            front = front.next;
            numberOfItem--;
            if(front == null){
                back = null;
            }
        }
        
        return temp;
    }

    @Override
    public T getFront() {
        T temp = null;
        if(!isEmpty()){
            temp = front.item;
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return (front == null) && (back == null);
    }

    @Override
    public int getSize() {
        return numberOfItem;
    }
    private class Node{
        private T item;
        private Node next;
        
        private Node(T dataPortion){
            item = dataPortion;
            next = null;
        }
        private Node(T dataPortion, Node linkPortion){
            item = dataPortion;
            next = linkPortion;
        }
    }
//    public static void main(String[] args) {
//        Queue de = new Queue();
//        de.enqueue(40);
//        de.enqueue(30);
//        de.enqueue(20);
//        System.out.println(de.getSize());
//        System.out.println(de.getFront());
//        System.out.println(de.dequeue());
//        System.out.println(de.getSize());
//        System.out.println(de.getFront());
//        System.out.println(de.isEmpty());
//        System.out.println(de.getFront());
//        
//    }
}
