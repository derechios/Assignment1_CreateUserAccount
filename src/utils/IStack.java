package utils;

import Exceptions.EmptyListException;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
public interface IStack <T> {
    public T top() throws EmptyListException;
    public T pop();
    public void push(T element);
    public boolean isEmpty();
    public int size();
}
