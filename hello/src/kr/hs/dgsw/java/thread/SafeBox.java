package kr.hs.dgsw.java.thread;

public class SafeBox {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int money) {
        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {}

        amount += money;
    }
}
