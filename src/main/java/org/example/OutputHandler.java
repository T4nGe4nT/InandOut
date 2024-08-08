package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OutputHandler {

    public void writeFile(String fileName, ArrayList<Integer> list) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Integer num : list) {
                writer.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  2 list to same file
    public void writeFile(String fileName, ArrayList<Integer> list1, ArrayList<Integer> list2) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Integer num : list1) {
                writer.println(num);
            }
            writer.println(); // Space between lists
            for (Integer num : list2) {
                writer.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



