package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public IntArrayStack arrayStack;

    public DefaultCountingOutRhymer() {
        arrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        arrayStack.countIn(in);
    }

    public boolean callCheck() {
        return arrayStack.callCheck();
    }

    public boolean isFull() {
        return arrayStack.isFull();
    }

    public int checkIn() {
        return arrayStack.checkIn();
    }

    public int countOut() {
        return arrayStack.countOut();
    }

    public int getTotal() {
        return arrayStack.getTotal();
    }


}
