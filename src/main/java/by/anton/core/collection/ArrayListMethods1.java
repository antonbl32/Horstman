package by.anton.core.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("Anton");
        myList.add("Zaur");
        myList.add("Timofey");
        myList.set(1,"Misha"); //замена элемента
        System.out.println(myList);
        for (String s:myList
             ) {
            System.out.print(s+" ");
        }
        if(myList.remove("Misha")){
            System.out.println("Yes");
            System.out.println(myList);
        }

        int k=987654321;
        int revers=0;
        while(k>0){
            revers=revers*10+k%10;
            k=k/10;
        }
        System.out.println(revers);

    }



}
