package by.anton.core.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample1 {

    public static void main(String[] args) {
        LinkedList<Students2> list=new LinkedList<>();
        Students2 st1=new Students2("Zaur",4);
        Students2 st2=new Students2("Evgen",3);
        Students2 st3=new Students2("Kate",4);
        Students2 st4=new Students2("Anton",1);
        list.addAll(Arrays.asList(st1,st2,st3,st4));
        System.out.println(list);
        System.out.println(list.get(2));
        Students2 st5=new Students2("Misha",5);
        list.add(st5);

        Students2 st6=new Students2("Lima",2);
        list.add(2,st6);
        System.out.println(list);
        list.remove(2);

    }

}
class Students2{

    String name;
    int course;

    @Override
    public String toString() {
        return "Students2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Students2(String name, int course) {
        this.name = name;
        this.course = course;
    }
}