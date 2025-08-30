package com.leonel.javabank.model;

public class User {
    private final String name;
    private final String id;
    private final String email;
    private final String password;

    public User(String newName, String newId, String newEmail, String newPassword) {
        this.name = newName;
        this.id = newId;
        this.email = newEmail;
        this.password = newPassword;
    }

    @Override
    public String toString() {
        return "USER" +
                "\nName: " + name +
                "\nID: " + id +
                "\nE-mail: " + email +
                "\nPassword: " + password;
    }
}