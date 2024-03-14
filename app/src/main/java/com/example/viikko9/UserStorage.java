package com.example.viikko9;

import java.util.ArrayList;

public class UserStorage {

    private static UserStorage userStorage = null;
    private ArrayList<User> users = new ArrayList<User>();

    private UserStorage() {

    }

    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }


}
