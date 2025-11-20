/*
Q11. Write a Java program to search for an element in an array and return its index position.
If the element is not found, return -1.
*/

import java.util.*;

public class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search:");
        int sk = sc.nextInt();

        int index = SearchEle(arr, sk);
        if (index != -1) 
		{
            System.out.println("Element found at index: " + index);
        } 
		else 
		{
            System.out.println("Element not found.");
        }
    }

    public static int SearchEle(int[] arr, int sk) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sk) {
                return i; 
            }
        }
        return -1; 
    }
}