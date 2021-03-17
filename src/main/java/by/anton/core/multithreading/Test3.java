package by.anton.core.multithreading;

public class Test3 implements Runnable {

    public static void main(String[] args) {
        MyThread5 myThread5=new MyThread5();
        myThread5.setName("MyThread #1");
        myThread5.setPriority(9);
        System.out.println("Name= "+myThread5.getName() + ", Priority= "+myThread5.getPriority());

        MyThread5 myThread6=new MyThread5();
        myThread6.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name= "+myThread6.getName() + ", Priority= "+myThread6.getPriority());
        Thread thread=new Thread(new Test3());
        thread.start();
        System.out.println("Now "+Thread.currentThread().getName());


    }

    @Override
    public void run() {
        System.out.println("Run: "+Thread.currentThread().getName());
    }
}

class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("privet");
    }
}