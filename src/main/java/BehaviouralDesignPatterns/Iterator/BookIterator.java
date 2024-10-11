package BehaviouralDesignPatterns.Iterator;

import java.util.List;

public class BookIterator implements Iterator {
    private List<Book> list;
    int index = 0;

    public BookIterator(List<Book> list) {
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        return list.get(index++);
    }
}
