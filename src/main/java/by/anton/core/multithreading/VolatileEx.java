package by.anton.core.multithreading;

public class VolatileEx extends Thread {
    volatile boolean b=true;//не атомарная переменная не кэшируется в процессоре,
    // только 1 поток меняет, остальные только считывают
    @Override
    public void run() {
        long counter=0;
        while (b){
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread=new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 sec to wake up!");
        thread.b=false;
        thread.join();
        System.out.println("End of programm");
    }


}
