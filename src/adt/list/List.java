package adt.list;
import adt.Item;
import adt.queue.Queue;

/*
* Im Vergleich zur Queue zusätzliche Methoden
*
* 1. insertAt(int index, T data) => Einfügen an bestimmter Stelle
* 2. deleteAt(int index) => Löschen eines bestimmten Elements
* 3. get(int index) => Gibt Daten an index zurück
* 4. getItem(int index) => Gibt Element an index zurück
* D.R.Y. Don't repeat yourself
* */

public class List<T> extends Queue<T>{
    public T get(int index) {
        checkIndex(index);

        return getItem(index).getData();
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
        getItem(index).setData(data);
    }

    public void move(int fromIndex, int toIndex){
        checkIndex(fromIndex);
        checkIndex(toIndex);
        Item<T> tmp = getItem(fromIndex);
        deleteAt(fromIndex);
        insertAt(toIndex, tmp.getData());
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
            Item<T> prev = getItem(index - 1);
            if (index + 1 < getSize()) {
                prev.setNext(getItem(index).getNext());
            } else {
                prev.setNext(null);
            }
        }
    }

    public int indexOf(T data){
        if (isEmpty()){
            throw new IllegalArgumentException("NEIN!");
        }
        int index = 0;
        Item<T> runner = first;

        while (runner.getData() != data && index < getSize()){
            runner = runner.getNext();
            index++;
        }

        if (runner.getData() == data) return index;

        return -1;
    }

    public void delete(T data) {
        deleteAt(indexOf(data));
    }
}
