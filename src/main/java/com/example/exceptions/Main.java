package com.example.exceptions;

import com.example.exceptions.exercise1.BasicExceptionHandling;
import com.example.exceptions.exercise2.RangeChecker;
import com.example.exceptions.exercise3.BankAccount;
import com.example.exceptions.exercise3.InsufficientBalanceException;
import com.example.exceptions.exercise4.FileParser;
import com.example.exceptions.exercise5.FinallyExample;
import com.example.exceptions.exercise6.EmailValidator;
import com.example.exceptions.exercise7.*;
import com.example.exceptions.exercise8.FileWriterExample;

public class Main {

    public static void main(String[] args) {

        // Exercise 1
        BasicExceptionHandling.run();

        // Exercise 2
        RangeChecker.checkNumber();

        // Exercise 3
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        try {
            account.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Exercise 4
        FileParser.readFile("numbers.txt");

        // Exercise 5
        FinallyExample.run();

        // Exercise 6
        try {
            EmailValidator.validate("testemail.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Exercise 7
        NameManager manager = new NameManager();
        try {
            manager.addName("Manjula");
            manager.addName("Manjula");
        } catch (DuplicateNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.findName("Alice");
        } catch (NameNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Exercise 8
        FileWriterExample.writeToFile("Hello, Exception Handling!");
    }
}