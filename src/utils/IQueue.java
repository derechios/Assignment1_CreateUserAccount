package utils;

import Exceptions.UnderflowException;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
interface IQueue<T> {
    T dequeue() throws UnderflowException;

    boolean isEmpty();

    int size();
}
