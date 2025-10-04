/*
Q6. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 
*/
import java.util.*;
public class Q6
{     public static void main(String x[])
	  { Scanner sc  = new Scanner(System.in);
             System.out.println("Enter the size of array");
             int n=sc.nextInt();
	    int a[]=new int[n];
		System.out.println("Enter values in array");
		for(int i=0;i<a.length; i++)
		{
			    a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int i;
		for(i=1; i<a.length;i++)
		{   int count=0;
                    for (int j=0;j<n;j++)
                       {

			 if(a[i]==a[j])
			 {
                             count++;
			 }
                       }
                     if(count==1)  
                    {
		  System.out.print(a[i]+"  ");
                     }
		   }
		 
		
		 
	  }
}
