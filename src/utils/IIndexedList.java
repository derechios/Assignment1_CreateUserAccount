package utils;

/**
 * Created by tkanchanawanchai6403 on 7/11/2016.
 */
interface IIndexedList<T> extends IList<T> {
    void add(T element, int index);

    void set(T element, int index);

    T remove(int index);

    int indexOf(T element);
}
