package adt.queue;

public class QueueObject {
    ItemObject first;

    public QueueObject() {
        first = null;
    }

    public void add(Object data){
        ItemObject tmp = new ItemObject(data);
        if (first == null){
            first = tmp;
        } else {
            ItemObject runner = first;
            while (runner.getNext() != null){
                runner = runner.getNext();
            }
            runner.setNext(tmp);
        }
    }

    public String print(){
        StringBuilder output = new StringBuilder();
        //1. Wir nehmen eine Variable runner und setzen sie auf first
        ItemObject runner = first;

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

    public Object first()  {
        if (isEmpty()){
            throw new RuntimeException("Schlange ist leer und es kann nicht drauf zugegriffen werden!");
        }
        return first.getData();

    }

    public void clear(){
        first = null;
    }

    public Object dequeue(){
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer!");
        }
        Object data = first.getData();
        first = first.getNext();
        return data;
    }

    public int getSize() {
        ItemObject runner = first;
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

class ItemObject {
    Object data;
    ItemObject next;
    public ItemObject(Object data){
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public ItemObject getNext(){
        return next;
    }

    public void setNext(ItemObject next){
        this.next = next;
    }
}
