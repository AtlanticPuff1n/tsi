package lv.tsi.practice3.exercise3;

import lombok.SneakyThrows;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread{

    private final BlockingQueue<String> blockingQueue;

    public TakingThread(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    @SneakyThrows(InterruptedException.class)
    public void run() {
        Thread.sleep(1000);
        while (blockingQueue.size() != 0) {
            System.out.println(blockingQueue.take());
        }
    }
}
