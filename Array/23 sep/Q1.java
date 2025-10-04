/*Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
Explanation:
First, we take the size of the array from the user.
Then, elements are entered one by one into the array.
Finally, using a loop, we display all elements in the same order they were entered.*/

import java.util.*;
public class Q1
{
    public static void main(String args[])
            {
               Scanner sc=new Scanner (System.in);
               System.out.println("Enter the size of array");
                int n=sc.nextInt();
               int a[]=new int[n];
               System.out.println("Enter the five element of array ");
                
               for (int i=0;i<n;i++)
                   {
                       a[i]=sc.nextInt();
                       System.out.print(a[i]);
                   }
            }
}


