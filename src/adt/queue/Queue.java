package adt.queue;

public class Queue<T> {
    Item<T> first;

    public Queue() {
        first = null;
    }

    public void add(T data){
        Item<T> tmp = new Item<T>(data);
        if (first == null){
            first = tmp;
        } else {
            Item<T> runner = first;
            while (runner.getNext() != null){
                runner = runner.getNext();
            }
            runner.setNext(tmp);
        }
    }

    public String print(){
        StringBuilder output = new StringBuilder();
        //1. Wir nehmen eine Variable runner und setzen sie auf first
        Item runner = first;

        //2. Solange das Element runner einen Nachfolger hat
        while(runner != null) {
            //3. Drucke die data von runner aus
            output.append(runner.getData());

            //4. Setze runner auf das nächste Element
            runner = runner.getNext();

        }
        return output.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public T first()  {
        if (isEmpty()){
            throw new RuntimeException("Schlange ist leer und es kann nicht drauf zugegriffen werden!");
        }
        return first.getData();

    }

    public void clear(){
        first = null;
    }

    public T dequeue(){
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer!");
        }
        T data = first.getData();
        first = first.getNext();
        return data;
    }

    public int getSize() {
        Item runner = first;
        int anzahl = 0;

        //1. Solange das Element runner einen Nachfolger hat
        while(runner != null) {
            anzahl++;
            //2. Setze runner auf das nächste Element
            runner = runner.getNext();
        }
        return anzahl;
    }

}


