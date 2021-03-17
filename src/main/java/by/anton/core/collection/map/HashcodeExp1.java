package by.anton.core.collection.map;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashcodeExp1 {
    public static void main(String[] args) {
        Map<Student,Double> map=new HashMap<>();
        Student st1= new Student("Zaur","Tregulov",3);
        Student st2= new Student("Mariya","Timor",1);
        Student st3= new Student("Sergey","Vatov",4);
        map.put(st1,7.5);
        map.put(st2,8.6);
        map.put(st3,6.9);
        System.out.println(map);

        Student st4= new Student("Zaur","Tregulov",3);
        boolean result=map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.hashCode()+" "+st4.hashCode());
        Student st5= new Student("Igor","Sidorov",5);

        for(Map.Entry<Student,Double> entry: map.entrySet()){ //итератор для обходя hashmap
            System.out.println(entry.getKey() + ":"+entry.getValue());

        }

    }
}

class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);

    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.name.compareTo(o.name);
    }
}