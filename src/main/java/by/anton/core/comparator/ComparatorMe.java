package by.anton.core.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparatorMe {
    public static void main(String[] args) {
        String[] mass=new String[]{"Привет","Байбай","Как дела","Ноу ной"};

        for (String m:mass
             ) {
            System.out.print(" "+m + " ");
        }
        System.out.println();
        ArrayList<String> mass1=new ArrayList<String>(Arrays.asList(mass));
        Collections.sort(mass1);
        System.out.println(mass1);
    }
}
