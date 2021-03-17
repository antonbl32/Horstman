package by.anton.core.lambda;

import com.mchange.v2.async.StrandedTaskReporting;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierInterface { //не принимает пораметров а метод get рзвращает тип T
    public static void main(String[] args) {
        ArrayList<Car> ourCars=getCars(()->new Car("tiida","black",2));
        System.out.println(ourCars);
        ourCars.forEach(System.out::println);
    }

   static ArrayList<Car> getCars(Supplier<Car> carSupplier){
        ArrayList<Car> list=new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list.add(carSupplier.get());
        }

        return list;
    }



}

class Car{

    String model;
    String color;
    int engine;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
}