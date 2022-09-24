package lab_05;

import java.util.*;

public class lab_05 {
    public static void main(String[] args) {
        List<Integer> myArrNum = new ArrayList<>();
        System.out.println("Please enter several number");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int fourthNum = scanner.nextInt();
        myArrNum.add(firstNum);
        myArrNum.add(secondNum);
        myArrNum.add(thirdNum);
        myArrNum.add(fourthNum);
        System.out.println("Your list Number is: " + myArrNum);
        Set<Integer> set = new HashSet<>(myArrNum);
        System.out.println("Your list after sorting: "+ set);
        List<Integer> newArrNum = new ArrayList<>(set);
        int length = newArrNum.size();
        System.out.println("Minimum number is: " + newArrNum.get(0));
        System.out.println("Minimum number is: " + newArrNum.get(length - 1));
       findNum(newArrNum);

    }
    private static void findNum(List<Integer> newArrNum){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int searchNum = scanner.nextInt();
        newArrNum.contains(searchNum);
        if(newArrNum.contains(searchNum)){
            System.out.println("The position of your number is: " + newArrNum.indexOf(searchNum));

        } else {
            System.out.println("There is no this number in list");
        }
    }

}
