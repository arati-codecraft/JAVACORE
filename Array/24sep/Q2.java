/*
Q2. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/

import java.util.*;
public class Q2
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int s=sc.nextInt();

        System.out.println("enter the element of array");
         int a[]=new int[s];

        for (int i=0;i<s;i++)
           {
               a[i]=sc.nextInt();
           }

          int strt=0 , mid=a.length/2;
          int end=a.length-1;
        while (strt<mid)
 
           {
              int temp=a[strt];
              a[strt]=a[end];
              a[end]=temp;
           
             strt++;
             end--;
           }
           for(int i=0;i<s;i++)
          {
          System.out.print(a[i]+"\t");
          }
       
         
    
    }
}