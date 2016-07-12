package CreateAccountUnitTest;

import org.junit.Before;
import org.junit.Test;
import utils.LinkedListStack;

import static org.junit.Assert.*;

/**
 * Created by tkanchanawanchai6403 on 7/11/2016.
 */
public class LinkedListStackTest {
    LinkedListStack<String> nameStack = new LinkedListStack<String>();
    String expectedPushResult = "David\tCathy\tBobby\tAndrew\t";
    String expectedPopResult = "Cathy\tBobby\tAndrew\t";
    String expectedTopResult = "David";
    int expectedSizeResult = 4;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void top() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        assertEquals("Top must contain \"David\"",expectedTopResult, (String)nameStack.top());
    }

    @Test
    public void pop() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        System.out.println(nameStack.pop());
        System.out.println(nameStack);
        assertEquals("After Pop, the stack must contain \"Cathy\tBobby\tAndrew\t",expectedPopResult,nameStack.toString());
    }

    @Test
    public void push() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        assertEquals("Stack must contain \"David\tCathy\tBobby\tAndrew\t\"",expectedPushResult,nameStack.toString());
    }


    @Test
    public void size() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        assertEquals("Stack size must be 4",expectedSizeResult,nameStack.size());
    }

    @Test
    public void isEmpty() throws Exception {

    }

//    public static void main(String [] args) {
//        LinkedListStack<String> nameStack = new LinkedListStack<String>();
//        nameStack.push("Andrew");
//        nameStack.push("Bobby");
//        nameStack.push("Cathy");
//        nameStack.push("David");
//
//        System.out.println(nameStack);
//    }
}