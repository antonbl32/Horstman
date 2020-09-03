package by.anton.thread;



public class Test {
    private volatile String m="Первый";

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public static void main(String[] args) {
        Test test=new Test();
        int k =1;
        MyThread myThread1=new MyThread(test);
        myThread1.start();
        Thread mythread2=new Thread(new MyThread2(test));
        mythread2.start();
        new Thread(){
          public void run(){
              for (int i = 0; i <100 ; i++) {
                  System.out.println("3 thread "+test.getM());
                  test.setM("Третий");
              }

          }
        }.start();
    }

    static class MyThread2 implements Runnable {
        String m;

        public MyThread2(Test test){
            this.m=test.getM();
            test.setM("Второй");
        }
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Hello second thread " + this.m);

            }

        }
    }
   static class MyThread extends Thread{
        String m;
        public MyThread(Test test){
            this.m=test.getM();
            test.setM("Первый");
        }
        public void run(){
            for (int i = 0; i <100 ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello first thread "+this.m);
            }

        }
    }

}

