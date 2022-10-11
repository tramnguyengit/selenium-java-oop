package lab_03;


import lab_runable.Lab_03_Test;

public class Lab_03_01 {

    /*Count how many odd, even number(s) in an integer array
        int[] intArr = {1, 2, 3, 4, 5};
        Even numders: 2
        Odd numbers: 3*/
    public static void main(String[] args) {
        int[] arrayNum = new int[]{0, 2, 3, 4, 5};
        int totalEvenNum = 0;
        Lab_03_Test.countOddAndEvenNum(arrayNum, totalEvenNum);
    }



}