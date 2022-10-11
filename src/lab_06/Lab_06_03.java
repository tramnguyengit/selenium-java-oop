package lab_06;

import lab_runable.Lab_06_Test;

import java.util.*;

public class Lab_06_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string: ");
        String myStr = scanner.nextLine();
        char[] myCh = myStr.toCharArray();
        System.out.println(Arrays.toString(myCh));
        Lab_06_Test.trimDigit(myCh);
    }
}
