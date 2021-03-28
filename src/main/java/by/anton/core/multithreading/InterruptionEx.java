package by.anton.core.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread th1=new InterruptedThread();
        th1.start();
        Thread.sleep(20);
        th1.interrupt();
        th1.join();
        System.out.println("Main ends");
    }
}
class InterruptedThread extends Thread{
    double sqrtSum=0;
    @Override
    public void run() {
        for (int i = 0; i <=100000000 ; i++) {
            if(isInterrupted()){
                break;
            }
            sqrtSum+=Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}