package com.example.exceptions.exercise7;

import java.util.ArrayList;
import java.util.List;

public class NameManager {

    private List<String> names = new ArrayList<>();

    public void addName(String name) throws DuplicateNameException {
        if (names.contains(name)) {
            throw new DuplicateNameException("Name already exists!");
        }
        names.add(name);
    }

    public String findName(String name) throws NameNotFoundException {
        if (!names.contains(name)) {
            throw new NameNotFoundException("Name not found!");
        }
        return name;
    }
}