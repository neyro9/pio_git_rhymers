package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > checkIn())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//wiersz: 5,12,14,15
//Kombinacja: alt + strzalka powoduje zmiane widoku miedzy klasami
//kombinacja: ctrl+alt+l -> automatyczne formatowanie
// alt+shift+r