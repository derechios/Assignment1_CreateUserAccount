package CreateAccountUnitTest;

import org.junit.Test;
import utils.ArrayOrderedList;

/**
 * Created by tkanchanawanchai6403 on 7/14/2016.
 */
public class ArrayOrderedListTest {
    ArrayOrderedList<String> orderedList = new ArrayOrderedList<String>(5);

    @Test
    public void size() throws Exception {

    }

    @Test
    public void add() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        System.out.println(orderedList);
        orderedList.add("D");
        System.out.println(orderedList);
    }

    @Test
    public void contains() throws Exception {

    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void reset() throws Exception {

    }

    @Test
    public void getNext() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

    }

}