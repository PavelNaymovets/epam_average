package com.epam.rd.autotasks;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int arr = 0;
        for (int i = 0; i < str.length; i++) {
            arr += Integer.parseInt(str[i]);
        }
        System.out.println(arr/(str.length - 1));
    }

}