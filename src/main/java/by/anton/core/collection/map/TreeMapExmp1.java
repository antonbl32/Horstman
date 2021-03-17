package by.anton.core.collection.map;

import java.util.TreeMap;

public class TreeMapExmp1 {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap=new TreeMap<>();
        Student st1= new Student("Zaur","Tregulov",3);
        Student st2= new Student("Mariya","Timor",1);
        Student st3= new Student("Sergey","Vatov",4);
        Student st4= new Student("Anton","Sekil",3);
        Student st5= new Student("Elena","Omiu",2);
        Student st6= new Student("Oleg","Jfhd",5);
        treeMap.put(5.8,st1);
        treeMap.put(6.5,st2);
        treeMap.put(7.9,st3);
        treeMap.put(8.1,st4);
        treeMap.put(5.6,st5);
        treeMap.put(5.3,st6);
        System.out.println(treeMap);

        System.out.println(treeMap.descendingMap());//reverse сортировки
        System.out.println(treeMap.tailMap(6.4));//все ключи больше 6.4
        System.out.println(treeMap.headMap(6.4)); //все ключи меньше 6,4
        System.out.println(treeMap.lastEntry());
    }
}
