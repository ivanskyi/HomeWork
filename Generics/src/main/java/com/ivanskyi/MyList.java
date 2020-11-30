package com.ivanskyi;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> list = new ArrayList<>();

    public MyList() {}

    public void add(T data) {
        list.add(data);
    }

    public T getList(int index) {
        return list.get(index);
    }

    public List<T> sortInDecrease() {
        T buffer;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if ((int) list.get(i) > (int) list.get(j)) {
                    buffer = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, buffer);
                }
            }
        }
        return list;
    }

    public T getMax() {
        return sortInDecrease().get(0);
    }

    public T getMin() {
        return sortInDecrease().get(sortInDecrease().size() - 1);
    }
}