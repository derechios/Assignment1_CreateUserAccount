package utils;

import Exceptions.EmptyListException;
import org.junit.Test;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
public class LinkedListStack <T> implements IStack<T>{
    private LinkedListNode<T> top;
    private int numElement=0;
    @Override
    public T top() throws EmptyListException {
        if(isEmpty()) {
            throw new EmptyListException("Cannot top an empty stack!");
        }

        return top.getElement();
    }

    @Override
    public T pop() {
        T element = top.getElement();
        top = top.getPointer();
        return element;
    }

    @Override
    public void push(T element) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);
        newNode.setPointer(top);
        top = newNode;
        numElement++;
    }

    @Override
    public boolean isEmpty() {
        return (numElement==0);
    }

    @Override
    public int size() {
        return numElement;
    }

    public String toString() {
        LinkedListNode<T> current = top;
        String list="";
        while(current!=null) {
            list+= current.getElement() + "\t";
            current = current.getPointer();
        }
        return list;
    }
}
