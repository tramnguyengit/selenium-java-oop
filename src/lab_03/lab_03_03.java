package lab_03;

import java.util.Arrays;

public class lab_03_03 {
    /*    Sort an integer array from min to max
        Input: {12, 34, 1, 16, 28}
        Expected output: {1, 12, 16, 28, 34}*/

    public static void main(String[] args) {
        int[] anArray = {12, 34, 80, 16, 28};
        for (int i = 0; i < anArray.length; i++) {
            for (int j = i+1; j < anArray.length; j++) {
                if (anArray[i] > anArray[j]) {
                    int originalNum = anArray[i];
                    anArray[i] = anArray[j];
                    anArray[j] = originalNum;
                }
            }
        }
        System.out.println(Arrays.toString(anArray));
    }

}

