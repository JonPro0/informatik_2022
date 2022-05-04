package adt.test;

import adt.beispiele.Kunde;
import adt.queue.Item;
import adt.queue.Queue;
import adt.queue.QueueInt;

public class TestQueue {
    public static void testItem() {
        Item<Kunde> ik = new Item<Kunde>(new Kunde("Finn", "Schnelleis"));
        System.out.println(ik);
        System.out.println(ik.getData());
    }

    public static void testQueueKunde() {
        Queue<Kunde> q = new Queue<>();
        q.enQueue(new Kunde("Tick", "Mickey"));
        q.enQueue(new Kunde("Trick", "Vanille"));
        q.enQueue(new Kunde("Track", "Schoko"));
        System.out.println(q);
        Kunde k = q.deQueue();
        System.out.println("Rausgeworfen: " + k);
        System.out.println(q);
    }

    public static void testQueueInt() {
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(5);
        queue.enQueue(12);
        queue.enQueue(7);
        System.out.println(queue);
        int removed = queue.deQueue();
        System.out.println("Rausgeworfen: " + removed);
        System.out.println(queue);
    }

    public static void testQueueObject() {
        Queue<Object> objectQueue = new Queue<>();
        objectQueue.enQueue("Hi");
        objectQueue.enQueue(5);
        objectQueue.enQueue(new Kunde("Franz", "Erdbeere"));
        System.out.println(objectQueue);
        Object removed = objectQueue.deQueue();System.out.println("Rausgeworfen: " + removed);
        System.out.println(objectQueue);


    }

    public static void main(String[] args) {
        testQueueKunde();
        testQueueInt();
        testQueueObject();
        /*
        QueueInt q = new QueueInt();
        System.out.println(q.isEmpty());
        System.out.println(q.getSize());
        q.enqueue(5);
        System.out.println(q.toString());

        System.out.println(q.getSize());
        q.enqueue(12);
        System.out.println(q.getSize());
        q.enqueue(7);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
        int r;
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        r = q.dequeue();
        System.out.println("Dequeued: " + r);
        // r = q.dequeue();
        System.out.println("Dequeued: " + r);
        q.clear();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());

         */
    }
}
