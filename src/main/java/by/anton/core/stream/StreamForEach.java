package by.anton.core.stream;

import java.util.Arrays;

public class StreamForEach { //ничего не возвращает

    public static void main(String[] args) {
        int[] array={5,6,0,54,21,25};
//        Arrays.stream(array).forEach(el->{
//            el *=2;
//            System.out.println(el);
//        });
        Arrays.stream(array).forEach(Utils::kk);
    }
}

class Utils{
    static int methods(int a){
       return a+=5;
    }
    static void kk(int a){
        System.out.println(methods(a));
    }
}