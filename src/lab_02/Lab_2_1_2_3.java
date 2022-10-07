package lab_02;

import lab_runable.Lab_02_Test;

import java.util.Scanner;

public class Lab_2_1_2_3 {

    //    Get input from user about height(m) and weight(kg) then calculate BMI
//
//    Underweight = <18.5
//    Normal weight = 18.5 – 24.9
//    Overweight = 25–29.9
//    Obesity = BMI of 30 or greater
//    BMI = weight / (height x 2)
    //Suggest user to increase/decrease weigh
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height: ");
        float userHeight = scanner.nextFloat();
        System.out.println("Please input your weight: ");
        float userWeight = scanner.nextFloat();
        Lab_02_Test.calculateBMI(userHeight, userWeight);
    }
}





