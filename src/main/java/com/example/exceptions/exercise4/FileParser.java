package com.example.exceptions.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

public class FileParser {

    public static void readFile(String filePath) {

        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));

            for (String line : lines) {
                try {
                    int number = Integer.parseInt(line);
                    System.out.println("Parsed: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + line);
                }
            }

        } catch (NoSuchFileException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO error occurred.");
        }
    }
}