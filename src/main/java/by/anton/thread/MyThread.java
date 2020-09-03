package by.anton.thread;

import java.util.Scanner;

public class MyThread {
    public static void main(String[] args) {
        MiniThread miniThread=new MiniThread();
        miniThread.start();
        Scanner scanner=new Scanner(System.in);
        scanner.hasNextLine();
        stopThread(miniThread);
    }
    private static void stopThread(MiniThread miniThread){
        miniThread.stopMe=false;
    }
    static class MiniThread extends Thread{
        static int k;
        boolean stopMe=true;
        @Override
        public void run() {
            while (stopMe){
                System.out.println("Hello " +k++);
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
