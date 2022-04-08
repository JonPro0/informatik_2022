package adt;

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
            while (runner.next != null){
                runner = runner.next;
            }
            runner = tmp;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int first()  {
        if (isEmpty()){
            throw new RuntimeException("Schlange ist leer und es kann nicht drauf zugegriffen werden!");
        }
        return first.data;

    }

    public void clear(){
        first = null;
    }

}

class Item {
    int data;
    Item next;
    public Item(int data){
        this.data = data;
    }
}
