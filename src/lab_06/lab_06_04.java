package lab_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab_06_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your url");
        String url = scanner.nextLine();
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
