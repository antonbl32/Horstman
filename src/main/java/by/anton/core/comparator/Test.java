package by.anton.core.comparator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        Employee emp1=new Employee(100,"Zaur","Tregulov",1254);
        Employee emp2=new Employee(110,"Anton","Sh",5541);
        Employee emp3=new Employee(111,"Denis","Tkach",2500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);

        List<Employee> list2=list.stream().sorted(new CompareBySalary()).collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list2);
    }
}

class Employee implements java.lang.Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(@NotNull Employee o) {
       return  this.name.compareTo(o.name);

    }
}

class  CompareById implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.id==o2.id){
            return 0;
        }else if(o1.id>o2.id){
            return 1;
        }else return -1;
    }
}
class  CompareBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
      return o1.salary-o2.salary;
    }
}