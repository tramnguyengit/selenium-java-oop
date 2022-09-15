package lab_03;


public class lab_03_01 {
    /*Count how many odd, even number(s) in an integer array
        int[] intArr = {1, 2, 3, 4, 5};
        Even numders: 2
        Odd numbers: 3*/
    public static void main(String[] args) {
        int[] arrayNum = new int[]{0, 2, 3, 4, 5};
        int totalEvenNum = 0;

        for (int index = 0; index < 5; index++) {
            if (arrayNum[index] % 2 == 0) {
                totalEvenNum++;
            }
        }
        System.out.println("Total even number is: " + totalEvenNum);
        int totalOddNum = arrayNum.length - totalEvenNum;
        System.out.println("Total odd number in the array is: " + totalOddNum);
    }
}