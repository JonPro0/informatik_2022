package adt.queue;

public class Item<T> {
    T data;
    Item<T> next;
    public Item(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Item getNext(){
        return next;
    }

    public void setNext(Item<T> next){
        this.next = next;
    }

}
