package by.anton.core.stream;

import java.util.Arrays;

public class StreamSortedEx {
    public static void main(String[] args) {
        int[] array={3,8,2,1,4,5,12,6,8,25,4,5};
        array=Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
