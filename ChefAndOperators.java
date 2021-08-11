//Explain Scanner class for taking input
//Explain for loop

package com.javalab;

import java.util.Scanner;

public class ChefAndOperators {
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n ;i++) {
            int A = s.nextInt();
            int B = s.nextInt();

            if(A < B){
                System.out.println("<");
            } else if (A > B){
                System.out.println(">");
            }  else {
                System.out.println("=");
            }

        }
    }

}
