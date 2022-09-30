package lab_05;

import java.util.*;

public class lab_05 {
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
            printGameMenu();
            int inputOption = getUserOption();
            switch (inputOption) {
                case 0:
                    isContinue = false;
                    break;
                case 1:
                    addNumber(myArrList);
                    break;
                case 2:
                    printArrayList(myArrList);
                    break;
                case 3:
                    if(myArrList.size() > 0){
                        int maxNumber = getMaximumNumber(myArrList);
                        System.out.println("Maximum Number is :"+ maxNumber);
                    } else System.out.println("Array is blank");
                    break;
                case 4:
                    if(myArrList.size() > 0){
                        int minNum = getMinimumNumber(myArrList);
                        System.out.println("Minimum Number is :"+ minNum);
                    } else System.out.println("Array is blank");

                    break;
                case 5:
                    findNumber(myArrList);
                    break;
                case 6:
                    resetArrayList(myArrList);
                    System.out.println("Your Original List: "+ myArrList);
                default:
                    System.out.println("Incorrect option");

            }
        }
    }

    private static void printGameMenu() {
        System.out.println("== Game Menu");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find Number");
        System.out.println("6. Reset Array List");
    }
    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the option: ");
        return scanner.nextInt();

    }
    private static void addNumber(List<Integer> myArrList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int inputNumber = scanner.nextInt();
        myArrList.add(inputNumber);




    }
    private static void printArrayList(List<Integer> myArrList) {
        System.out.println("Your Array List is: " + myArrList);

    }
    private static int getMaximumNumber(List<Integer> myArrlist) {
        int maxNumber = 0;
        for (int i = 0; i < myArrlist.size() - 1; i++) {
            if(myArrlist.get(i) < myArrlist.get(i+1)){
               maxNumber= myArrlist.get(i+1);
            }
        }
        return maxNumber;
    }
    private static int getMinimumNumber(List<Integer> myArrlist) {
        int minNum = 0;
        for (int i = 0; i < myArrlist.size() - 1; i++) {
            if(myArrlist.get(i) < myArrlist.get(i+1)){
                minNum = myArrlist.get(i);
            }
        }
        return minNum;
    }
    private static void resetArrayList(List<Integer> myArrList) {
        myArrList.clear();
    }
    private static void findNumber(List<Integer> newArrNum) {
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
