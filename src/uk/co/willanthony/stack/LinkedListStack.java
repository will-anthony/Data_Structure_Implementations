package uk.co.willanthony.stack;

import java.util.LinkedList;

public class LinkedListStack<E> implements Stack<E>{

    private LinkedList<E> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        stack.push(e);
    }

    @Override
    public E pop() {
        return stack.pop();
    }

    @Override
    public E peek() {
        return stack.peek();
    }

    @Override
    public int size() {
        return stack.size();
    }

}
