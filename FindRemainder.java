package com.javalab;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("First Java Program");
        // Get the total nos.
        int loopCount = sc.nextInt();//loopcount =2

        sc.nextLine();

        // Declare the varaible to hold the numbers 11%5=1 12%5=2
        String data[] = new String[loopCount];

        // Get the individual numbers
        for (int i = 0; i < loopCount; i++) {
            data[i] = sc.nextLine();
        }

        // Split the String
        for (int i = 0; i < loopCount; i++) {
            String temp[] = data[i].split(" ");
            // Find the remainder
            int remainder = Integer.parseInt(temp[0]) % Integer.parseInt(temp[1]);
            System.out.println(remainder);
        }

    }
}
