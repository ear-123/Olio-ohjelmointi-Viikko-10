package com.example.viikko9;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
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

    public void addUser(Context context, User user) {
        users.add(user);
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("users.data", Context.MODE_PRIVATE));
            userWriter.writeObject(users);
            userWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
