package lv.tsi.practice1.exercise5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class TwoDimensionalArray {

    public int[][] createRandomArray(int size) {
        Random random = new Random();
        return IntStream.range(0, size)
                .mapToObj(r -> IntStream.range(0, size)
                        .map(c -> random.nextInt(6))
                        .toArray())
                .toArray(int[][]::new);
    }

    public double[] getArrayOfAverageValuesOfEachColumn(int[][] arr) {
        double[] arrayOfAverageValuesOfEachColumn = new double[arr.length];
        IntStream.range(0, arrayOfAverageValuesOfEachColumn.length)
                .forEach(index -> arrayOfAverageValuesOfEachColumn[index] = Double.parseDouble(new DecimalFormat("0.00")
                        .format(Arrays.stream(arr)
                                .mapToInt(row -> row[index])
                                .average()
                                .orElse(Double.NaN))
                ));

        return arrayOfAverageValuesOfEachColumn;
    }

    public void printArray(int[][] arr) {
        IntStream.range(0, arr.length)
                .forEach(r -> {
                    IntStream.range(0, arr[0].length)
                            .forEach(c -> System.out.print(arr[r][c] + "\t"));
                    System.out.println();
                });
    }
}
