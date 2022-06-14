package adt.queue;

import java.util.PriorityQueue;

public class TestQueueInt {
    public static void main(String[] args) {
        QueueInt q = new QueueInt();
        System.out.println(q.isEmpty());
        System.out.println(q.getSize());
        q.add(5);
        System.out.println(q.getSize());
        q.add(12);
        System.out.println(q.getSize());
        q.add(7);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.print());
        int r;
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        q.clear();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.print());
    }
}
