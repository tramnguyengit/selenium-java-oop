package lab_02;

import lab_runable.Lab_02_Test;

import java.util.Scanner;

public class Lab_2_2 {

    public static void main(String[] args) {
        //Allow user to input a number, print out it’s an odd or even number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer: ");
        float inputNum = scanner.nextInt();
        Lab_02_Test.checkOddOrEven(inputNum);
    }



}
