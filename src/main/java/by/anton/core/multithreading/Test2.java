package by.anton.core.multithreading;

public class Test2 extends Thread {
    @Override
    public void run() {
        System.out.println("Main class");
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new Test2());
        thread.start();
        Thread thread1=new Thread(new MyThread10());
        Thread thread2=new Thread(new MyThread20());
        thread1.start();
        thread2.start();

        //анонимного класса
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("next gen");
            }
        }).start();
        // с использованием лямбды
        new Thread(()-> System.out.println("Lambda")).start();
    }
}

class MyThread10 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <1000 ; i++) {
            System.out.println(i);

        }
    }
}
class MyThread20 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);

        }
    }
}