package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IntStack;

public class IntArrayStack implements IntStack {
    private static final int START = -1;
    private static final int ARRAY_SIZE = 12;

    private int total = START;

    private final int[] NUMBERS = new int[ARRAY_SIZE];
    @Override
    public void push(int in) { //CountIn
        if (!isFull())
            NUMBERS[++total] = in;
    }
    @Override
    public boolean isEmpty() { //callCheck
        return total == START;
    }
    @Override
    public boolean isFull() {
        return total == 11;
    }
    @Override
    public int top() { //checkIn
        if (isEmpty())
            return EMPTY_STACK;
        return NUMBERS[total];
    }
    @Override
    public int pop() { //countout
        if (isEmpty())
            return EMPTY_STACK;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }
}
