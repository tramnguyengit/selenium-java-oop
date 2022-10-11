package lab_03;

import lab_runable.Lab_03_Test;

import java.util.Arrays;

public class Lab_03_04 {

    /*    Merge 2 SORTED integer array into one SORTED array
        Array 01: {1, 12, 16, 28, 34}
        Array 02: {1, 13, 16, 27, 99}
        Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
        */
    public static void main(String[] args) {
        int[] firstArr = {1, 12, 16, 28, 34};
        int[] secondArr = {1, 13, 16, 27, 99};
        int[] mergeArr = Lab_03_Test.mergeMethod(firstArr, secondArr);
        System.out.println(Arrays.toString(mergeArr));
    }
}






