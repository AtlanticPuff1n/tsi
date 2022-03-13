package lv.tsi.practice1.exercise3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArray {

    public double[] createRandomArray(int size) {
        Random random = new Random();
        return random.doubles(size, 0, 100)
                .map(e -> Double.parseDouble(new DecimalFormat("0.00").format(e)))
                .toArray();
    }

    public double averageValueOfArray(double[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElse(Double.NaN);
    }

    public double maxValueOfArray(double[] arr) {
        return Arrays.stream(arr)
                .max()
                .orElse(Double.NaN);
    }

    public double minValueOfArray(double[] arr) {
        return Arrays.stream(arr)
                .min()
                .orElse(Double.NaN);
    }

    public void printArray(double[] arr) {
        Arrays.stream(arr)
                .forEach(e -> System.out.println("    " + e));
    }
}
