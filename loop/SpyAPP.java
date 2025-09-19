/*
Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8*/



import java.util.Scanner;

public class SpyAPP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        int temp = no;
        int sum = 0;
        int pro = 1;

        while (no > 0) {
            int rem = no % 10;
            no = no / 10;
            sum += rem;
            pro *= rem;
        }

        if (sum == pro) {
            System.out.println("Number is spy");
        } else {
            System.out.println("Number is not spy");
        }
    }
}
