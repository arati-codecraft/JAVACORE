/*
Q4. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8
*/

import java.util.*;
public class Q4
{
	public static void main(String[] args)
           {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i=0;
		System.out.println("Enter "+n+" elements: ");
		for( i = 0; i < arr.length; i++)
                  {
			arr[i] = sc.nextInt();
		    }
              int a=arr[0];
              int b=arr[1]-arr[0];
              int s=arr[0];
              int l=arr[1];
             
          
             for (  i=0;i<arr.length;i++)
                 {
                    int cd=arr[i]-a;
                    if(cd>b)
                     {
                        b=cd;
                        s=a;
                        l=arr[i];
                     }
                   if(arr[i]<a)
                     {
                        a=arr[i];
                      }
                  }
               System.out.println("The elements which provide maximum difference is"+ s +"," +l);
               System.out.println("The Maximum difference between two elements in the array is:"+ b);
            }
}