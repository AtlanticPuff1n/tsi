package lv.tsi.practice3.exercise2;

import lombok.SneakyThrows;

public class TaskManager {

    @SneakyThrows(InterruptedException.class)
    public synchronized void performTask(int taskId) {
        System.out.println(Thread.currentThread().getName() + " " + taskId);
        Thread.sleep(4);
        System.out.println(Thread.currentThread().getName() + " " + taskId);
    }
}
