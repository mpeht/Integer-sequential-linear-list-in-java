/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist01;

/**
 *
 * @author mpeht
 */
public interface List {
    
    boolean insert(int value);
    int remove(int sumary);
    int replace(int newValue, int position);
    int size();
    boolean isEmpty();
    boolean isFull();
    void toPrint();
    
}
