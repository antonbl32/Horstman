package by.anton.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("Anton");
        myList.add("Zaur");
        myList.add("Timofey");
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
    }
}
