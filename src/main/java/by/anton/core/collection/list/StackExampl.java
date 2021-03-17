package by.anton.core.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExampl {
    public static void main(String[] args) {
        Stack<String> myList1 = new Stack<>();
        myList1.push("Anton");
        myList1.push("Zaur");
        myList1.push("Timofey");
        myList1.push("Anton");
        System.out.println(myList1.peek());
        System.out.println(myList1);
        System.out.println(myList1.pop());
        System.out.println(myList1);
    }
}
