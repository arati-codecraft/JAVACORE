/*
Q2.Write a java program count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();

        int count = 0;

 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }

        System.out.println("Total pairs = " + count);
    }
}