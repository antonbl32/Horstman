package by.anton.core.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapEx {
    public static void main(String[] args) { //из потока обьектов получить поток примитивов обьектов
        List<String> list=new ArrayList<>();
        list.add("privet");
        list.add("Hello");
        list.add("Ok");
        list.add("Poka");
        List list1 =list.stream().map(el->el.length()).collect(Collectors.toList());
        //System.out.println(list1);
        int[] array={5,6,0,54,21,25};
        //System.out.println(Arrays.toString(array));
        array=Arrays.stream(array).map(el->{
            if (el%3==0)el=el/3;
            return el;
        }).toArray();
       // System.out.println(Arrays.toString(array));
        Set<String> set=new TreeSet<>();
        set.addAll(list);
        System.out.println(set);
        List set2=set.stream().map(i->i.length()).collect(Collectors.toList());
        System.out.println(set2);


    }
}
