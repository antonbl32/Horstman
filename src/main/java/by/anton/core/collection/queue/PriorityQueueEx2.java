package by.anton.core.collection.queue;

import org.jetbrains.annotations.NotNull;


import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        PriorityQueue<Student1> queue=new PriorityQueue<>();
        Student1 st1=new Student1("Anton",2);
        Student1 st2=new Student1("Zaur",3);
        Student1 st3=new Student1("Andrei",3);
        Student1 st4=new Student1("Oleg",5);
        queue.add(st1);
        queue.add(st2);
        queue.add(st3);
        queue.add(st4);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
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