package com.example.exceptions.exercise1;

import java.util.Scanner;

public class BasicExceptionHandling {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int a = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}