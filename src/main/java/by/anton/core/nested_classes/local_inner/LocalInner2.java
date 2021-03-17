package by.anton.core.nested_classes.local_inner;

public class LocalInner2 {

    public static void main(String[] args) {
        class Slogenie implements Math2{

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Slogenie slogenie=new Slogenie();
        System.out.println(slogenie.doOperation(5,4));

    }

}

interface Math2{
    int doOperation(int a, int b);
}