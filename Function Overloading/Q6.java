/*
Q6. Write an overloaded function compare() —
Version 1: accepts a single integer array and checks if it is symmetric (first element = last element, etc.).


Version 2: accepts two integer arrays and checks whether both arrays are identical (same size and same elements in order).
Input 1: [1, 2, 3, 2, 1] → Output: Symmetric Array
Input 2: [1, 2, 3], [1, 2, 3] → Output: Arrays are identical
*/

import java.util.*;
public class Q6
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("enter the size of an array1 to check weather it is symmetric or not");
	int s=sc.nextInt();
	int a1[]=new int[s];
	System.out.println("Enter the elements to the array");
	for (int i=0;i<a1.length;i++)
	{
	  a1[i]=sc.nextInt();
	  
	}
	
	System.out.println("enter the size of array");
	int s1=sc.nextInt();
	int a2[]=new int[s1];
	int a3[]=new int[s1];
	
	System.out.println("Enter the elements to the array1 ");
	for (int i=0;i<a1.length;i++)
	{
	  a2[i]=sc.nextInt();
	  a3[i]=sc.nextInt();
	}
	
	String msg=compare(a1)==1?"Array is Symmetric":"Array is not Symmetric";
   System.out.println(msg);
   
   String result=compare(a2,a3)==1?"Array is identical":"Array is not identical";
   System.out.println(result);
	
	
  }
  public static int compare(int a1[])
  {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) 
	{
        if (arr[left] != arr[right])
	    {
            return -1; 
        }
        left++;
        right--;
    }
    return 1;
  }
  public static int compare( int a2[],int a3[])
  {
    for(int i=0;i<a2.length;i++)
	{
	  for (int j=0;j<a3.length;j++)
	  {
	    if(a2[i]==a3[j])
		{
		 return 1;
		}
	  }
	}
	return -1;
  }
}