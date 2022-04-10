package lv.tsi.practice3.exercise1;

public class PriorityMain {

    public static void main(String[] args) {
        PriorityThread priorityMaxThread = new PriorityThread("MAX");
        PriorityThread priorityNormThread = new PriorityThread("NORM");
        PriorityThread priorityMinThread = new PriorityThread("MIN");

        priorityMaxThread.setPriority(Thread.MAX_PRIORITY);
        priorityNormThread.setPriority(Thread.NORM_PRIORITY);
        priorityMinThread.setPriority(Thread.MIN_PRIORITY);

        priorityMaxThread.start();
        priorityNormThread.start();
        priorityMinThread.start();
    }
}
