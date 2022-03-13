package lv.tsi.practice1.exercise5;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int arrSize = 3;
        int[][] arr = twoDimensionalArray.createRandomArray(arrSize);

        twoDimensionalArray.printArray(arr);
        double[] arrayOfAverageValuesOfEachColumn = twoDimensionalArray.getArrayOfAverageValuesOfEachColumn(arr);

        for (int i = 0; i < arrayOfAverageValuesOfEachColumn.length; i++) {
            System.out.println("Column " + (i + 1) + " the average value: " + arrayOfAverageValuesOfEachColumn[i]);
        }
    }
}
