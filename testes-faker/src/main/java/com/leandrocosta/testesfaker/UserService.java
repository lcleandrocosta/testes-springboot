package com.leandrocosta.testesfaker;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();
    
    public void create(User user) {
        users.put(user.username(), user);
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}
