package lv.tsi.practice3.exercise1;

import lombok.SneakyThrows;

public class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    @SneakyThrows(InterruptedException.class)
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.sleep(10);
        }
    }
}
