package com.company.OOP.Week5.DAY1.DAY2.Generics;

/**
 * 1) declare Generic type -> near class
 * 2) use in scope
 */
public class Container<V> {
    private V value;

    public Container(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
