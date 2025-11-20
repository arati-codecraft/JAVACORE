//Q20. Write a java program to swap first and last digits of a number.

// Q20. Write a java program to swap first and last digits of a number (no String, no Math.pow)

import java.util.*;

public class Q20 {

    public static int swapFirstLastDigit(int n) {
        int num = n;
        int lastDigit = num % 10;

        // Find first digit and count of digits
        int firstDigit = num;
        int digits = 0;
        while (firstDigit >= 10) {
            firstDigit /= 10;
            digits++;
        }

        // If single-digit number, return as is
        if (n < 10)
            return n;

        // Find divisor = 10^digits (without Math.pow)
        int divisor = 1;
        for (int i = 0; i < digits; i++) {
            divisor *= 10;
        }

        // Remove first digit and last digit
        int middle = n % divisor;     // removes first digit
        middle = middle / 10;         // removes last digit

        // Rebuild the swapped number
        int swapped = lastDigit * divisor + middle * 10 + firstDigit;

        return swapped;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = swapFirstLastDigit(num);
        System.out.println("Number after swapping first and last digits: " + result);
    }
}
