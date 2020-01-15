package com.zachpuls.pantryui.model;

public class User {
    private int id;
    private String username;
    private String email;
    private String phoneNumber;

    public User() {
    }

    public User(int id, String username, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String RequestCreate(final String username, final String password, final String email, final String phoneNumber) {
        return "";
    }

    public boolean ConfirmCreate(final String username, final String accessCode) {
        return false;
    }

    public String RequestPasswordReset(final String username) {
        return "";
    }

    public boolean ConfirmPasswordReset(final String username, final String accessCode, final String newPassword) {
        return false;
    }
}
