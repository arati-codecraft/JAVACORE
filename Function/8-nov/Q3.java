/*
Q3. Write a Java program to reverse an array using a function.
Example Input:
arr = {5, 10, 15, 20, 25}
Output:
Reversed Array: 25 20 15 10 5
*/

import java.util.Scanner;

public class Q3 
{
    // Function to reverse the array
    public static void reverseArray(int[] arr) 
	{
        int start = 0;
        int end = arr.length - 1;

        while (start < end) 
		{
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

   
        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) 
		{
            System.out.print(arr[i] + " ");
        }

    }
}