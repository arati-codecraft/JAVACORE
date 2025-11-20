//Q7. Write a Java program to return the smallest number from an array using a function.
import java.util.*;

public class Q7{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) 
		{
            arr[i] = sc.nextInt();
        }

        int minValue = MinEle(arr);
        System.out.println("Minimum element in the array is: " + minValue);
    }

    public static int MinEle(int[] arr) 
	{
        int min = arr[0]; // Start with the first element
        for (int i = 1; i < arr.length; i++) 
		{
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}