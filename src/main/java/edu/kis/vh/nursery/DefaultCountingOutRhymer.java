package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int START = -1;
	private static final int ARRAY_SIZE = 12;

	public int total = START;

	private final int[] NUMBERS = new int[ARRAY_SIZE];

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == START;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int checkIn() {
        if (callCheck())
            return START;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return START;
        return NUMBERS[total--];
    }

}
