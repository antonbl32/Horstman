package by.anton.core.nested_classes.staticclass;

public class Test {
    public static void main(String[] args) {
        Car car=new Car("black",4,new Car.Engine(120));
        Car.Engine engine=new Car.Engine(100);
        System.out.println(engine);
        System.out.println(car);

    }
}
