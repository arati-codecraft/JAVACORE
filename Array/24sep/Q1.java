/*Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output:
 Element 30 found at index 2
Explanation:
 We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/

import java.util.*;
public class Q1
{
  public static void main (String args[])
    {
      Scanner sc=new Scanner (System.in);
       System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element of array");
       int a[]=new int[n];
       
    for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
         }
       System.out.println("enter the element you want to search");
               int sk=sc.nextInt();
               boolean flag =false;  
        for(int i=0;i<n;i++)
        { 
           
           if(sk==a[i] || flag)
             {
               
               System.out.print(" element"+sk+" found at index "+i);
                flag=true;
                break;
               
             }
            
        }
       if(!flag) 
               {
                  System.out.println("no is not found ");
                           
               }

       

     }
}
