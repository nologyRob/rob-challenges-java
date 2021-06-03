package com.nology.unittesting_06;

public class UserController {

    private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    public User[] getUsers() {
        return this.repository.getUsers();
    }

    public String updateUser(User user) {
        try {
            this.repository.updateScore(user);
            return "Successfully updated user";
        } catch (Exception e) {
            // ...TODO: Log the exception for us to monitor/understand
            return "Sorry! Something went wrong trying to update user: " + user;
        }
    }

    /**
    /* ...Extra Challenge #1: Add functionality for Creating Users
    /* ...Extra Challenge #2: Add functionality for Deleting Users
     */
}
