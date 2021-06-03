package com.nology.unittesting_06;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<User>();

    public UserRepository() {
        users.add(new User("johndoe"));
        users.add(new User("janedow"));
        users.add(new User("tomsmith"));
        users.add(new User("sarahsmith"));
    }

    public User[] getUsers() {
        return (User[]) this.users.toArray();
    }

    /**
     * Inside ChallengeTest, write positive, negative tests for this function
     */
    public User updateScore(User user) {
        // 1. Valid Incoming Arguments
        if (user.getScore() < 0) {
            throw new IllegalArgumentException("Invalid score provided: " + user.getScore());
        }

        Optional<User> result = this.users.stream().filter(p -> p.getUserName() == user.getUserName()).findFirst();
        if (!result.isPresent()) {
            throw new NoSuchElementException("No user found with username: " + user.getUserName());
        }

        // 2. Arguments are valid, update our person
        result.get().setScore(user.getScore());
        return result.get();
    }
}
