package by.anton.core.collection.queue;



import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.remove());

    }
}
