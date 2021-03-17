package by.anton.core.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        Student1 st1= new Student1("Ivan",'m',22,3,8.3);
        Student1 st2=new Student1("Vasia",'m',21,2,7.5);
        Student1 st3=new Student1("Masha",'f',22,3,9.3);
        Student1 st4=new Student1("Kostya",'m',23,4,8.6);
        Student1 st5=new Student1("Olga",'f',20,1,7.8);
        ArrayList<Student1> students=new ArrayList<>();
        students.addAll(Arrays.asList(st1,st2,st3,st4,st5));
        Double dd=8.8;
        int k=0;
        List list =students.stream().filter(el->el.getAge()>k&&el.getAvgGrade()<dd).collect(Collectors.toList());
        System.out.println(list);
        students.stream().filter(el->el.getAge()>k&&el.getAvgGrade()<dd).forEach(System.out::println);
        Stream<Student1> myStream=Stream.of(st1,st2,st3,st4);
        List list1=students.stream().sorted((s,b)-> s.getName().compareTo(b.getName())).collect(Collectors.toList());
        System.out.println("________________________________________");
        students.stream().map(e->{
            e.setName(e.getName().toUpperCase());
            return e;
        })
                .filter(e->e.getSex()=='f').sorted(Comparator.comparing(Student1::getAge)).forEach(System.out::println);



    }
}


class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}