package lv.tsi.practice2.exercise5;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {

    private String name;
    private int age;

    @Override
    public String toString() {
        return name;
    }
}
