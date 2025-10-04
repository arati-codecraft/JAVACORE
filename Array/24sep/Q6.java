/*
Q6. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/

import java.util.*;
public class Q6
{
    public static void main (String args[])
      {
         Scanner sc=new Scanner (System.in);
          System.out.println("Enter the size of array");
          int n=sc.nextInt();
        
          System.out.println("enter the elements of array ");
          int arr[]=new int[n];
          
           for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
             }
            int seclarg=0,larg=0;
           for (int i = 0; i < n; i++) 
          {
            if (arr[i] > larg)
              {
                seclarg = larg; 
                larg = arr[i];
               } 
           else if (arr[i] > seclarg && arr[i] < larg)
              {
                seclarg = arr[i];
               }
          }
       
         for (int i=0;i<n;i++)
           {
              System.out.print(seclarg+"  is the second largest element");
              break;
           }
      }
}