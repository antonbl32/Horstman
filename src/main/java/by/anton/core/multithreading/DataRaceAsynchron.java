package by.anton.core.multithreading;

public class DataRaceAsynchron {
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
class Counter{
   volatile static int count=0;
}

class MyRunnableImpl implements Runnable{
    public void  increment(){ //��� ������������� ����� �������� synchronize
        Counter2.count++;
        System.out.print(Counter2.count+" ");
    }
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            increment();
        }
    }
}