package lab_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        // <18 | 18-55 | > 55 (2 bottles only)
        final int MIN_VALID_AGE = 18;
        final int MAX_VALID_AGE = 55;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18) {
            System.out.println("Khong duoc phep mua");
            if(clientAge <=12){
                System.out.println("Calling 911...");
            }

        } else if (clientAge <= 55) {
            System.out.println("Unlimited");
        } else {
            System.out.println("Limited 2 bottles");
        }

    }
}
