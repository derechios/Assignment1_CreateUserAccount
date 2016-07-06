package utils;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
public interface IQueue <T>{
    public void enqueue(T element);
    public T dequeue();
    public boolean isEmpty();
}