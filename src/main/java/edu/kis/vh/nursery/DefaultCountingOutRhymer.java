package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {
    private IntArrayStack arrayStack;

    public DefaultCountingOutRhymer() {
        arrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        arrayStack.push(in);
    }

    public boolean callCheck() {
        return arrayStack.isEmpty();
    }

    public boolean isFull() {
        return arrayStack.isFull();
    }

    public int checkIn() {
        return arrayStack.top();
    }

    public int countOut() {
        return arrayStack.pop();
    }

    public int getTotal() {
        return arrayStack.getTotal();
    }


}
