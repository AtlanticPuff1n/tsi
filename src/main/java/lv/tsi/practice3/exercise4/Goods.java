package lv.tsi.practice3.exercise4;


import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class Goods {

    private int amount;
    private volatile boolean flag = true;

    @SneakyThrows(InterruptedException.class)
    public synchronized void produce(int amount) {
        while (amount < 0) {
            wait();
        }

        flag = false;
        Thread.sleep(1000);
        notify();
    }

    @SneakyThrows(InterruptedException.class)
    public synchronized int consume() {
        while (flag) {
            wait();
        }
        Thread.sleep(1000);
        flag = false;
        notify();
        return amount;
    }
}
