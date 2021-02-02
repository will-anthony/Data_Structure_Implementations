package uk.co.willanthony.stack;

public interface LinearData<E> {

    void push(E object);
    public Object pop();
    public Object peek();
    public int size();

}
