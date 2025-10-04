/* Q5. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]

Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending.
*/

import java.util.*;
public class Q5
{
      public static void main (String args[])
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
          for (int i=0;i<n;i++)
             {
                for (int j=i+1;j<a.length;j++)
                   {
                       if(a[i]>a[j])
                          {
                              int temp=a[i];
                             a[i]=a[j];
                             a[j]=temp;
                           }
                    }
              }
             System.out.println("Ascending order");
             for (int i = 0; i < n; i++) 
          {
            System.out.print(a[i] + " ");
        }
      System.out.println();
      
       for (int i=0;i<n;i++)
             {
                for (int j=i+1;j<a.length;j++)
                   {
                       if(a[i]<a[j])
                          {
                              int temp=a[i];
                             a[i]=a[j];
                             a[j]=temp;
                           }
                    }
              }
             System.out.println("desending order");
             for (int i = 0; i < n; i++) 
          {
            System.out.print(a[i] + " ");
        }


        }
}