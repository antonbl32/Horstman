package by.anton.core.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(254511245,"Anton Shylau");
        hashMap.put(254658854,"Zaur Trekulov");
        hashMap.put(265214451,"Ivan Ivaniv");
        hashMap.put(265215478,"Nokialy Petrov");
        hashMap.putIfAbsent(265215478,"Nokialy Petrov2");
        System.out.println(hashMap);
        System.out.println(hashMap.get(254511245));
        hashMap.remove(265215478);
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("Zaur Trekulov"));
        System.out.println(hashMap.containsKey(154454));
        Set keyset=hashMap.keySet();
        System.out.println(keyset);
        Collection<String> h= hashMap.values();
        System.out.println(h);

    }



}
