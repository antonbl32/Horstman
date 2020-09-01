package by.anton.thread;

import java.util.concurrent.Exchanger;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> ex = new Exchanger<String>();
        String mess="Первый";
        mess=ex.exchange(mess);
        int k =1;
        MyThread myThread1=new MyThread(ex);
        myThread1.start();
        Thread mythread2=new Thread(new MyThread2(ex));
        mythread2.start();
        new Thread(){
          public void run(){
              for (int i = 0; i <100 ; i++) {
                  System.out.println("3 thread "+i);
              }

          }
        }.start();
    }

}
class MyThread2 implements Runnable {
    Exchanger<String> ex;

    public MyThread2(Exchanger<String> ex){
        this.ex=ex;
    }
    @Override
    public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Hello second thread " + this.ex);
                try {
                    ex.exchange("Второй");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
class MyThread extends Thread{
    Exchanger <String> ex;
    public MyThread(Exchanger<String> ex){
        this.ex=ex;
    }
    public void run(){
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello first thread "+this.ex);
        }

    }
}

