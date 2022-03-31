package lv.tsi.practice2.exercise1_2_3_4;

import java.util.Arrays;
import java.util.List;

public class ListProcessingWithStreams {

    private final List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

    public static void main(String[] args) {
        ListProcessingWithStreams streams = new ListProcessingWithStreams();

        System.out.println("Exercise1");
        System.out.println("Output the first element: ");
        streams.ex1();

        System.out.println("\nExercise2");
        System.out.println("Output elements from the list using uppercase: ");
        streams.ex2();

        System.out.println("\nExercise3");
        System.out.println("Output elements from the list, which starts with \"b\": ");
        streams.ex3();

        System.out.println("\nExercise4");
        System.out.println("Output elements from the list, which starts with \"c\". The elements should be in uppercase\n" +
                "and alphabetically sorted: ");
        streams.ex4();
    }

    public void ex1() {
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void ex2() {
        list.stream().map(String::toUpperCase)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public void ex3() {
        list.stream().filter(e -> e.startsWith("b"))
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public void ex4() {
        list.stream().filter(e -> e.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}


