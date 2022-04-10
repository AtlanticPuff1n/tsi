package lv.tsi.practice3.exercise3;

import lombok.SneakyThrows;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread {

    private final BlockingQueue<String> queue;

    public AddingThread(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    @SneakyThrows(InterruptedException.class)
    public void run() {
        for (int i = 0; i < 3; i++) {
            queue.put("Element" + i);
            System.out.println("Element" + i + " has been added.");
        }
    }
}
