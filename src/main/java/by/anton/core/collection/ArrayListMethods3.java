package by.anton.core.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        myList1.add("Anton");
        myList1.add("Zaur");
        myList1.add("Timofey");
        myList1.add("Anton");
        List<String> myList2 = new ArrayList<>();
        myList2.add("!!!");
        myList2.add("???");
        myList1.addAll(2,myList2);
        System.out.println(myList1);
        myList2.clear();
        System.out.println(myList2.isEmpty());
        System.out.println(myList1.indexOf("Anton"));
        System.out.println(myList1.lastIndexOf("Anton"));
        System.out.println(myList1.contains("!!!"));
    }
}
