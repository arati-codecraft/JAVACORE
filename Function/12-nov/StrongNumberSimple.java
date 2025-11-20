//Q32. Write a java program to display 1 to nth Strong Number.

import java.util.Scanner;

public class StrongNumberSimple {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Recursive method to calculate sum of digit factorials
    static int sumFactorials(int num) {
        if (num == 0)
            return 0;
        int digit = num % 10;
        return factorial(digit) + sumFactorials(num / 10);
    }

    // Recursive method to check and print strong numbers up to limit
    static void printStrongNumbers(int current, int limit) 
	{
        if (current > limit)
            return;

        if (current == sumFactorials(current))
            System.out.println(current);

        printStrongNumbers(current + 1, limit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = sc.nextInt();

        System.out.println("Strong Numbers up to " + n + ":");
        printStrongNumbers(1, n);

        sc.close();
    }
}