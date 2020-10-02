package by.anton.flat;

import java.io.Serializable;

public class Device implements Cloneable, Serializable {
    private String name;
    private int price;
    private boolean isElectric;
    private int power=0;
    private TypeDevice typeDevice;

    public Device(String name, int price, Type type)  {
        this.name = name;
        this.price = price;
        if (type==null) System.out.println("Не верный тип данных");
        this.typeDevice=getTypeDevices(type);

    }
    public Device(String name, int price, Type type, boolean isElectric,int power) {
        this.name = name;
        this.price = price;
        if (isElectric){
            this.isElectric=true;
            this.power=power;
        }
        if (type==null) System.out.println("Не верный тип данных");
        this.typeDevice=getTypeDevices(type);

    }
    private static TypeDevice getTypeDevices(Type type){
        switch (type){
            case Kitchen:
               return new Kitchen(30);

            case Room:
                return new Room();

            case Bathroom:
                return new Bathroom();

        }
        return null;
    }
    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isElectric=" + isElectric +
                ", power=" + power +
                ", typeDevice=" + TypeDevice.class +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public TypeDevice getTypeDevice() {
        return typeDevice;
    }

    public void setTypeDevice(TypeDevice typeDevice) {
        this.typeDevice = typeDevice;
    }
}
