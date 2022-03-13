package lv.tsi.practice1.exercise3;

public class OneDimensionalArrayDemo {

    public static void main(String[] args) {
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();

        int arrSize = 10;
        double[] arr = oneDimensionalArray.createRandomArray(arrSize);

        System.out.println("Print One Dimensional Array of " + arrSize + " elements: ");
        oneDimensionalArray.printArray(arr);

        System.out.println("\nResults: ");
        System.out.println("    Max value of the array: " + oneDimensionalArray.maxValueOfArray(arr));
        System.out.println("    Min value of the array: " + oneDimensionalArray.minValueOfArray(arr));
        System.out.println("    Average value of the array: " + oneDimensionalArray.averageValueOfArray(arr));
    }
}
