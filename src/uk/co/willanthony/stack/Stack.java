package uk.co.willanthony.stack;

public interface Stack<T extends Object> {

    void push(T object);
    T pop();
    T peek();
    int size();

}
