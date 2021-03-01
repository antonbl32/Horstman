package by.anton.core.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder builder1=new StringBuilder("A");
        StringBuilder builder2=new StringBuilder("B");
        StringBuilder builder3=new StringBuilder("C");
        StringBuilder builder4=new StringBuilder("D");
        StringBuilder[] array={builder1,builder2,builder3,builder4};
        List<StringBuilder> list= Arrays.asList(array);
        System.out.println(list);
        builder2.append("!!!");
        array[2]=new StringBuilder("MMMM");
        System.out.println(list);

    }
}
