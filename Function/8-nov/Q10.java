//Q10. Write a Java function that returns the sum of all positive numbers present in an array.

import java.util.*;
public class Q10
{
  public static void main(String args[])
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
		
		int S=SumPos(arr);
		System.out.println("total sum of all +ve number "+ S);
		
  }
  public static int SumPos(int arr[])
  {
    int sum=0;
	for(int i=0;i<arr.length;i++)
	{
	  if (arr[i]>0)
	  {
	    sum +=arr[i];
	  }
	}
	return sum;
  }
}