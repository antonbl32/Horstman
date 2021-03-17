package by.anton.core.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Zaur");//offer исп вместо add при ограниченной очереди, если исп add при заполнен. очережи будет эксепшн
        queue.offer("Anton");
        queue.offer("Denis");
        queue.offer("Max");
        System.out.println(queue);
        System.out.println(queue.element() + " ѕервый в очереди");
        System.out.println(queue.peek()); //тоже самое что и element но при пустой очереди без эксепшина возвр null
        //можно удалить любой элемент использу€ remove(String)
        queue.remove("Denis");
        //если использовать poll, а не remove то делать проверку isEmpty не надо при пустом эксепшн не выдаст
        System.out.println(queue.poll());//тоже что и remove но не бьет исключение при пустом queue

        while (!queue.isEmpty())
            System.out.println(queue.remove());//FIFO возвращает первый элемент и его удал€ет
    }
}
