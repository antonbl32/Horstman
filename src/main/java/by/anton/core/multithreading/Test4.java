package by.anton.core.multithreading;

public class Test4 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <10 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new MyRunnable1());
        Test4 thread2=new Test4();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("GameOver");//главный поток ждет выполнения потоков с join
    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }
    }
}