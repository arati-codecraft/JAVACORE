//Q21.  Write a java program to check Number Is Prime Number or Not.

import java.util.*;

public class Q21{

    // Recursive function to check prime
    static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2)
            return (n == 2);  // 2 is prime
        if (n % i == 0)
            return false;     // divisible -> not prime
        if (i * i > n)
            return true;      // no divisors till sqrt(n) -> prime

        // Recursive call
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n, 2))
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is Not a Prime Number");
    }
}