package by.anton.core.multithreading;

public class SynchronizeEx1 {
    public static void main(String[] args) {
        MyRunnable1Impl runnable=new MyRunnable1Impl();
        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }

}
class Counter2 {
    volatile static int count=0;
}

class MyRunnable1Impl implements Runnable{
    public void doWork2(){
        System.out.println("Go-go-go!!!");
    }
    public  void doWork1(){
        this.doWork2();
        synchronized (this) {//синхронизируется по монитору обьекта или класса
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            doWork1();
        }
    }
}
