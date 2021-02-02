package uk.co.willanthony.queue;

import uk.co.willanthony.stack.LinearData;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements LinearData<E> {

    private Object[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        this.queue = new Object[capacity];
    }

    @Override
    public void push(E object) {
        if (back == queue.length) {
            Object[] newArray = new Object[2 * queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;

            queue[back] = object;
            back++;
        }
    }

    @Override
    public Object pop() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Object object = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return object;
    }

    @Override
    public Object peek() {

        if(size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    @Override
    public int size() {
        return back - front;
    }
}
