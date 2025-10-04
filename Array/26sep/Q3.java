/*
Q3. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.
*/
import java.util.*;
public class Q3
{    public static void main(String x[])
	{ int a[]=new int[]{1,2,3};
	   int b[]=new int[]{2,3,4,5};
	   int c[]=new int[a.length+b.length];
	   for(int i=0,j=a.length,k=0; i<b.length;j++,k++)
       {
	        if(i<a.length)
			{
               c[i]=a[i];
			   i++;
			}
			if(j==c.length)
			{ break;
			}
			c[j]=b[k];
       }	
	     Arrays.sort(c);
		int i,count;
		for(i=1,count=0; i<c.length; i++)
		{
			 if(c[i]!=c[i-1])
			 { c[count++]=c[i-1];
			 }
		}
		 c[count]=c[i-1];
		 int d[]=new int[count+1];
		 System.out.println("Display c array");
		for(i=0; i<=count; i++)
		{ d[i]=c[i];
		} 
		c=null;
		System.gc();//garbage collection
		for(i=0; i<d.length; i++)
		{System.out.printf("%d\t",d[i]);
		} 
	}
	
}
