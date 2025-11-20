//Q31. Write a java program to display 1 to nth Duck Number.

import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Duck Numbers from 1 to " + n + ":");
        printDuckNumbers(1, n);
    }

    // Recursive function to print Duck Numbers from current to n
    public static void printDuckNumbers(int current, int n) {
        if (current > n) return;

        if (isDuckNumber(current)) {
            System.out.println(current);
        }

        printDuckNumbers(current + 1, n);
    }

    // Function to check if a number is a Duck Number without using Integer.toString
    public static boolean isDuckNumber(int num) {
        boolean hasZero = false;
        int temp = num;

        // Remove leading digits until first non-zero is found
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                hasZero = true;
            }
            temp /= 10;
        }

        // Duck number must not start with zero (not possible in int) and must contain at least one zero
        return hasZero;
    }
}