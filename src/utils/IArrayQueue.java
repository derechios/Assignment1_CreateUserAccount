package utils;

import Exceptions.OverflowException;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
interface IArrayQueue<T> extends IQueue<T> {
    void enqueue(T element) throws OverflowException;

    boolean isFull();
}
