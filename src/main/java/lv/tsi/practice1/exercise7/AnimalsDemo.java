package lv.tsi.practice1.exercise7;

public class AnimalsDemo {

    public static void main(String[] args) {
        Cat cat = new Cat("Jo");
        Dog dog = new Dog("Bob");
        Fox fox = new Fox("Neo");

        cat.printName();
        cat.sound();

        dog.printName();
        dog.sound();

        fox.printName();
        fox.sound();
    }
}
