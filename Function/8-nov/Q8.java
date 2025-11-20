/*
Q8. Write a Java function that returns the average value of all elements in an array.
*/

import java.util.*;
public class Q8
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
		
	int Average=AvgArr(arr);
	System.out.println("average of all array elements"+ Average);
	
		
  }
  public static int AvgArr(int arr[])
  { int sum=0;
    int avg=0;
    for(int i=0;i<arr.length;i++)
	{
	  sum +=arr[i];
	  avg=sum/arr.length;
	}
	return avg;
  }
  
}