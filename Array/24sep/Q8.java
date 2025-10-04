/*
Q8. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Non-zero values are: ");
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) 
             {       
                System.out.print(a[i] + " ");
            }
        }
    }
}
