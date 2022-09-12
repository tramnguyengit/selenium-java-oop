package lab_02;

import java.util.Scanner;

public class lab_2_2 {
    public static void main(String[] args) {
        //Allow user to input a number, print out it’s an odd or even number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer: ");
        float inputNum = scanner.nextInt();
        if (inputNum % 2 ==0 ){
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }

    }
}
