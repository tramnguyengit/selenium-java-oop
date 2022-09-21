package lab_03;

public class lab_03_02 {
    /*    Finding maximum value/minimum value from an integer array
        int[] intArr = {1, 2, 3, 4, 5};
        Minimum: 1
        Maximum: 5*/

    public static void main(String[] args) {
        getMinMax();
    }

    private static void getMinMax() {
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
}




