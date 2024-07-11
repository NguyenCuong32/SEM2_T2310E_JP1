package org.fai.example.generic2;

import java.util.List;

public class GenericRepository<T> {
    private List<T> items;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public void add(T item) {
    }

    public void remove(T item) {
    }

    public void print() {
        for (T item : items) {
            System.out.println(item +" " +item.getClass().getSimpleName());
        }
    }
}
