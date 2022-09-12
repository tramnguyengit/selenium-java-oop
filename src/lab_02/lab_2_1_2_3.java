package lab_02;

import java.util.Scanner;

public class lab_2_1_2_3 {
    //    Get input from user about height(m) and weight(kg) then calculate BMI
//
//    Underweight = <18.5
//    Normal weight = 18.5 – 24.9
//    Overweight = 25–29.9
//    Obesity = BMI of 30 or greater
//    BMI = weight / (height x 2)
    //Suggest user to increase/decrease weight
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height: ");
        float userHeight = scanner.nextFloat();
        System.out.println("Please input your weight: ");
        float userWeight = scanner.nextFloat();
        float userBMI = userWeight / (userHeight * 2);
        if(userBMI <= 18.5) {
            System.out.println("Your BMI is: " + userBMI);
            double newWeight = 18.6*(userHeight *2);
            double increaseWeight = newWeight - userWeight;
            System.out.println("You are underweight, you need to increase at least " + increaseWeight + "kg" );
        }
       if (userBMI > 18.5 && userBMI <= 24.9) {
            System.out.println("Your BMI is: " + userBMI);
            System.out.println("You are normal weight, keep it");
        }
       else if (userBMI >= 25 && userBMI <= 29.9) {
           System.out.println("Your BMI is: " + userBMI);
           double newWeight = 18.6*(userHeight *2);
           double decreaseWeight = userWeight - newWeight;
           System.out.println("You are overweight, you need to decrease at least " + decreaseWeight + "kg" );
       } else if (userBMI >= 30){
           System.out.println("Your BMI is: " + userBMI);
           double newWeight = 18.6*(userHeight *2);
           double decreaseWeight = userWeight - newWeight;
           System.out.println("You are obesity, you need to increase at least " + decreaseWeight + "kg" );

       }




    }

}




