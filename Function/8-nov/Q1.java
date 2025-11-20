/*Q1. Write a Java program to find the second largest number in an array using a function.
 Example Input:
 arr = {12, 45, 23, 51, 19, 8}
 Output:
 Second Largest: 45
Explanation:
Sort or traverse the array to find the largest and second largest values.


Function findSecondLargest() scans the array and updates two variables — first and second.
*/

import java.util.*;
public class Q1
{
    public static void SecLarNum(int larg,int seclarg)
	{
           for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
             }
            int seclarg=0,larg=0;
           for (int i = 0; i < n; i++) 
          {
            if (arr[i] > larg)
              {
                seclarg = larg; 
                larg = arr[i];
               } 
           else if (arr[i] > seclarg && arr[i] < larg)
              {
                seclarg = arr[i];
               }
          }
       
         for (int i=0;i<n;i++)
           {
              System.out.print(seclarg+"  is the second largest element");
              break;
           }
		}
      public static void main (String args[])
      {
         Scanner sc=new Scanner (System.in);
          System.out.println("Enter the size of array");
          int n=sc.nextInt();
        
          System.out.println("enter the elements of array ");
          int arr[]=new int[n];
		  
		  SecLarNum(larg,seclarg);
       } 
}