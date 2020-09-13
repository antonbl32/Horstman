package by.anton.core.lambda;


import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaWay {


    public static void main(String[] args) {

       //Funtional interface
        Predicate<Integer> mm=x->x>0;
        System.out.println(mm.test(1));

        //передача метода

        ActionListener actionListener=System.out::println;
        Timer timer=new Timer(1000,actionListener);
        timer.start();
       // JOptionPane.showInputDialog("Введите число");
       // System.exit(0);

        //Передача конструктора

        List<String> names=Arrays.asList("Anton","Denis","Sasha");
        Stream<Person> stream= names.stream().map(Person::new);
        List<Person> people=stream.collect(Collectors.toList());
        for (Person p:people
             ) {
            System.out.println(p.getName());
        }

    }
}
