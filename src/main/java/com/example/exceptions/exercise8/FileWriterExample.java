package com.example.exceptions.exercise8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void writeToFile(String text) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(text);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}