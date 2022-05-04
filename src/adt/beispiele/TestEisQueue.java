package adt.beispiele;

public class TestEisQueue {
    private static Kunde kunde1 = new Kunde("Günter", "Erdbeere! ");
    private static Kunde kunde2 = new Kunde("HEinrich", "Blau! ");
    private static Kunde kunde3 = new Kunde("HEinz", "Joghurt! ");
    public static void main(String[] args) {
        EisQueue q = new EisQueue();
        System.out.println(q.isEmpty());
        System.out.println(q.getSize());
        q.add(kunde1);
        System.out.println(q.getSize());
        q.add(kunde2);
        System.out.println(q.getSize());
        q.add(kunde3);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.print());
        Kunde r;
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
