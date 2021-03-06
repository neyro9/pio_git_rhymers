package edu.kis.vh.nursery;

public interface IntStack {
    static final int EMPTY_STACK = 0;
    boolean isFull();
    void push(int i);
    boolean isEmpty();
    int top();
    int pop();
}
