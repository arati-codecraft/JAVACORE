/*Q9. Write a Java program to count how many even numbers are present in an array.
Return the count.
*/

import java.util.*;
public class Q9
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
		
		int c=CuntEvn(arr);
		System.out.println("total count of even number "+ c);
		
  }
  public static int CuntEvn(int arr[])
  {
    int count=0;
	for(int i=0;i<arr.length;i++)
	{
	  if (arr[i]%2==0)
	  {
	    count=count+1;
	  }
	}
	return count;
  }
}