package org.fai.example;

import java.util.ArrayList;
import java.util.List;

public class NumberGeneric<T> {
    private List<T> list;

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void enterNumber(T number) {
        if (list == null) {
            list = new ArrayList<T>();
        }
        list.add(number);
    }

    public void print() {
        for (T item : list) {
            System.out.println(item + " " + item.getClass().getName());
        }
    }

}
