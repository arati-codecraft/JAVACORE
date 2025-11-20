//Q6. Write a Java program to find and return the maximum element from an integer array.Use a function that returns the maximum value.

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = MaxEle(arr);
        System.out.println("Maximum element in the array is: " + maxValue);
    }

    public static int MaxEle(int[] arr) {
        int max = arr[0]; // Start with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}