/*
Q3. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/

import java.util.*;
public class Q3
{
   public static void main(String args[]);
    {
       Scanner sc=new Scanner sc.nextInt();
       System.out.println("Enter the size of array");
       int s=sc.nextInt();
      
       Syste.out.println("enter the element of array");
       int a[]=new int[s];
        
       for(int i=0; i<s ;i++)
	   {      a[i]=xyz.nextInt();
	   }
       
       int max=a[0];
	   for(int i=1; i<s; i++)
	   {
		     if(a[i]>max)
			 { max=a[i];
			 }
	   }
       
       int min=a[0];
              for(int i=1; i<s; i++)
	   {
		     if(a[i]<min)
			 { min=a[i];
			 }
	   }

    }
}