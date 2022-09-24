package lab_06;

import java.util.Scanner;

public class lab_06_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the time");
        String inputTimeStr = scanner.nextLine();
        int indexAndWord = inputTimeStr.indexOf("and");
        String leftStr = inputTimeStr.substring(0, indexAndWord);
        String rightStr = inputTimeStr.substring(indexAndWord, inputTimeStr.length());
        if (leftStr.contains("hrs") || leftStr.contains("hours") || leftStr.contains("hr") || leftStr.contains("hour")) {
            String hour = leftStr.replaceAll("[^0-9]", "");
            String min = rightStr.replaceAll("[^0-9]", "");
            System.out.println(Integer.parseInt(hour) * 60 + Integer.parseInt(min));
        }
    }
}
