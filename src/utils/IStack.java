package utils;

import Exceptions.UnderflowException;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
interface IStack<T> {
    T top() throws UnderflowException;

    T pop() throws UnderflowException;

    boolean isEmpty();

    int size();
}
