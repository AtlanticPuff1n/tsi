package lv.tsi.practice1.exercise4;

import java.util.stream.IntStream;

public class Marathon {

    private final String[] names = {
            "Elena",  "Thomas", "Hamilton", "Suzie",
            "Phil",   "Matt",   "Alex",     "Emma",
            "John",   "James",  "Jane",     "Emily",
            "Daniel", "Neda",   "Aaron",    "Kate"
    };

    private final int[] times = {
            341, 273, 278, 329,
            445, 402, 388, 275,
            243, 334, 412, 393,
            299, 343, 317, 265
    };

    public void printResults() {
        if (names.length == times.length) {
            System.out.println("Results: ");
            IntStream.range(0, names.length)
                    .forEach(i -> System.out.println("    " + names[i] + ": " + times[i] + 's'));
        } else {
            System.out.println("No results");
        }
    }
}
