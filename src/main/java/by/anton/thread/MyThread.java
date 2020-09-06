package by.anton.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toCollection;

public class MyThread {
    public static void main(String[] args) {
        MiniThread miniThread=new MiniThread();
        miniThread.start();
        Scanner scanner=new Scanner(System.in);
        scanner.hasNextLine();
        stopThread(miniThread);
        List myList= new ArrayList();
        myList.add("Hello");
        myList.add("Privet");
        List list= Collections.unmodifiableList(new ArrayList<>(myList));
        myList.add("Tree");
        for (Object m:list
             )
            System.out.println(m); {

        }

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
                    sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
