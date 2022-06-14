package trainingTasks.junetasks;

import java.util.Arrays;

public class DistanceTwoNumbers {

    // Returns the distance between the two closest numbers.
    static int distClosestNumbers(int[] numbers) {

        int smallestDIfference = 0;

        System.out.println("Unordered array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Ordered array: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length -1; i++) {

            smallestDIfference = Math.abs(numbers[0] - numbers[1]);
            int currentDifference = Math.abs(numbers[i] - numbers[i + 1]);

            if (currentDifference < smallestDIfference) {
                smallestDIfference = currentDifference;
            }
        }
        return smallestDIfference;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println("Smallest distance of two numbers in this array is: " + result);
    }
}