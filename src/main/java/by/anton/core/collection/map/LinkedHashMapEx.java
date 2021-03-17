package by.anton.core.collection.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student> lhm=new LinkedHashMap<>();
        Student st1= new Student("Zaur","Tregulov",3);
        Student st2= new Student("Mariya","Timor",1);
        Student st3= new Student("Sergey","Vatov",4);
        Student st4= new Student("Anton","Sekil",3);
        Student st5= new Student("Elena","Omiu",2);
        Student st6= new Student("Oleg","Jfhd",5);
        lhm.put(5.8,st1);
        lhm.put(6.5,st2);
        lhm.put(7.9,st3);
        lhm.put(8.1,st4);
        lhm.put(5.6,st5);
        lhm.put(5.3,st6);
        System.out.println(lhm);

    }
}
