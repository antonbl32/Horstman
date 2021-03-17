package by.anton.core.collection.map;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Zaur");
        set.add("Anton");
        set.add("Oleg");
        System.out.println(set.add("Oleg"));
        System.out.println(set);
        for (String s:set
             ) {
            System.out.println(s);
        }
    }
}
