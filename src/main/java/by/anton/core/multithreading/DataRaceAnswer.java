package by.anton.core.multithreading;

public class DataRaceAnswer {
    static int counter=0;

    public static synchronized void increment(){ //synchronized ���������� ���� ����� ����� ����� �������

        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new R());
        Thread thread2=new Thread(new R());
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(counter);
    }
}

class R implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            DataRaceAnswer.increment();
        }
    }
}