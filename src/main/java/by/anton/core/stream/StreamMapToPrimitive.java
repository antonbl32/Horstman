package by.anton.core.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToPrimitive {//пролучить примитивный стрим(в обертке Integer,Double) из списка int,double,long и операции суммы,среднего,
    // минимального и  максимального значения
    // если надо получить лист примитивом то надо обернуть примитив в обертку операцией boxed()
    public static void main(String[] args) {

        Student1 st1= new Student1("Ivan",'m',22,3,8.3);
        Student1 st2=new Student1("Vasia",'m',21,2,7.5);
        Student1 st3=new Student1("Masha",'f',22,3,9.3);
        Student1 st4=new Student1("Kostya",'m',23,4,8.6);
        Student1 st5=new Student1("Olga",'f',20,1,7.8);
        ArrayList<Student1> students= (ArrayList<Student1>) List.of(st1,st2,st3,st4,st5);
        int sum=students.stream().mapToInt(e->e.getAge()).sum();
        Double average=students.stream().mapToDouble(e->e.getAvgGrade()).average().getAsDouble();
        List<Integer> list=students.stream().mapToInt(e->e.getCourse()).boxed().collect(Collectors.toList());
        int max=students.stream().mapToInt(e->e.getAge()).max().getAsInt();

    }
}
