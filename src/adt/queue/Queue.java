package adt.queue;

public class Queue {
    Item first;

    public Queue() {
        first = null;
    }

    public void add(int data){
        Item tmp = new Item(data);
        if (first == null){
            first = tmp;
        } else {
            Item runner = first;
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

    public int first()  {
        if (isEmpty()){
            throw new RuntimeException("Schlange ist leer und es kann nicht drauf zugegriffen werden!");
        }
        return first.getData();

    }

    public void clear(){
        first = null;
    }

    public int dequeue(){
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer!");
        }
        int data = first.getData();
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

class Item {
    int data;
    Item next;
    public Item(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Item getNext(){
        return next;
    }

    public void setNext(Item next){
        this.next = next;
    }
}
