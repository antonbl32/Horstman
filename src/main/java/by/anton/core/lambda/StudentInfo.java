package by.anton.core.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1=new Student("Ivan",'m',22,3,8.3);
        Student st2=new Student("Vasia",'m',21,2,7.5);
        Student st3=new Student("Masha",'f',22,3,9.3);
        Student st4=new Student("Kostya",'m',23,4,8.6);
        Student st5=new Student("Olga",'f',20,1,7.8);
        ArrayList<Student> students=new ArrayList<>();
        students.addAll(Arrays.asList(st1,st2,st3,st4,st5));




        StudentInfo info=new StudentInfo();
//        //info.testStudents(students,new CheckOverGrade());
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
        int a=22;
        System.out.println("-------------------------------------");
        info.testStudents(students, s->s.age < a);
       // info.printOverGrade(students,8.2);
       // info.printStudentsUnderYears(students,22);
      // info.printOverConditions(students,21,9.0,'m');

        Predicate<Student> p1= stud->stud.avgGrade>7.5;
        Predicate<Student> p2= stud1-> stud1.sex=='m';

        info.testStudents(students,p1.and(p2));
        Collections.sort(students,(s1,s2)->s1.course-s2.course);
        System.out.println(students);

    }
    void testStudents(ArrayList<Student> students, Predicate<Student> sc){
        for(Student st:students){
            if(sc.test(st)){
                System.out.println(st);
            }
        }
    }
//    void printOverGrade(ArrayList<Student> students,double grade){
//        for (Student st:students){
//            if(st.avgGrade>grade)
//                System.out.println(st);
//        }
//
//    }
//    void printStudentsUnderYears(ArrayList<Student> students,int ageUder) {
//        for (Student st : students) {
//            if (st.age < ageUder)
//                System.out.println(st);
//        }
//    }
//    void printOverConditions(ArrayList<Student> students,int age,double grade,char sex){
//        for (Student st : students) {
//            if (st.age > age && st.avgGrade<grade && st.sex==sex)
//                System.out.println(st);
//        }
//    }
}

interface  StudentChecks{
    boolean check(Student s);
}
//class CheckOverGrade implements StudentChecks{
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }
//}