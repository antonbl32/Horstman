package by.anton.core.multithreading;

public class WaitNotifyEx1 {
    public static void main(String[] args) {
        Market market=new Market();
        Producer producer=new Producer(market);
        Consumer consumer=new Consumer(market);
        Thread th1=new Thread(producer);
        Thread th2=new Thread(consumer);
        th1.start();
        th2.start();
    }
}
class Market{
    private int breadCount=0;
    public synchronized void getBread(){
        while(breadCount<1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Осталось "+breadCount+" хлеба");
        notify();
    }
    public synchronized void pubBread(){
        while (breadCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Производитель добавил на ветрину 1 хлеб");
        System.out.println("Осталось "+breadCount+" хлеба");
        notify();
    }
}
class Producer implements Runnable{
    Market market;
    Producer(Market market){
        this.market=market;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            market.pubBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;
    Consumer(Market market){
        this.market=market;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            market.getBread();
        }
    }
}