package by.anton.core.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
    Students st1=new Students("Denis",'M',21,3,7.8);
    Students st2=new Students("Anton",'M',29,5,8.1);
    Students st3=new Students("Sasha",'W',24,2,8.7);
        List<Students> list = new ArrayList<>();
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
        list.addAll(List.of(st1,st2,st3));

        System.out.println(list);
        Students st4=new Students("Anton",'M',29,5,8.1);

        list.remove(st4);
        System.out.println(list);



    }



}

class Students{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Students(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return sex == students.sex &&
                age == students.age &&
                course == students.course &&
                Double.compare(students.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, students.name);
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
}