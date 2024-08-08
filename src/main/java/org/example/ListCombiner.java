package org.example;

import java.util.ArrayList;

public class ListCombiner {

    public static ArrayList<Integer> combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combined = new ArrayList<>(list1);
        combined.addAll(list2);
        return combined;
    }
}

