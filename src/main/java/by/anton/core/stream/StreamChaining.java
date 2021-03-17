package by.anton.core.stream;

import java.util.Arrays;

public class StreamChaining {
    public static void main(String[] args) {
        int[] array={3,8,2,9,4,5,12,6,8,25,4,5};
        int resArray= Arrays.stream(array).filter(e->e%2==1)
                .map(e->{
                    if(e%3==0)
                        e=e/3;
                    return e;
                })
                .reduce((a,e)->a+e).getAsInt();
        System.out.println(resArray);
    }
}
