package by.anton.core.stream;

import java.util.stream.Stream;

public class StreamDistinctEx {//только уникальные значения
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(1,2,5,1,2,6,5,1,11,5);
        stream.distinct().forEach(System.out::print);
    }
}
