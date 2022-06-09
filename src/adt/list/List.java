package adt.list;
import adt.Item;
import adt.queue.Queue;

/*
* Im Vergleich zur Queue zusätzliche Methoden
*
* 1. insertAt(int index, T data) => Einfügen an bestimmter Stelle
* 2. deleteAt(int index) => Löschen eines bestimmten Elements
* 3. find(String Name) => Ein bestimmtes Objekt finden
* */

public class List<T> extends Queue<T>{
    public T get(int index) {
        checkIndex(index);

        Item<T> runner = first;
        for (int i = 0; i < index; i++) {
            runner = runner.getNext();
        }

        return runner.getData();
    }

    private Item<T> getItem(int index) {
        checkIndex(index);

        Item<T> runner = first;
        for (int i = 0; i < index; i++) {
            runner = runner.getNext();
        }

        return runner;
    }

    public void swap(int fromIndex, int toIndex){
        T fromData = get(fromIndex);
        T toData = get(toIndex);
        set(fromIndex, toData);
        set(toIndex, fromData);
    }

    private void set(int index, T data) {
        Item<T> runner = first;

        for (int i = 0; i < index; i++) {
            runner = runner.getNext();
        }
        runner.setData(data);
    }

    private void checkIndex(int index){
        if (isEmpty())
        if (index < 0) throw new IllegalArgumentException("Index must be positive");
        if (index >= getSize()) {
            String s = String.format("Index is too large (%d): %d", getSize(), index);
            throw new IllegalArgumentException(s);
        }
    }

    public void insertAt(int index, T data){
        checkIndex(index);
        if (index ==  0){
            Item<T> tmp = first;
            first = new Item<>(data);
            first.setNext(tmp);
        } else {
            Item<T> prev = getItem(index - 1);
            Item<T> tmp = new Item<>(data);
            Item<T> iai = getItem(index); //iai = itemAtIndex

            prev.setNext(tmp);
            tmp.setNext(iai);
        }
    }

    public void deleteAt(int index){
        checkIndex(index);
        if(index == 0){
            first = first.getNext();
        } else {
            Item<T> runner = first;

            for (int i = 0; i < index; i++) {
                runner = runner.getNext();
            }
            Item<T> prev = getItem(index - 1);
            if (index + 1 < getSize()) {
                prev.setNext(runner.getNext());
            } else {
                prev.setNext(null);
            }
        }
    }
}
