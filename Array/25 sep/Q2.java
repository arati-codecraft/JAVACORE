/*
Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
*/ 

import java.util.*;
public class   Q2
{
    public static void main (String args[])
     {
          Scanner sc=new Scanner (System.in);
          System.out.println("Enter the size of array");
          int s=sc.nextInt();

          System.out.println("enter the elements of array");
         int a[]=new int[s];
         
        for (int i=0;i<s;i++)
            {
                a[i]=sc.nextInt();
            }
             
              int  majoEle=-1;
             for ( int i=0;i<s;i++)
                {   int c=0;
                    for (int j=i+1;j<s;j++)
                       {
                          if (a[i]==a[j])
                              {
                                 c++;
                                 
                              }
                     }
                
                     if (c>s/2)
                      {
                         majoEle=a[i];
                         break;
                       }
                }
                     if (majoEle !=-1)
                         {
                           System.out.print("mjority element"+majoEle);
                          }
                       else 
                         {
                            System.out.println("There are no Majority Elements in the given array");
                          }
                  
      
      }
}