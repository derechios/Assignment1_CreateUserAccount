package utils;

/**
 * Created by tkanchanawanchai6403 on 7/11/2016.
 */
interface IList<T> {
    void add(T element);

    T remove(T element);

    boolean contains(T element);

    boolean isEmpty();

    int size();

    T get(T element);

    void reset();

    T getNext();
}
