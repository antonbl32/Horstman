package by.anton.core.multithreading;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main starts");
        UserThread userThread=new UserThread();
        userThread.setName("User");
        DaemonThread daemonThread=new DaemonThread();
        daemonThread.setName("Daemon");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main ends");
    }
}
class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" thread is daemon: "+ isDaemon());
        for (char i = 'A'; i <='J' ; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" thread is daemon: "+ isDaemon());
        for (int i = 1; i <1000 ; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}