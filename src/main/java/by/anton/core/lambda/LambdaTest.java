package by.anton.core.lambda;
import java.util.*;

public class LambdaTest{
    public static void main(String[] args)
    {
        List planets = Arrays.asList("Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune");
        planets.forEach(value-> System.out.println(value));
        ArrayList<String> myarray=new ArrayList<>(planets);
        System.out.println(planets);
        Collections.sort(planets, (Comparator<String>) (a, b) -> b.compareTo(a));
        myarray.forEach(System.out::println);
        System.out.println(myarray);


    }
}