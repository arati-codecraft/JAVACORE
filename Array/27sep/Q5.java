/*
Q5. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5

Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.

*/

import java.util.*;
public class Q5
{
    public static void main(String args[])
      {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the size of array");
         int s=sc.nextInt();
         
        System.out.println("enter the element of array");
        int a[]=new int[s];

        for(int i=0;i<s;i++)
           {
              a[i]=sc.nextInt();
           }
           
          
          for(int i=0;i<s;i++)
              {   boolean flag=false;
                 for(int j=i+1;j<s;j++)
                    {
                        if(a[i]==a[j])
                         {
                           System.out.print("first repeated  array element is  "  +a[i]);
                          break;
                         }
                     
                      }
                               
              }
       }
}
