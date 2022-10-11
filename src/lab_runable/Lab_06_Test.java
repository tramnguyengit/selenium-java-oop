package lab_runable;

import java.util.ArrayList;
import java.util.List;

public class Lab_06_Test {

    public static void calculateMin(String inputTimeStr) {
        int indexAndWord = inputTimeStr.indexOf("and");
        String leftStr = inputTimeStr.substring(0, indexAndWord);
        String rightStr = inputTimeStr.substring(indexAndWord);
        if (leftStr.contains("hrs") || leftStr.contains("hours") || leftStr.contains("hr") || leftStr.contains("hour")) {
            String hour = leftStr.replaceAll("[^0-9]", "");
            String min = rightStr.replaceAll("[^0-9]", "");
            System.out.println(Integer.parseInt(hour) * 60 + Integer.parseInt(min));
        }
    }

    public static boolean checkPasswordIsMatch(String myPassword, String inputPassword) {
        return inputPassword.equals(myPassword);
    }

    public static void trimDigit(char[] myCh){
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

    public static void checkHttpDomain(String url){
        String protocol, subDomain, domain;
        protocol = url.substring(0, url.indexOf(":"));
        domain = url.substring(url.indexOf(".") + 1);
        subDomain = url.substring(url.indexOf("//") + 2, url.indexOf("."));
        if (url.contains("https") || url.contains("http")) {
            System.out.println("Your protocol is: " + protocol);
        }
        if (url.contains(".com") || url.contains(".net")) {
            System.out.println("Your domain is: " + domain);
        } else {
            System.out.println("Your protocol is not http or https");
            System.out.println("Your domain is not .com or .net");
        }
        System.out.println("Subdomain is: " + subDomain);
    }

}
