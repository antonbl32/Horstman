package by.anton.core.collection.map;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Student1> treeSet=new TreeSet<>();
        Student1 st1=new Student1("Anton",2);
        Student1 st2=new Student1("Zaur",4);
        Student1 st3=new Student1("Andrei",3);
        Student1 st4=new Student1("Oleg",5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        Student1 st5=new Student1("Anton",2);
        Student1 st6=new Student1("Denis",4);
        System.out.println(treeSet.headSet(st5,true));
        System.out.println(treeSet.tailSet(st5,true));
        System.out.println(treeSet.subSet(st5,st6));
        System.out.println(st1.equals(st5));
        System.out.println(st1.hashCode()==st5.hashCode());
    }
}

class Student1 implements Comparable<Student1>{
    String name;
    int course;

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student1(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return course == student1.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(@NotNull Student1 o) {
        return this.course-o.course;
    }
}
