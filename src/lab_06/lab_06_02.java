package lab_06;

import java.util.Scanner;

public class lab_06_02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String inputPassword = scanner.nextLine();
        int count = 1;
        for (int i = 0; i < 3; i++) {
            if (checkPasswordIsMatch(myPassword, inputPassword) && count <= 3) {
                System.out.println("Correct");
                break;
            } else if (count < 3) {
                System.out.println("Incorrect");
                count++;
                System.out.println("Please re-enter your password:");
                inputPassword = scanner.nextLine();
            } else
            {
                System.out.println("Game Over");
            }
        }

    }

    private static boolean checkPasswordIsMatch(String myPassword, String inputPassword) {
        if(inputPassword.equals(myPassword)){
            return true;
        }
        return false;
    }


}
