
//Q14. Write a Java program to find and return the sum of all elements placed at even index positions (0, 2, 4, …) in an array.
import java.util.*;
public class Q14
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
		
		int c=SumEvn(arr);
		System.out.println("total sum of even number "+ c);
		
  }
  public static int SumEvn(int arr[])
  {
    int sum=0;
	for(int i=0;i<arr.length;i++)
	{
	  if (i%2==0)
	  {
	    sum=sum+arr[i];
	  }
	}
	return sum;
  }
}