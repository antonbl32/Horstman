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
// tryLock ���������� boolean true  ���� ���������� ��������� lock
    /*
    if(lock.tryLock()){
    ��� �� �������
    }else{
    ���� ������, ����� ������
    }
    �.�. ����� �� ���� ������������, � ��������� ��������� �������
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
        System.out.println(name+" ����...");
        lock.lock();
        System.out.println(name+" ����������");
        try {
            Thread.sleep(2000);
            System.out.println(name+ " ��������");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}