/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
*/

import java.util.Scanner;

public class StrongNumApp1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        int temp = no;
        int sum = 0;

        while (no > 0) {
            int rem = no % 10;
            no = no / 10;
            int fact = 1;
            int i = 1;
           while( i <= rem) {
                fact *= i;
                 i++;
            }
            sum += fact;
        }

        if (sum == temp) {
            System.out.println("The number is strong");
        } else {
            System.out.println("The number is not strong");
        }
    }
}
