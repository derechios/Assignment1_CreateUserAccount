package utils;

/**
 * Created by tkanchanawanchai6403 on 7/6/2016.
 */
public class LinkedListQueue <T> implements IQueue{
    LinkedListNode head;
    LinkedListNode tail;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(Object element) {

    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
