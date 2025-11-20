/*Q8. Overload cleanMerge() —
Version 1: accepts one array, removes duplicates, and prints the cleaned array.


Version 2: accepts two arrays, removes duplicates from both, merges them, and prints the final array in ascending order.
Input 1: [1, 2, 2, 3, 3, 4] → Output: [1, 2, 3, 4]
Input 2: [1, 2, 3], [2, 3, 4] → Output: [1, 2, 3, 4]
*/
import java.util.*;
public class Q8
{
  static int cleanMerge( int a[])
  {
    for(int i=0;i<a.length;i++)
	{
	  for(int j=i+1;j<a.length;j++)
	  {
	     if(a[i]!=a[j])
		 {
		   return a[i];
		   
		 }
	  }
	}
  }
  static void cleanMerge(int a1[],int a2[])
  {
    return;
  }
  public static void main (String args[])
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
	
	cleanMerge(a1);
	
	
    System.out.println("Enter the size for two array s1 and s2");
	int s1=sc.nextInt();
	
	
	int a2[]=new int[s1];
	int a3[]=new int[s1];
	
	System.out.println("enter the element in second array");
	for(int i=0;i<a2.length;i++)
	{
		a2[i]=sc.nextInt();
	}
	
	System.out.println("enter the element in third  array");
	for(int i=0;i<a3.length;i++)
	{
		a3[i]=sc.nextInt();
	}
	
	cleanMerge(a2,a3);
	
  }
  
}