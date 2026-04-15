package com.example.exceptions.exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeChecker {

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number (1-100): ");
            int num = scanner.nextInt();

            if (num < 1 || num > 100) {
                throw new OutOfRangeException("Number is out of range!");
            }

            System.out.println("Valid number: " + num);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}