package lab_05;

import lab_runable.Lab_05_Test;

import java.util.*;

public class Lab_05 {

    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        System.out.println("How many number you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int numberOfDigit = scanner.nextInt();
        for (int i = 0; i < numberOfDigit; i++) {
            System.out.println("Please enter the number");
            int number = scanner.nextInt();
            myArrList.add(number);
        }
        boolean isContinue = true;
        while (isContinue) {
            Lab_05_Test.printGameMenu();
            int inputOption = Lab_05_Test.getUserOption();
            switch (inputOption) {
                case 0:
                    isContinue = false;
                    break;
                case 1:
                    Lab_05_Test.addNumber(myArrList);
                    break;
                case 2:
                    Lab_05_Test.printArrayList(myArrList);
                    break;
                case 3:
                    if(myArrList.size() > 0){
                        int maxNumber = Lab_05_Test.getMaximumNumber(myArrList);
                        System.out.println("Maximum Number is :"+ maxNumber);
                    } else System.out.println("Array is blank");
                    break;
                case 4:
                    if(myArrList.size() > 0){
                        int minNum = Lab_05_Test.getMinimumNumber(myArrList);
                        System.out.println("Minimum Number is :"+ minNum);
                    } else System.out.println("Array is blank");

                    break;
                case 5:
                    Lab_05_Test.findNumber(myArrList);
                    break;
                case 6:
                    Lab_05_Test.resetArrayList(myArrList);
                    System.out.println("Your Original List: "+ myArrList);
                default:
                    System.out.println("Incorrect option");

            }
        }
    }

}
