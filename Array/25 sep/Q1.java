/*Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.*/

import java.util.*;
public class Q1
{
   public static void main(String args[])
       {
          Scanner sc=new Scanner (System.in);
          System.out.println("enter the size of array");
          int s=sc.nextInt();
          
           System.out.println("Enetr the element of array");
           int a[]=new int[s];          
 
          for (int i=0;i<s;i++)
             {
                a[i]=sc.nextInt();
             }
             for (int i=0;i<s;i++)
                {   int c=1;
                    for (int j=i+1;j<s;j++)
                       {
                          if (a[i]==a[j])
                              {
                                 c++;
                                 a[j]=-1;
                              }
                       }
                      if (a[i]!=-1)
                          {
                           System.out.println("frequency of "+ a[i] +"---->"+ c +"times");
                          
                        }
                 }
          
          
 
        }
   
}
