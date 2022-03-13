package lv.tsi.practice1.exercise2;

import java.util.stream.LongStream;

public class FactorialCalculator {

    public static long factorial(int n) {
        return LongStream.rangeClosed(2, n)
                .reduce(1, (long a, long b) -> a * b);
    }

    public static long factorialRecursion(int n) {
        return (n == 0) ? 1 :
                n * factorial(n - 1);
    }
}
