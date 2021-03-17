package by.anton.core.collection;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        Employee st1=new Employee(5,"Zaur",40);
        Employee st2=new Employee(10,"Evgen",35);
        Employee st3=new Employee(51,"Kate",40);
        Employee st4=new Employee(25,"Anton",19);
        Employee st5=new Employee(5,"Andrey",28);
        ArrayList<Employee> list=new ArrayList<>();
        list.addAll(Arrays.asList(st1,st2,st3,st4,st5));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,new Employee(25,"Anton",19)));
        int[] array={-3,8,12,-8,0,5,10,1,150,-30,19};
        Arrays.sort(array);
        System.out.println( Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,10));
        Collections.shuffle(list);
        System.out.println(list);

//        ArrayList<Integer> list=new ArrayList<>();
//        list.addAll(Arrays.asList(-3,8,12,-8,0,5,10,1,150,-30,19));
//        Collections.sort(list);
//        System.out.println(list);
//        int index1= Collections.binarySearch(list,12);
//        System.out.println(index1);
    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(@NotNull Employee emp) {
        int result=this.id-emp.id;
        if(result==0){
            result=this.name.compareTo(emp.name);
        }


        return result;
    }
}