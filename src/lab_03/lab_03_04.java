package lab_03;

import java.util.Arrays;

public class lab_03_04 {
    /*    Merge 2 SORTED integer array into one SORTED array
        Array 01: {1, 12, 16, 28, 34}
        Array 02: {1, 13, 16, 27, 99}
        Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}*/
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 12, 16, 28, 34};
        int[] secondArray = new int[]{1, 13, 16, 27, 99};
        final int ARR_LENGTH = firstArray.length + secondArray.length;
        int i = firstArray.length;
        int[] newArray = new int[ARR_LENGTH];
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        for (int j : secondArray) {
            newArray[i++] = j;
        }
        Arrays.sort(newArray);
        System.out.println("New Array is: " + Arrays.toString(newArray));
    }


}
