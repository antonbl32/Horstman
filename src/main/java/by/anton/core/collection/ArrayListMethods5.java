package by.anton.core.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("Anton");
        myList.add("Zaur");
        myList.add("Timofey");
        myList.add("Tanya");
        myList.add("Sanya");
        List<String> myList2= new ArrayList<>();
        myList2.add("Anton");
        myList2.add("Timofey");
        myList2.add("Misha");
        System.out.println(myList.containsAll(myList2));//содержит ли лист1 все элементы лист2
        List<String> list3=myList.subList(0,2);
       // myList.retainAll(myList2); //удалит все которые не содержатся в myList2
        list3.add("????");
        System.out.println(myList);
        System.out.println(list3);
        Object[] array1=myList.toArray();
        String[] array2=myList.toArray(new String[0]); //при параметре 0 авторазмер массива
        Arrays.stream(array2).forEach(System.out::println);
        List<Integer> list1= List.of(3,8,5,4,2,1,2,1,4,5,10);//unmodificable list
       // List<String> list2=List.copyOf(myList);//не модифицируемый лист не может содержать налл


    }
}
