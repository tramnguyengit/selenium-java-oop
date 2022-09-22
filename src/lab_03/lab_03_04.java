package lab_03;

import java.util.Arrays;

public class lab_03_04 {
    /*    Merge 2 SORTED integer array into one SORTED array
        Array 01: {1, 12, 16, 28, 34}
        Array 02: {1, 13, 16, 27, 99}
        Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
        */
    public static void main(String[] args) {
        int[] firstArr = {1, 12, 16, 28, 34};
        int[] secondArr = {1, 13, 16, 27, 99};
        int[] mergeArr = mergeMethod(firstArr, secondArr);
        System.out.println(Arrays.toString(mergeArr));
    }

    private static int[] mergeMethod(int[] firstArr, int[] secondArr) {
        int arrLength = firstArr.length + secondArr.length;
        int[] mergedArr = new int[arrLength];
        int firstArrPo, secondArrPo, mergedArrPo;
        firstArrPo = secondArrPo = mergedArrPo = 0;
        while (firstArrPo < firstArr.length && secondArrPo < secondArr.length) {
            if (firstArr[firstArrPo] < secondArr[secondArrPo]) {
                mergedArr[mergedArrPo++] = firstArr[firstArrPo++];
            } else {
                mergedArr[mergedArrPo++] = secondArr[secondArrPo++];
            }
        }
        while (firstArrPo < firstArr.length) {
            mergedArr[mergedArrPo++] = firstArr[firstArrPo++];
        }
        while (secondArrPo < secondArr.length) {
            mergedArr[mergedArrPo++] = secondArr[secondArrPo++];

        }
        return mergedArr;
    }
}






