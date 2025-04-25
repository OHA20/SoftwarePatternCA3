package com.example.ca4;

public class UserFactory {
    public static User createUser(String role, String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        return user;
    }
}