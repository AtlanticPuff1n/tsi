package lv.tsi.practice3.exercise4;

public class Producer extends Thread {

    private final Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            goods.produce(counter);
            System.out.println("Produced: " + counter);
            counter++;
        }
    }
}
