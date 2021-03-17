package by.anton.core.nested_classes.innerclass;

public class Car {

    String color;
    int doorCount;
    Engine engine;
        public class Engine{ // вложенный зависимый класс
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

    public void setEngine(Engine engine){
            this.engine=engine;
    }
    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;

    }
//    public Car(String color, int doorCount, int horsePower) {
//        this.color = color;
//        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
//    }
}

class Test{
    public static void main(String[] args) {
//        Car car=new Car("black",4,100);
        Car car=new Car("black",4);
        Car.Engine engine=car.new Engine(100);
        car.setEngine(engine);
        System.out.println(car);

    }
}