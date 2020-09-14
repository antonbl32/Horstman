package by.anton.core.lambda;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest{
    public static void main(String[] args)
    {
        List<String> planets = Arrays.asList("Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune");
        planets.forEach(System.out::println);
        ArrayList<String> myarray=new ArrayList<>(planets);
        System.out.println(planets);
        Collections.sort(planets, (Comparator<String>) (a, b) -> b.compareTo(a));
        myarray.forEach(System.out::println);
        System.out.println(myarray);
        //LocalDate day=LocalDate.of(2020,02,02);
        //LocalDate localDate=Objects.requireNonNullElse(day, ()->
        //        new LocalDate(2020,1,1));
        List<String> fnames=Arrays.asList("Anton","Andrey","Vitaly","Alex");
        List<String> lnames=Arrays.asList("Ivanov","Sidorov","Koval","Telpuh");
        Map<String,String> allnames=new HashMap<>();
        int i=0;
        if(fnames.size()==lnames.size()) {
            for (String fname : fnames) {
                allnames.put(fname, lnames.get(i));
                i++;
            }
        }
        Stream<People> stream=allnames.entrySet().stream().map(People::new);
        List<People> allpeople=stream.collect(Collectors.toList());
        for (People p:allpeople) {
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }

    }
}