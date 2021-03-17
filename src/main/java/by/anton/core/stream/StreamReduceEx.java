package by.anton.core.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduceEx { //возвращает обьект Optional это wrap для обьекта из которого можно получить .get
    public static void main(String[] args) {
        List<Integer> list=List.of(2,5,4);
        int res =list.stream().reduce(1,(accumulator,el)->accumulator*el);//этапы (1*2)*5*4
        // accumulator - накопление результата, начальное значение accumulator=1 ,el - элемент
        List<Integer> list1=new ArrayList<>();
        Optional<Integer> o=list1.stream().reduce((ac, el)->ac*el);
        if(o.isPresent()){
            System.out.println(o.get());

        }else
            System.out.println("Not Present");

        List<String> list3=new ArrayList<>();
        list3.add("privet");
        list3.add("Hello");
        list3.add("Ok");
        list3.add("Poka");
        String result3=list3.stream().reduce((a,e)->a+" "+e).get();
        System.out.println(result3);
    }
}
