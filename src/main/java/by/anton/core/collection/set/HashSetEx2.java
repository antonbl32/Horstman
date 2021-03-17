package by.anton.core.collection.map;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(10);
        HashSet<Integer> hashSet2=new HashSet<>();
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(8);
        hashSet2.add(3);
        HashSet<Integer> hashSetResult=new HashSet<>(hashSet);
        hashSetResult.removeAll(hashSet2);//разность множеств 1 и 2
//      hashSetResult.retainAll(hashSet2);//пересечение множеств 1 и 2
//        hashSetResult.addAll(hashSet2);//обьединение множеств 1 и 2
        System.out.println(hashSetResult);





    }
}
