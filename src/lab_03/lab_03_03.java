package lab_03;

import java.util.Arrays;

public class lab_03_03 {
    /*    Sort an integer array from min to max
        Input: {12, 34, 1, 16, 28}
        Expected output: {1, 12, 16, 28, 34}*/

    public static void main(String[] args) {
        //Method 1
   int[] anArray = {12, 34, 80, 16, 28, 2, 34, 12};
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


 /*       //Method 2
        int unSortedPosition = anArray.length -1;
        while(unSortedPosition > 0){
            for (int index = 0; index < unSortedPosition; index++) {
                if(anArray[index] > anArray[index + 1]){
*//*                    int temp = anArray[index];
                    anArray[index] = anArray[index + 1];
                    anArray[index + 1] = temp;*//*
                    anArray[index] = anArray[index] + anArray[index + 1]; //a = a +b
                    anArray[index + 1] = anArray[index] - anArray[index + 1]; //b = a - b
                    anArray[index] = anArray[index] - anArray[index+1]; // a = a - b
                }
            }
            unSortedPosition--;
        }
        System.out.println(Arrays.toString(anArray));*/
    }

}

