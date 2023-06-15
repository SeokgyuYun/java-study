package kr.hs.dgsw.java.thread;

public class Gang implements Runnable {
    private final Boss boss;
    private final int id;

    public Gang(Boss boss, int id) {
        this.boss = boss;
        this.id = id;
    }

    @Override
    public void run() {

    }
}
