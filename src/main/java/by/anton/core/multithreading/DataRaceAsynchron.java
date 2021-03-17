package by.anton.core.multithreading;

public class DataRaceAsynchron {
    public static void main(String[] args) {
        MyRunnableImpl runnable=new MyRunnableImpl();
        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }

}
class Counter{
   volatile static int count=0;
}

class MyRunnableImpl implements Runnable{
    public void increment(){
        Counter.count++;
        System.out.print(Counter.count+" ");
    }
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            increment();
        }
    }
}