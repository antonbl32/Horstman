package by.anton.core.multithreading;

public class SynchronizeEx3 {
    private static final Object lock=new Object();//пустой обьект для синхронизации методов по монитору этого обьекта
    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");

        }
    }
    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }
    void viberCall() {
        synchronized (lock) {
            System.out.println("Viber call starts");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Viber call ends");
        }
    }
    public static void main(String[] args) {
        Thread th1=new Thread(new Mobile());
        Thread th2=new Thread(new Skype());
        Thread th3=new Thread(new Viber());
        th1.start();
        th2.start();
        th3.start();
    }


}
class Mobile implements Runnable {

    @Override
    public void run() {

            new SynchronizeEx3().mobileCall();

    }
}
class Skype implements Runnable {

    @Override
    public void run() {

            new SynchronizeEx3().skypeCall();

    }
}
class Viber implements Runnable {

    @Override
    public void run() {

            new SynchronizeEx3().viberCall();


    }
}