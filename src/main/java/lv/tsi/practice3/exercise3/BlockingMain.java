package lv.tsi.practice3.exercise3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingMain {

    public static void main(String[] args) {
        final BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        AddingThread producer = new AddingThread(blockingQueue);
        TakingThread consumer = new TakingThread(blockingQueue);

        producer.start();
        consumer.start();
    }
}
