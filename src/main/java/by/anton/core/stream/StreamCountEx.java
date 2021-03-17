package by.anton.core.stream;

import java.util.stream.Stream;

public class StreamCountEx {
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(1,2,5,1,2,6,5,1,11,5);
        Stream<Integer> stream2=Stream.of(1,2,5,1,2,6,5,1,11,5);
       Long l=stream.distinct().count();
        System.out.println(l);
        l=stream2.count();
        System.out.println(l);
    }
}
