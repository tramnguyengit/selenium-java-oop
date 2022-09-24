package lesson_06;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
/*        String myPassword = "123myPassword";
       char[] myCharacterss = myPassword.toCharArray();
        System.out.println(Arrays.toString(myCharacterss));*/

        //Literal declaration
        /*String s1 = "Cat";
        String s2 = "Cat";
        System.out.println(s1);
        System.out.println(s2);*/

        //via String Object
        /*String s3 = new String("Cat");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));*/

    /*    String badWordContainer = " bad, very bad, something else!!!";
        badWordContainer.replace("bad", "b***");
        System.out.println(badWordContainer.replace("bad", "b***"));

        //substring
        String url = "https:fesfe";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));
        System.out.println(url.indexOf("o"));
        String[] splitStr = url.split("o");
        System.out.println(Arrays.toString(splitStr));*/

        String cookingTimeStr = "100mins";
        String cookingTimeNumStr = cookingTimeStr.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);
        System.out.println(Integer.parseInt(cookingTimeNumStr) + 1);
        String s1 = "hello";
        System.out.println(s1.concat( "Teo") + ", my name is ....".concat("asdasd"));

    }
}
