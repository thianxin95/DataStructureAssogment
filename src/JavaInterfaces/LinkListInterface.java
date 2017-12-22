/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

/**
 *
 * @author Leang <leang_97@hotmail.com>
 */
public interface LinkListInterface <T>{
    void addNodeFirst(T anEntry); // add an entry to the first node, removing its original data
    void addNodeLast(T anEntry); // add an entry to the last , removing its 
    void addNodeAfter(T NodeBefore , T NodeAfter);
    void addNodeBefore(T NodeAfter, T NodeBefore);
    void remove(T anENtry);
 //   void remove(int anIndex);
    void add(T anEntry);
    T get(int index);
    int getNumberofSize();
    T getEntry(int getEntry);


}
