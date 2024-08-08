package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler(); // Single instance for reading
        OutputHandler outputHandler = new OutputHandler(); // Instance for writing files

        System.out.println("Reading List 1");

        // Read from Input1.txt
        ArrayList<Integer> fileContents1 = inputHandler.readFile("./src/Input1.txt");

        System.out.println("List 1 read.");
        // Print the contents of Input1.txt
//        System.out.print("Input1: ");
//        System.out.println(); // Eating a line
//        for (Integer num : fileContents1) {
//            System.out.print(num + " ");
//        }
//        System.out.println(); // Eating a line for separation

        System.out.println("Read list 2");

        // Read from Input2.txt
        ArrayList<Integer> fileContents2 = inputHandler.readFile("./src/Input2.txt");

        System.out.println("List 2 read");
//        // Print the contents of Input2.txt
//        System.out.print("Input2: ");
//        System.out.println(); // Eating a line
//        for (Integer num : fileContents2) {
//            System.out.print(num + " ");
//        }
//        System.out.println(); // Eating a line for separation

        System.out.println("Combining the Lists.");

        // Combine the two lists using ListCombiner
        ArrayList<Integer> combinedList = ListCombiner.combine(fileContents1, fileContents2);

        // Print the combined list
//        System.out.print("Combined: ");
//        for (Integer num : combinedList) {
//            System.out.print(num + " ");
//        }
//        System.out.println(); // Eating a line for separation

        // Write both lists to combined.txt with a space between them
        outputHandler.writeFile("./src/combined.txt", fileContents1, fileContents2);

        System.out.println("Lists combined. Check combined.txt for result");

        // Setup for reading the combined file
        ArrayList<Integer> combinedFileContents = inputHandler.readFile("./src/combined.txt");

        // Going over the new combined arraylist for duplicates
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : combinedFileContents) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> duplicatesList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicatesList.add(entry.getKey());
            }
        }

        outputHandler.writeFile("./src/common.txt", duplicatesList);
        System.out.println("Duplicates written to common.txt");
    }
}



