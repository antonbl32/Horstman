package by.anton.core.nested_classes.staticclass;

public class Car {

    String color;
    int doorCount;
    Engine engine;
public static class Engine{ // используется как обыкновенный внешний класс
    int horsePower;

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }
}
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
}
