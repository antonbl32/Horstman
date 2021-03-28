package by.anton.core.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        new Employee("Maks",lock);
        new Employee("Andrey",lock);
        new Employee("Demis",lock);
        new Employee("Kate",lock);
        new Employee("Tanya",lock);

    }
// tryLock возвращает boolean true  если получилось поставить lock
    /*
    if(lock.tryLock()){
    что то сделать
    }else{
    было занято, делаю другое
    }
    т.е. поток не ждет освобождения, а выполняет следующие строчки
     */

}
class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name,Lock lock){
        this.name=name;
        this.lock=lock;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name+" ждем...");
        lock.lock();
        System.out.println(name+" пользуемся");
        try {
            Thread.sleep(2000);
            System.out.println(name+ " закончил");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}