package com.onurilyastokay.unittestexample.services;

import com.onurilyastokay.unittestexample.models.User;

public class UserService {

    public User createUser(Integer id, String name) {
        if (id < 0) {
            throw new IllegalArgumentException();
        }
        return new User(id, name);
    }
}
