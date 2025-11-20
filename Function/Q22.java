/*Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. 
The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/

import java.util.Scanner;

public class Q22 {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's perfect: ");
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is NOT a Perfect Number.");
        }
    }
}
