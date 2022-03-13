package lv.tsi.practice1.exercise7;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cat implements Domestic, Animal {

    private final String name;

    @Override
    public void printName() {
        System.out.println(this.getClass().getSimpleName() + "’s name is " + name);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
