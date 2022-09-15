package lab_03;

import java.util.Arrays;

public class lab_03_03 {
/*    Sort an integer array from min to max
    Input: {12, 34, 1, 16, 28}
    Expected output: {1, 12, 16, 28, 34}*/
    public static void main(String[] args) {
        int[] arrayNum = new int[]{12, 34, 1, 16, 28};
        Arrays.sort(arrayNum);
        System.out.println(Arrays.toString(arrayNum));
    }
}
