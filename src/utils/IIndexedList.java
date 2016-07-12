package utils;

/**
 * Created by tkanchanawanchai6403 on 7/11/2016.
 */
public interface IIndexedList<T> extends IList<T> {
    public void add(T element, int index);
    public void set(T element, int index);
    public T remove(int index);
    public int indexOf(T element);
}
