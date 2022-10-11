package lab_runable;

public class Lab_02_Test {

    public static void calculateBMI(float userHeight, float userWeight){
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

    public static void checkOddOrEven(float inputNum){
        if (inputNum % 2 ==0 ){
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }
    }
}
