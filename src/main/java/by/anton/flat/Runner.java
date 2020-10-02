package by.anton.flat;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class Runner {
    private static final Logger log=Logger.getLogger(Runner.class);
    static List device=new LinkedList<Device>();
    static String name="Coffecap";
    public static void main(String[] args) throws IOException {
        int k=5;
        readBase();
        System.out.println(device.size());
        System.out.println(device);

    }
    public static void addFileBase(){
        device.add(new Device("Стол",450,Type.Kitchen));
        log.info("Add Table");
        device.add(new Device(name,50,Type.Room));
        log.info("Add "+name);
        name="Car";
        device.add(new Device(name,25,Type.Bathroom,true,5));
        log.info("Add "+name);
        try{
            FileOutputStream fileOS=new FileOutputStream("C:\\\\TMP\\\\Device.des");
            ObjectOutputStream oos=new ObjectOutputStream(fileOS);
            oos.writeObject(device);
            log.info("Сохранили обьекты");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void readBase(){
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\\\TMP\\\\Device.des"));
            device.addAll((Collection) ois.readObject());
        }catch (Exception exc){
            log.error("Error reading file");
            System.out.println("Ошибка чтения базы");
            addFileBase();
            System.out.println("Создаем обьекты заново");
        }
    }
}
