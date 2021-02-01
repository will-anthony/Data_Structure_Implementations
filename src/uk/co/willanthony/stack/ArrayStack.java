package uk.co.willanthony.stack;

import uk.co.willanthony.test_classes.Employee;

import java.util.EmptyStackException;

public class ArrayStack implements Stack {

    private Object[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    @Override
    public void push(Object object) {
        if (top == stack.length) {

            // need to resize backing array
            Object[] newArray = new Object[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = object;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Object object = stack[--top];
        stack[top] = null;

        return object;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    @Override
    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i].toString());
        }
    }

    private boolean isEmpty() {
        return top == 0;
    }
}
