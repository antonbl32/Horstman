package by.anton.core.stream;

import com.mchange.v2.collection.MapEntry;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectGroupingPartitioning {//groupingby позволяет стрим разбить на листы по какомуто признаку
    public static void main(String[] args) {
        Student1 st1= new Student1("Ivan",'m',22,3,8.3);
        Student1 st2=new Student1("Vasia",'m',21,2,7.5);
        Student1 st3=new Student1("Masha",'f',22,3,9.3);
        Student1 st4=new Student1("Kostya",'m',23,4,8.6);
        Student1 st5=new Student1("Olga",'f',20,1,7.8);
        ArrayList<Student1> students=new ArrayList<>();
        students.addAll(Arrays.asList(st1,st2,st3,st4,st5));
        Map<Integer, List<Student1>> map=students.stream().map(e->{e.setName(e.getName().toUpperCase());
        return e;}).collect(Collectors.groupingBy(e->e.getCourse()));
        System.out.println(map);
        for (Map.Entry<Integer, List<Student1>> m:map.entrySet()
             ) {
            System.out.println(m.getKey()+" : "+m.getValue().toString());
        }
        //partitioningby разбивает по какомуто заданому признаку true или false на 2 группы лист
        Map<Boolean, List<Student1>> map2=students.stream().collect(Collectors.partitioningBy(e->e.getAvgGrade()>8));
        for (Map.Entry<Boolean, List<Student1>> m:map2.entrySet()
        ) {
            System.out.println(m.getKey()+" : "+m.getValue().toString());
        }


    }
}
