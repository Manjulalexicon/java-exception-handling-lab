package com.example.exceptions.exercise5;

import java.util.Scanner;

public class FinallyExample {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            System.out.println("Result: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Execution completed (finally block).");
        }
    }
}