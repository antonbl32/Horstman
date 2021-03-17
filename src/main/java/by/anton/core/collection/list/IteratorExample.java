package by.anton.core.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        myList1.add("Anton");
        myList1.add("Zaur");
        myList1.add("Timofey");
        myList1.add("Anton");
        Iterator<String> iterator=myList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(myList1);
    }

}
