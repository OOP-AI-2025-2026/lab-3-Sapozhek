package org.example.task2;

public class IntStack {
    private static final int DEFAULT_CAPACITY = 10;

    private int[] data;
    private int size;

    public IntStack() {
        this.data = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(int value) {
        ensureCapacity();
        data[size] = value;
        size++;
    }

    public int pop() {
        if (isEmpty()) return 0;
        size--;
        return data[size];
    }

    public int peek() {
        if (isEmpty()) return 0;
        return data[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            int[] newArr = new int[data.length * 2];
            System.arraycopy(data, 0, newArr, 0, data.length);
            data = newArr;
        }
    }
}

