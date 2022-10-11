package lab_runable;

import java.util.List;
import java.util.Scanner;

public class Lab_05_Test {

    public static void printGameMenu() {
        System.out.println("== Game Menu");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find Number");
        System.out.println("6. Reset Array List");
    }

    public static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the option: ");
        return scanner.nextInt();
    }

    public static void addNumber(List<Integer> myArrList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int inputNumber = scanner.nextInt();
        myArrList.add(inputNumber);
    }

    public static void printArrayList(List<Integer> myArrList) {
        System.out.println("Your Array List is: " + myArrList);
    }

    public static int getMaximumNumber(List<Integer> myArrlist) {
        int maxNumber = 0;
        for (int i = 0; i < myArrlist.size() - 1; i++) {
            if(myArrlist.get(i) < myArrlist.get(i+1)){
                maxNumber= myArrlist.get(i+1);
            }
        }
        return maxNumber;
    }

    public static int getMinimumNumber(List<Integer> myArrlist) {
        int minNum = 0;
        for (int i = 0; i < myArrlist.size() - 1; i++) {
            if(myArrlist.get(i) < myArrlist.get(i+1)){
                minNum = myArrlist.get(i);
            }
        }
        return minNum;
    }

    public static void resetArrayList(List<Integer> myArrList) {
        myArrList.clear();
    }

    public static void findNumber(List<Integer> newArrNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int searchNum = scanner.nextInt();
        newArrNum.contains(searchNum);
        if (newArrNum.contains(searchNum)) {
            System.out.println("The position of your number is: " + newArrNum.indexOf(searchNum));

        } else {
            System.out.println("There is no this number in list");
        }
    }
}
