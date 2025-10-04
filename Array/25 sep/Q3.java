/*
Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:
*/
import java.util.*;

public class Q3 
{
    public static void main(String args[]) 
      {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
             for (int i = 0; i < n; i++)
             {
                a[i] = sc.nextInt();
              }

        System.out.println("Enter the number of positions to rotate the array:");
        int p = sc.nextInt();

                p = p % n;

           for (int i = 0; i < p; i++)
           {
               int temp = a[0];
                for (int j = 0; j < n - 1; j++) 
              {
                a[j] = a[j + 1];
               }
            a[n - 1] = temp;
         }

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) 
          {
            System.out.print(a[i] + " ");
        }
    }
}