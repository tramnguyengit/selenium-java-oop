package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        //1st approach
        if(userInput == 1){
            System.out.println("Giai Nhat");
        } else if(userInput == 1) {
            System.out.println("Giai Nhi");
        } else if(userInput == 1) {
            System.out.println("Giai Ba");
        } else {
            System.out.println("Nhap lui roi Teo oi");
        }

        //2nd approach
        switch(userInput){
            case 1:
                System.out.println("Giai Nhat");
                break;
            case 2:
                System.out.println("Giai Nhi");
                break;
            case 3:
                System.out.println("Giai Ba");
                break;
            default:
                System.out.println("Nhap lui roi Teo oi");
        }

        switch(userInput){
            case 1:
            case 2:
            case 3:
                System.out.println("Giai Ba");
                break;
            default:
                System.out.println("Nhap lui roi Teo oi");
        }

    }
}
