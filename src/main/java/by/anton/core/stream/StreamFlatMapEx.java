package by.anton.core.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapEx {
    public static void main(String[] args) {//работа с обьектами когда сортируем обьект
        // в котором есть свои обьекты и можно с ними работать
            Student1 st1= new Student1("Ivan",'m',22,3,8.3);
             Student1 st2=new Student1("Vasia",'m',21,2,7.5);
             Student1 st3=new Student1("Masha",'f',22,3,9.3);
             Student1 st4=new Student1("Kostya",'m',23,4,8.6);
             Student1 st5=new Student1("Olga",'f',20,1,7.8);
            ArrayList<Student1> students=new ArrayList<>();
            students.addAll(Arrays.asList(st1,st2,st3,st4,st5));
            Faculty f1=new Faculty("Economics");
            Faculty f2=new Faculty("Applied maths");
            f1.addStudentsToFaculty(st1,st2,st3);
            f2.addStudentsToFaculty(st4,st5);
            List<Faculty> facultyList=new ArrayList<>();
            facultyList.addAll(List.of(f1,f2));
            facultyList.stream().flatMap(a->a.getStudent1s()
                    .stream()).forEach(s->System.out.println(s.getName()));



        }
    }
    class Faculty{
    String name;
    List<Student1> student1s;

        public List<Student1> getStudent1s() {
            return student1s;
        }

        public void setStudent1s(List<Student1> student1s) {
            this.student1s = student1s;
        }
        public void addStudentsToFaculty(Student1...values){
            this.student1s=Arrays.asList(values);
        }
        public Faculty(String name) {
            this.name = name;
            this.student1s = new ArrayList<>();
        }
    }

    class Student1 {
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

        public Student1(String name, char sex, int age, int course, double avgGrade) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }
    }