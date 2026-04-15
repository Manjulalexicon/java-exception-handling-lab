package com.example.exceptions.exercise6;

public class EmailValidator {

    public static void validate(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address!");
        }
        System.out.println("Valid email: " + email);
    }
}