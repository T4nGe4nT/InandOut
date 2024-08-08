package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputHandler {

    public ArrayList<Integer> readFile(String fileName) {
        ArrayList<Integer> storeList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    storeList.add(Integer.parseInt(line.trim()));
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in file: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return storeList;
    }
}

