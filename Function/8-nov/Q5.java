/*
Q5. Write a Java program that finds the sum of even and odd elements in an array using functions.
Example Input:
arr = {10, 15, 8, 7, 9, 12}
Output:
Sum of Even: 30  
Sum of Odd: 31
*/

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = sc.nextInt();
        }

        int evenSum = sumEven(arr);
        int oddSum = sumOdd(arr);

        System.out.println("Sum of Even: " + evenSum);
        System.out.println("Sum of Odd: " + oddSum);
    }

    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumOdd(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}