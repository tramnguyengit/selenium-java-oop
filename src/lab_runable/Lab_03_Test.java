package lab_runable;

import java.util.Arrays;

public class Lab_03_Test {

    public static void countOddAndEvenNum(int[] arrayNum, int totalEvenNum){
        for (int index = 0; index < 5; index++) {
            if (arrayNum[index] % 2 == 0) {
                totalEvenNum++;
            }
        }
        System.out.println("Total even number is: " + totalEvenNum);
        int totalOddNum = arrayNum.length - totalEvenNum;
        System.out.println("Total odd number in the array is: " + totalOddNum);
    }

    public static void getMinMax() {
        int[] arrayNum = {10, 2, 7, 100, 5};
        int minNum = arrayNum[0];
        int maxNum = 0;
        for (int i : arrayNum) {
            if (minNum > i) {
                minNum = i;
            }
            if (maxNum < i) {
                maxNum = i;
            }
        }
        System.out.println("Minimum number in array is: " + minNum);
        System.out.println("Maximum number in array is: " + maxNum);
    }

    public static void sortArray(int[] anArray){
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

    public static int[] mergeMethod(int[] firstArr, int[] secondArr) {
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
