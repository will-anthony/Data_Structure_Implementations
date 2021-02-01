package uk.co.willanthony.stack;

public interface Stack<E> {

    void push(E object);
    public E pop();
    public E peek();
    public int size();

}
