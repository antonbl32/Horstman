package by.anton.core.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolScheduled {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableEmpl200());
//        }
//        scheduledExecutorService.schedule(new RunnableEmpl200(),3, TimeUnit.SECONDS);//выполнить через 3 секунды
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableEmpl200(),3,1,TimeUnit.SECONDS);//планирует
        //задачу для периодического выполнения, стартанет через 3 сек и будет выполняться каждую 1 сек
        //если таск выполняется дольше 1 сек(т.е. уст. времени) запуск следующего таска без ожидания сразу
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableEmpl200(),3,1,TimeUnit.SECONDS);
        //этот метод отличается от scheduleAtFixedRate тем, что после завершения каждой задачи проходит delay 1 сек
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();

        ExecutorService executorService=Executors.newCachedThreadPool();
        //Кэшированный тред пул создает количество потоков в зависимости от нагрузки, по
        //надобности, если через 60 сек после использования последней задачи поток удаляется


    }
}
    class RunnableEmpl200 implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " begins work");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + " ends work");
        }
}