package lv.tsi.practice1.exercise6;

public class AnimalsDemo {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal fox = new Fox();

        cat.sound();
        dog.sound();
        fox.sound();
    }
}
