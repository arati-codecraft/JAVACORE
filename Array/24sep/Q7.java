/*
Q7. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :                                           200

	Expected Output : The new list is : 1 2 200 3 4 5
*/

import java.util.*;
public class Q7
{
	public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	   int a[]=new int[6];
	   System.out.println("Enter five values in array");
	   for(int i=0; i<(a.length-1); i++)
	   {
		    a[i]=xyz.nextInt();
	   }
	   System.out.println("Display array before insertion");
	   for(int i=0; i<a.length; i++)
	   { System.out.printf("a[%d] ----> %d\n",i,a[i]);
	   }
	   System.out.println("Enter index and value");
	   int index=xyz.nextInt();
	   int value=xyz.nextInt();
	   for(int i=(a.length-2); i>=index;i--)
	   {
		     a[i+1]=a[i];
	   }
	   a[index]=value;
	   System.out.println("Display array after insertion");
	   for(int i=0; i<a.length; i++)
	   { System.out.printf("a[%d] ----> %d\n",i,a[i]);
	   }
	   
	}
}
