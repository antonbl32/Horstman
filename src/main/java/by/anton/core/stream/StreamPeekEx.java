package by.anton.core.stream;

import java.util.stream.Stream;

public class StreamPeekEx {
    public static void main(String[] args) { //просмотр отсортированного результата после операции интермидиат (i)
        Stream<Integer> stream=Stream.of(1,2,5,1,2,6,5,1,11,5);
        System.out.println(stream.distinct().peek(System.out::print).count());
    }
}
