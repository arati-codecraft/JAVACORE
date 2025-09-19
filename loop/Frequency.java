//Q34. Write a java program to find the frequency of each digit in a given integer.

import java.util.*;

public class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Frequency of each digit in " + n + ":");

        for (int i = 0; i <= 9; i++) {
            int temp = n;
            int count = 0;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == i) {
                    count++;
                }
                temp /= 10;
            }

            if (count > 0) {
                System.out.println("Frequency of " + i + " is " + count);
            }
        }
    }
}