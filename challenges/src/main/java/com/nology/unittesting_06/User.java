package com.nology.unittesting_06;

public class User {

    private String username;
    private int score;

    public User(String username) {
        this.username = username;
        this.score = 0;
    }

    public String getUserName() {
        return this.username;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        // ... How can we change this to cope with bad/negative/null inputs?
        this.score = score;
    }

}
