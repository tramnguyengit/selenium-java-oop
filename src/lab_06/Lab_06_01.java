package lab_06;

import lab_runable.Lab_06_Test;

import java.util.Scanner;

public class Lab_06_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the time");
        String inputTimeStr = scanner.nextLine();
        Lab_06_Test.calculateMin(inputTimeStr);
    }
}
