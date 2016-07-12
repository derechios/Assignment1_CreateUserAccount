package utils;

/**
 * Created by tkanchanawanchai6403 on 7/11/2016.
 */
public interface IList<T> {
    public void add(T element);
    public T remove(T element);
    public boolean contains(T element);
    public boolean isEmpty();
    public int size();
    public T get(T element);
    public void reset();
    public T getNext();
}
