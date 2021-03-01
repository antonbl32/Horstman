package by.anton.core.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        String s="madam";
        List<Character> list=new LinkedList<>();
        for (char ch:s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> iterator=list.listIterator();
        ListIterator<Character> reversIterator=list.listIterator(list.size());

        boolean result=false;
        while (iterator.hasNext() && reversIterator.hasPrevious()){

            if(iterator.next()!=reversIterator.previous()){
                System.out.println("It's not a palidrome");
                result=false;
                break;
            }
            result=true;
        }
        if(result) System.out.println("It's a palidrome");

        for (int i = 0; i <list.size()/2 ; i++) {
            if(iterator.next()!=reversIterator.previous()){
                System.out.println("It's not a palidrome");
                result=false;
                break;
            }
            result=true;
        }
        if(result) System.out.println("It's a palidrome");
    }
}
