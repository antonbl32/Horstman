package by.anton.core.lambda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateInterface { //метод test возвращает boolean
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("Privet");
        a1.add("Poka");
        a1.add("Ok");
        a1.add("Uchim Java");
        a1.add("A imenno Lambda");
     //   a1.removeIf(element->element.length()<5);

        Predicate<String> p= element-> element.length()>5;
        Predicate<String> p1=el-> el.equals("A imenno Lambda");

        System.out.println(a1.stream().filter(p.and(p1)).count());;

        System.out.println(a1);

    }
}
