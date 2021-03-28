package by.anton.core.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call=new Call();
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread th3=new Thread(new Runnable() {
            @Override
            public void run() {
                call.viberCall();
            }
        });
        th1.start();
        th2.start();
        th3.start();
    }

}
class Call{
    private Lock lock=new ReentrantLock();
    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Call start");
            Thread.sleep(3000);
            System.out.println("Call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            lock.unlock();
        }
    }
    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype Call start");
            Thread.sleep(3000);
            System.out.println("Skype Call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            lock.unlock();
        }
    }
    void viberCall(){
        lock.lock();
        try {
            System.out.println("Viber Call start");
            Thread.sleep(7000);
            System.out.println("Viber Call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            lock.unlock();
        }
    }
}
