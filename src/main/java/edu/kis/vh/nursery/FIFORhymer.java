package edu.kis.vh.nursery;

public final class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(DefaultCountingOutRhymer temp) {
        this.temp = temp;
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
//wiesze:11,17
