package model;

import java.util.ArrayList;

/**
 * Created by tkanchanawanchai6403 on 6/30/2016.
 */
public class UserDB {

  /*  private static LinkedListStack<User> users = new LinkedListStack<>();

    public static LinkedListStack<User> getUsers() {
            return users;
    }

    public static void setUsers(LinkedListStack<User> users) {
            UserDB.users = users;
    }*/

//
//    private static ArrayQueue<User> users = new ArrayQueue<User>();
private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserDB.users = users;
    }
}
