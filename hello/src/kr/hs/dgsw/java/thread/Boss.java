package kr.hs.dgsw.java.thread;

public class Boss {
    private SafeBox safeBox = new SafeBox();

    public void startBusiness() {
        for (int i = 0; i < 10; i++) {
            Gang gang = new Gang(this, i);
            new Thread(gang).start();
        }
    }

    public void offer(int money, int id) {
        int amount = safeBox.getAmount();
        amount += money;
        safeBox.setAmount(amount);
        System.out.printf("조직원 %d가 %d달러를 상납함\n", id, money);
    }

    public int getAmount() {
        return safeBox.getAmount();
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.startBusiness();

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {}

        System.out.printf("금고에 있는 돈의 합계 : %d\n", boss.getAmount());
    }
}
