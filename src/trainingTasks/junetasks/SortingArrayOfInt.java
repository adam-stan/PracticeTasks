package trainingTasks.junetasks;

import java.util.Arrays;

public class SortingArrayOfInt {

    public static void method() {

        int[] cubes = {8, 27, 64, 125, 256};

        Arrays.sort(cubes);
        System.out.println(Arrays.toString(cubes));

        int[] newCubes = new int[cubes.length];

        int temp = cubes.length -1;

        for (int i = 0; i < cubes.length; i++) {
            newCubes[i] = cubes[temp];
            temp--;
        }
        System.out.println(Arrays.toString(newCubes));
    }

    public static void main(String[] args) {
    SortingArrayOfInt.method();
    }
}
