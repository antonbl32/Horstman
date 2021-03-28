package by.anton.core.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    static long factorialResult;
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new FactorialImpl(25));
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(factorialResult);
    }
}
class FactorialImpl implements Runnable{
    int f;
    public FactorialImpl(int f){
        this.f=f;
    }
    @Override
    public void run() {
        if(f<=0){
            System.out.println("¬вели не верное число");
            return;
        }
        long result=1;
        for (int i = 1; i <=f ; i++) {
            result*=i;
        }
        RunnableFactorial.factorialResult=result;
    }
}