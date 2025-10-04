/*Q4. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/

import java.util.*;
public class Q4
{
   public static void main (String args[])
     {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int s=sc.nextInt();
 
        System.out.println("Enter the element of array ");
        int a[]=new int[s];
        
       for (int i=0;i<a.length;i++)
          {
              a[i]=sc.nextInt();
           }
           
       for (int i=0;i<a.length-1;i++)
          {
                 if (a[i]+1==a[i+1])
                      {
                          continue;
                       }
                    else
                 {
                   System.out.println("missing element "+(a[i]+1));
                    break;
                 }

                
          }
      }
}