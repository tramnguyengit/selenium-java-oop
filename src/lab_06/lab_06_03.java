package lab_06;

import java.sql.SQLOutput;
import java.util.*;

public class lab_06_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string: ");
        String myStr = scanner.nextLine();
        char[] myCh = myStr.toCharArray();
        System.out.println(Arrays.toString(myCh));
        List<Character> digitCharArr = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : myCh) {
            if (Character.isDigit(character)) {
                digitCharArr.add(character);
                stringBuilder.append(character);
            } else
                continue;
        }
        System.out.println(stringBuilder);
    }


}
