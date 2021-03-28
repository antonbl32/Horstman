package by.anton.core.multithreading;

public class SynchronizeEx2 {
    static int counter=0;

    public static void increment() {
        synchronized (SynchronizeEx2.class) { //синхронизация по монитору класса
            counter++;

        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new RR());
        Thread thread2=new Thread(new RR());
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(counter);
    }
}

class RR implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            DataRaceAnswer.increment();
        }
    }
}
