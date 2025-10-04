/*
Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
*/
 import java.util.*;
 public class Q2
{
    public static void main (String args[])
     {
         Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int s=sc.nextInt();
 
        System.out.println("Enter the element of array ");
        int a[]=new int[s];
        int i=0;
       for ( i=0;i<a.length;i++)
          {
              a[i]=sc.nextInt();
           }
           
         for ( i=0;i<a.length;i++)
               {
                  if(a[i]==a[0] ||a[i] == a[s-1])
                     {
                         a[i]=0;
                          System.out.print(a[i]+" ");
                      }
                   else
                      {
                         System.out.print(a[i] +" ");
                      }
               }
            

     }
}