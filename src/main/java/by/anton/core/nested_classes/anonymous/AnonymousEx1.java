package by.anton.core.nested_classes.anonymous;

public class AnonymousEx1 {
    public static void main(String[] args) {
        Math2 m =new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(m.doOperation(5,8));;

    }


}
interface Math2{
    int doOperation(int a, int b);
}