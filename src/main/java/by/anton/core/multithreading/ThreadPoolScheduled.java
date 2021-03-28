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
//        scheduledExecutorService.schedule(new RunnableEmpl200(),3, TimeUnit.SECONDS);//��������� ����� 3 �������
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableEmpl200(),3,1,TimeUnit.SECONDS);//���������
        //������ ��� �������������� ����������, ��������� ����� 3 ��� � ����� ����������� ������ 1 ���
        //���� ���� ����������� ������ 1 ���(�.�. ���. �������) ������ ���������� ����� ��� �������� �����
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableEmpl200(),3,1,TimeUnit.SECONDS);
        //���� ����� ���������� �� scheduleAtFixedRate ���, ��� ����� ���������� ������ ������ �������� delay 1 ���
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();

        ExecutorService executorService=Executors.newCachedThreadPool();
        //������������ ���� ��� ������� ���������� ������� � ����������� �� ��������, ��
        //����������, ���� ����� 60 ��� ����� ������������� ��������� ������ ����� ���������


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