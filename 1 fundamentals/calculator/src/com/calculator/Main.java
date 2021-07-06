package com.calculator;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// acces modifie returnType  Class Main{} ( pascal naming  convention )
// ClassName
// main function void main(){} ( camel naming  convention )
public class Main {

    public static void main(String[] args) {
        byte age = 25;
        long viewsCount = 9_123_443_224L;
        float price = 24.89F;
        char letter = 'L';
        String letters = new String("Hello world");
        String shortstring;
        shortstring = "Hello world" + "!";
        boolean isEligible = true;
        Date now  = new Date();
        int[] numbers_arraySizeTo5 =  new int[5];
        int[] numbers = { 1, 2 , 3 }; // once created [] has a fix lentgh
        int[][] array_multiDimen = new int[2][3]; // 2 rows 3 columns
        int[][] array_multiDimen2 = {{ 1, 2 }, { 1, 2 , 3}}; // 2 rows 3 columns
        boolean isTrue = shortstring.endsWith("!"); // true
        int lentgh = shortstring.length(); // true
        String rpl = shortstring.replace("!","*"); // true

        final float thisConstant = 23.05F;
        int result = (int)Math.floor(23.05F);

        // System.out.println(shortstring);
        // System.out.println(rpl);
        numbers_arraySizeTo5[0] =  1;
        // System.out.println(Arrays.toString(numbers_arraySizeTo5));
        Arrays.sort(numbers);
        array_multiDimen[0][0] = 1;
        // System.out.println(Arrays.deepToString(array_multiDimen2));

        // Formating numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultCurrency  = currency.format(3440.003);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String resultPercent  = percent.format(.556);
        // System.out.println(resultPercent);

        // Reading input
        Scanner scanner = new Scanner(System.in); // reading from the terminal windows with System.in
        System.out.print("Name: ");
        // byte user_age = scanner.nextByte();
        String name = scanner.nextLine().trim();
        System.out.println("You are"  + " " + name);

    }
}
