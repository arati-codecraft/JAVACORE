/*
Q9.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/

import java.util.*;
public class Q9
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
                           flag=true;
                           break;
                         }
                     
                      }
                if(flag==false)
                     {
                       System.out.print(a[i]+"  ");
                     }
                 
              }
       }
}
