package adt.stack;

import adt.Item;

public class Stack<T> {
    Item<T> top;
    public Stack(){
        top = null;

    }

    public void push(T data){
        //neues Element mit data
        Item<T> tmp = new Item<>(data);
        //Setze Nachfolger von tmp auf ehem. top;
        tmp.setNext(top);
        //top wird zu tmp
        top = tmp;

    }

    public T pop(){
        top = top.getNext();
        return top.getData();
    }
}
