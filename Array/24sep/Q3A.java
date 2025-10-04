/*
Q3. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/

import java.util.*;
public class Q3A
{
   public static void main(String args[])
    {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the size of array");
       int s=sc.nextInt();
      
       System.out.println("enter the element of array");
       int a[]=new int[s];
        
       for(int i=0; i<s ;i++)
	   {      a[i]=sc.nextInt();
	   }
          
         
         for (int i=0;i<s-1;i++)
           {
             for (int j=a[i]+1;j<a[i+1];j++)
               {
                 System.out.print(j+"  ");
               }          
          }
    }
}