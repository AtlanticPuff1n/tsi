package lv.tsi.practice3.exercise2;

import lombok.SneakyThrows;

public class SyncMain {

    @SneakyThrows(InterruptedException.class)
    public static void main(String[] args) {
        final TaskManager taskManager = new TaskManager();

        TaskThread taskThread = new TaskThread("Task1", taskManager, 1);
        TaskThread taskThread2 = new TaskThread("Task2", taskManager, 2);

        taskThread.start();
        Thread.sleep(2);
        taskThread2.start();
    }
}
