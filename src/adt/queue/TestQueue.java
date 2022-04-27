package adt.queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
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
