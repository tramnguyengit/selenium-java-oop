package lab_03;

import java.util.Arrays;

public class lab_03_02 {
/*    Finding maximum value/minimum value from an integer array
    int[] intArr = {1, 2, 3, 4, 5};
    Minimum: 1
    Maximum: 5*/
    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 7, 100, 5};
        System.out.println("Maximum value from the array is :" + Arrays.stream(arrayNum).max().getAsInt());
        System.out.println("Maximum valye from the array is :" + Arrays.stream(arrayNum).min().getAsInt());
    }
}
