package by.anton.core.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Zaur");//offer ��� ������ add ��� ������������ �������, ���� ��� add ��� ��������. ������� ����� �������
        queue.offer("Anton");
        queue.offer("Denis");
        queue.offer("Max");
        System.out.println(queue);
        System.out.println(queue.element() + " ������ � �������");
        System.out.println(queue.peek()); //���� ����� ��� � element �� ��� ������ ������� ��� ��������� ����� null
        //����� ������� ����� ������� ��������� remove(String)
        queue.remove("Denis");
        //���� ������������ poll, � �� remove �� ������ �������� isEmpty �� ���� ��� ������ ������� �� ������
        System.out.println(queue.poll());//���� ��� � remove �� �� ���� ���������� ��� ������ queue

        while (!queue.isEmpty())
            System.out.println(queue.remove());//FIFO ���������� ������ ������� � ��� �������
    }
}
