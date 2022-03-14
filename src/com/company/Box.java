package com.company;

import java.util.Iterator;

public class Box<T, K, L> {
    private T id;
    private K name;
    private L nomer;

    public Box() {
    }

    public Box(T id, K name, L nomer) {
        this.id = id;
        this.name = name;
        this.nomer = nomer;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public L getNomer() {
        return nomer;
    }

    public void setNomer(L nomer) {
        this.nomer = nomer;
    }

    public static Box method() {
        Box box1 = new Box(12, "Box-1", 899);
        return box1;
    }

    @Override
    public String toString() {
        return "Box:\n" +
                "Id:" + id +
                "\nName:" + name +
                "\nNomer:" + nomer;
    }
}
